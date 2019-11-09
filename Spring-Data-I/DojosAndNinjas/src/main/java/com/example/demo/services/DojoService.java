package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Dojo;

import com.example.demo.repositories.DojoRepo;
@Service
public class DojoService {
	
	@Autowired
	private DojoRepo dojoRepo;
	public DojoService(DojoRepo dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	public void add(Dojo dojo) {
		dojoRepo.save(dojo);
	}
	public List<Dojo> all() {
		return (List<Dojo>) dojoRepo.findAll();
	}
	public Dojo getOne(Long id) {
		Optional<Dojo> optionalBook = dojoRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
	}

}
