package com.example.SQL_Rocks;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add_user")
    public String addUser(@RequestBody() User user){

        return userService.addUser(user);
    }

    @GetMapping("/get_user")
    public User getUser(@RequestParam("id") int id){

        return userService.getUser(id);
    }
    @GetMapping("/find_alluser")
    public List<User> findAllUser(){

        return userService.findAllUser();


    }
}
