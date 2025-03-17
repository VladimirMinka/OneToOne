package ru.vladimirminka.onetoone.controller;

import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vladimirminka.onetoone.Entity.User;
import ru.vladimirminka.onetoone.repo.UserRepository;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private UserRepository userRepository;

    @PostMapping("/create")
    private ResponseEntity<User> addUser(@RequestBody User user){
        User userSave =  userRepository.save(user);
        return ResponseEntity.status(201).body(userSave);
    }


}
