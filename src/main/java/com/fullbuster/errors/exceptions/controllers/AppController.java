package com.fullbuster.errors.exceptions.controllers;

import com.fullbuster.errors.exceptions.exceptions.UserNotFoundException;
import com.fullbuster.errors.exceptions.services.UserService;
import com.fullbuster.errors.exceptions.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullbuster.errors.exceptions.models.domain.User;

import java.util.Optional;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String index() {
//        int value = 100/0;
        int value = Integer.parseInt("10x");
        System.out.println(value);
        return "OK 200";
    }

    @GetMapping("/show/{id}")
    public User viewUser(@PathVariable(name = "id") Long id) {
        User user = userService.findById(id).orElseThrow(() -> new UserNotFoundException("Error el usuario no existe"));
        System.out.println(user.getLastname());

        return user;
    }

//    @GetMapping("/show/{id}")
//    public ResponseEntity<?> viewUser(@PathVariable(name = "id") Long id) {
//        Optional<User> optionalUser = userService.findById(id);
//        if(optionalUser.isEmpty()) {
//            return ResponseEntity.notFound().build();
//        }
//
//        return ResponseEntity.ok(optionalUser.get());
//    }



}
