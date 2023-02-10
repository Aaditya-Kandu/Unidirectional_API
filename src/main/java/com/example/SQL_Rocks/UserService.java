package com.example.SQL_Rocks;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);

        return "User added successfully";
    }

    public User getUser(int id){

        User user = userRepository.findById(id).get(); // it's use for getting entity by primary key

        return user;
    }

    public List<User> findAllUser(){

        List<User> list = new ArrayList<>();

        list = userRepository.findAll();
        return list;

    }

}
