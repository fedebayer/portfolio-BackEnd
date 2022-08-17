package com.portfolio.fb.security.jwt;

import com.portfolio.fb.security.model.Admin;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtProvider {
    private final static Logger logger = LoggerFactory.getLogger(JwtProvider.class);

    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private int expiration;

    public String generateToken(Authentication authentication){
        Admin admin = (Admin) authentication.getPrincipal();
        return Jwts.builder().setSubject(admin.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + expiration * 1000))
                .signWith(SignatureAlgorithm.HS256,secret)
                .compact();
    }

    public String getEmailFromToken(String token){
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
    }

    public boolean validateToken(String token){
        try {
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
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
}
