package com.portfolio.fb.controller;

import com.portfolio.fb.model.Language;
import com.portfolio.fb.services.ILanguageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/languages")
public class LanguageController {
    private final ILanguageService ilanguageServ;

    public LanguageController(ILanguageService ilanguageServ) {
        this.ilanguageServ = ilanguageServ;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Language>> getAllLanguages(){
        return new ResponseEntity<>(ilanguageServ.getAllLanguages(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Language> addLanguage(@RequestBody Language lang){
        Language newLang = ilanguageServ.addLanguage(lang);
        return new ResponseEntity<>(newLang, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Language> getLanguageById(@PathVariable Long id){
        return new ResponseEntity<>(ilanguageServ.getLanguageById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteLanguageById(@PathVariable Long id){
        ilanguageServ.deleteLanguageById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Language> updateLanguage(@RequestBody Language lang)  {
        Language updatedLang = ilanguageServ.updateLanguage(lang);
        return new ResponseEntity<>(updatedLang, HttpStatus.OK);
    }
}
