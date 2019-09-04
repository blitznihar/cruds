package com.blitznihar.db.repo;

import java.util.List;

import com.blitznihar.db.pojos.Person;

import org.springframework.data.repository.CrudRepository;


public interface PersonRepo extends CrudRepository<Person, Long> {

    List<Person> findByLastName(String lastName);
}