package org.aditya.sample.controller;

import org.aditya.sample.entity.Users;
import org.aditya.sample.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class UserController {

    private static final Logger logger = Logger.getLogger("user controller");

    @Autowired
    UserServices service;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Users user){
        // service.register(user);
        logger.info(user.toString());
        return new ResponseEntity<>("ok done",HttpStatus.CREATED);
    }

    @GetMapping("/")
    public String greet(){
        return "greeting";
    }
}
