package com.portfolio.fb.service;

import com.portfolio.fb.model.Language;
import com.portfolio.fb.repo.LanguageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LanguageService implements ILanguageService{
    private final LanguageRepo languageRepo;
    @Autowired
    public LanguageService(LanguageRepo languageRepo){
        this.languageRepo = languageRepo;
    }
    @Override
    public List<Language> getAllLanguages() {
        return languageRepo.findAll();
    }

    @Override
    public Language addLanguage(Language lang) {
        return languageRepo.save(lang);
    }

    @Override
    public Language getLanguageById(Long id) {
        return languageRepo.findById(id).orElse(null);
    }
    @Override
    public void deleteLanguageById(Long id) {
        languageRepo.deleteById(id);
    }

    @Override
    public Language updateLanguage(Language lang) {
        return languageRepo.save(lang);
    }

}
