package com.example.hw_hibernate.repositories;

import com.example.hw_hibernate.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class PersonRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {

        return entityManager.createQuery("SELECT p FROM Person p WHERE p.city_of_living = :city", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}
