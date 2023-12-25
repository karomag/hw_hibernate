package com.example.hw_hibernate.controller;

import com.example.hw_hibernate.entity.Person;
import com.example.hw_hibernate.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class PersonController {
    private final PersonService personService;

    @GetMapping("/persons/{city}")
    public ResponseEntity<List<Person>> getAllPersonsByCity(@PathVariable String city) {
        return ResponseEntity.ok(personService.getAllPersonsByCity(city));
    }
    @GetMapping("/persons/age/{age}")
    public ResponseEntity<List<Person>> getAllPersonsByAge(@PathVariable int age) {
        return ResponseEntity.ok(personService.getAllPersonsByAge(age));
    }
    @GetMapping("/person/{name} {surname}")
    public ResponseEntity<Person> getAllPersonsByAge(@PathVariable String name, @PathVariable String surname) {
        return ResponseEntity.ok(personService.findPersonByNameAndSurname(name, surname));
    }

}
