package org.aditya.sample.controller;

import org.aditya.sample.entity.Users;
import org.aditya.sample.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserServices service;

    @PostMapping("/register")
    public String register(@RequestBody Users user){
        service.register(user);
        return "ok done";
    }

    @GetMapping("/reg")
    public String registerd(){
        return "ok done";
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(){
        return new ResponseEntity<>("ok",HttpStatus.OK);
    }
    @GetMapping("/")
    public String greet(){
        return "greeting";
    }
}
