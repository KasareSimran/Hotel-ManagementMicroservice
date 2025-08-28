package com.UserService.service;

import com.UserService.model.User;

import java.util.List;

public interface UserService {
    //User operations

    //create user
    User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get Single user of given id
    User getUser(String userId);

    //update user
    User updateUser(String userId,User user);

    //delete user
    void deleteUser(String userId);

}
