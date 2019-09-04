package com.blitznihar.db.controller;

import java.util.List;

import com.blitznihar.db.pojos.Person;
import com.blitznihar.db.repo.PersonRepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    
    private PersonRepo personRepo;

    @GetMapping
    public List<Person> retrievePerson(String lastName){

        return personRepo.findByLastName(lastName);
        
    }
}