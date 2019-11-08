package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class LanguageService {
	private LanguageRepository languageRepository;

    public LanguageService(LanguageRepository languageRepository){
        this.languageRepository = languageRepository;
    }
    
    public List<Language> allLangs() {
        return (List<Language>) languageRepository.findAll();
    }
    
    public void addLang(Language lang) {
    		languageRepository.save(lang);
    }
    
    public Language findLangById(Long id) {
    	Optional<Language> optionalBook = languageRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
   
    public void updateLang(Language lang) {
    		languageRepository.save(lang);
    }
    
    public void deleteLang(Long id) {
    		languageRepository.deleteById(id);
    }
}
