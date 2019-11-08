package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.example.demo.models.Person;
import com.example.demo.repositories.PersonRepository;

@Service
public class PersonService {
	
	private PersonRepository personRepository;
	private PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	public void addPerson(Person person) {
		personRepository.save(person);
	}
	public List<Person> getAllPersons(){
		return (List<Person>) personRepository.findAll();
	}
	public void deletePerson(Long id) {
		personRepository.deleteById(id);
	}
	public Person getPersonById(Long id) {
		Optional<Person> optionalBook = personRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
	}

}
