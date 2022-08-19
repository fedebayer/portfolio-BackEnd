package com.portfolio.fb.service;

import com.portfolio.fb.model.Language;

import java.util.List;

public interface ILanguageService {
    List<Language> getAllLanguages();

    Language addLanguage(Language lang);

    Language getLanguageById(Long id);

    void deleteLanguageById(Long id);

    Language updateLanguage(Language lang);
}
