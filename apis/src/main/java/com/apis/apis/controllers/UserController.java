package com.apis.apis.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apis.apis.entities.User;
import com.apis.apis.services.UserService;

@RestController
@RequestMapping("/v1/api/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String testApi()
    {
        return "Hello from the test function";
    }

    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user)
    {
        User u=null;
        try {
            u=this.userService.addUser(user);
            return ResponseEntity.of(Optional.of(u));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
