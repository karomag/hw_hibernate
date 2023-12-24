package com.example.hw_hibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "persons")
public class Person {
    @EmbeddedId
    private PersonPK pk;

    @Column()
    private String phone_number;

    @Column()
    private String city_of_living;

}
