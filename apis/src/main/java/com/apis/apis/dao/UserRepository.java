package com.apis.apis.dao;

import org.springframework.data.repository.CrudRepository;

import com.apis.apis.entities.User;

public interface UserRepository extends CrudRepository<User,Integer> {
    public User getById(int id);
}
