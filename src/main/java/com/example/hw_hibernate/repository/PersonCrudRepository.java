package com.example.hw_hibernate.repository;

import com.example.hw_hibernate.entity.Person;
import com.example.hw_hibernate.entity.PersonPK;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PersonCrudRepository extends CrudRepository<Person, PersonPK> {

    List<Person> getAllPersonsByCity(String city);
    List<Person> getAllPersonsByPkAgeLessThanOrderByPkAgeAsc(int age);

    Optional<Person> findPersonByPkNameAndPkSurname(String name, String surname);
}
