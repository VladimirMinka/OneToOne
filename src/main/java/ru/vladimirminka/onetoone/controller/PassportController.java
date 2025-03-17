package ru.vladimirminka.onetoone.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vladimirminka.onetoone.Entity.Passport;
import ru.vladimirminka.onetoone.Entity.User;
import ru.vladimirminka.onetoone.repo.PassportRepository;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class PassportController {
    /*
    В проект OneToOne Добавить контролер для паспорта
с методом который принимает паспорт и добавляет его и возвращает
добавленный паспорт.

после через постман добавить юзера без паспорта
после добавить паспорт и указать паспорту при добавлении id юзера в
jsone    - чей будет это паспорт
проверить результат  в таблице
     */


    private PassportRepository repository;

    @PostMapping("/create")
    private ResponseEntity<Passport> addPassport(@RequestBody Passport passport) {
        Passport savedPassport = repository.save(passport);
        return ResponseEntity.status(201).body(savedPassport);

    }
}
