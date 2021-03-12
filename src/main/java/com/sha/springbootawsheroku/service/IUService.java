package com.sha.springbootawsheroku.service;

import com.sha.springbootawsheroku.model.User;

import java.util.List;

public interface IUService {
    User saveUser(User user);

    User findByUsername(String username);

    List<User> findAllUsers();
}
