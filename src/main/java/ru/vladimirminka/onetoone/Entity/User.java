package ru.vladimirminka.onetoone.Entity;

import jakarta.persistence.*;

import lombok.*;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String password;

    @OneToOne(mappedBy = "user",cascade = CascadeType.PERSIST)
    private Passport passport;


}
