package com.example.hw_hibernate.service;

import com.example.hw_hibernate.entity.Person;
import com.example.hw_hibernate.repository.PersonCrudRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonCrudRepository personCrudRepository;

    public List<Person> getAllPersonsByCity(String city) {
        return personCrudRepository.getAllPersonsByCity(city);
    }
    public List<Person> getAllPersonsByAge(int age) {
        return personCrudRepository.getAllPersonsByPkAgeLessThanOrderByPkAgeAsc(age);
    }

    public Person findPersonByNameAndSurname(String name, String surname) {
        return personCrudRepository.findPersonByPkNameAndPkSurname(name, surname)
                .orElse(null);
    }
}
