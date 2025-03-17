package ru.vladimirminka.onetoone.Entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private LocalDate yearOfBirth;
    private int serialPassportNumber;

    @OneToOne
    @JoinColumn(name = "user_id",unique = true)
    private User user;

}
