package org.aditya.sample.services;

import org.aditya.sample.entity.Users;
import org.aditya.sample.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServices {

    @Autowired
    UsersRepository repo;

    public void register(Users user){
        repo.save(user);
    }
}
