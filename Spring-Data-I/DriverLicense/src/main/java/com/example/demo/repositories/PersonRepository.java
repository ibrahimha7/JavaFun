package com.example.demo.repositories;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Person;

public interface PersonRepository extends CrudRepository <Person, Long> {

}
