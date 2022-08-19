package com.portfolio.fb.security.jwt;

import com.nimbusds.jwt.JWT;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.JWTParser;
import com.portfolio.fb.security.dto.JwtDto;
import com.portfolio.fb.security.model.Admin;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Component
public class JwtProvider {
    private final static Logger logger = LoggerFactory.getLogger(JwtProvider.class);

    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private int expiration;

    public String generateToken(Authentication authentication){
        Admin admin = (Admin) authentication.getPrincipal();
        List<String> roles = admin.getAuthorities().stream().map(GrantedAuthority::getAuthority).toList();
        return Jwts.builder()
                .setSubject(admin.getUsername())
                .claim("roles",roles)
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + expiration))
                .signWith(SignatureAlgorithm.HS256,secret.getBytes())
                .compact();
    }

    public String getEmailFromToken(String token){
        return Jwts.parser().setSigningKey(secret.getBytes()).parseClaimsJws(token).getBody().getSubject();
    }

    public boolean validateToken(String token){
        try {
            Jwts.parser().setSigningKey(secret.getBytes()).parseClaimsJws(token);
            return true;
        }catch (MalformedJwtException e){
            logger.error("token malformed");
        }catch (UnsupportedJwtException e){
            logger.error("token not supported");
        }catch (ExpiredJwtException e){
            logger.error("token expired");
        }catch (IllegalArgumentException e){
            logger.error("token empty");
        }catch (SignatureException e){
            logger.error("fail in token signature");
        }
        return false;
    }

    public String refreshToken(JwtDto jwtDto) throws ParseException {
        try{
            Jwts.parser().setSigningKey(secret.getBytes()).parseClaimsJws(jwtDto.getToken());
        }catch(ExpiredJwtException e){
            JWT jwt = JWTParser.parse(jwtDto.getToken());
            JWTClaimsSet claims = jwt.getJWTClaimsSet();
            String username = claims.getSubject();
            List<String> roles = (List<String>) claims.getClaim("roles");
            return Jwts.builder()
                    .setSubject(username)
                    .claim("roles",roles)
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(new Date().getTime() + expiration))
                    .signWith(SignatureAlgorithm.HS256,secret.getBytes())
                    .compact();
        }
        return null;
    }
}
