package com.apis.apis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apis.apis.dao.UserRepository;
import com.apis.apis.entities.User;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user)
    {
        User u=(User) this.userRepository.save(user);
        return u;
    }

}
