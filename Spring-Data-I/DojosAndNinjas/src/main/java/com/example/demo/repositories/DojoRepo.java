package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Dojo;

public interface DojoRepo extends CrudRepository <Dojo, Long> {

}
