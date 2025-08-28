package com.UserService.service.impl;

import com.UserService.model.User;
import com.UserService.repository.UserRepo;
import com.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public User saveUser(User user) {
        //created unique userID
        String randomId= UUID.randomUUID().toString();
        user.setUserId(randomId);
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepo.findById(userId).orElseThrow(()->new ResourceNotFound("user not found with id :"+userId));
    }

    @Override
    public User updateUser(String userId, User user) {

        User existingUser=userRepo.findById(userId).orElseThrow(()->new ResourceNotFound("user not found with this id"));


        existingUser.setEmail(user.getEmail());
        existingUser.setName(user.getName());
        existingUser.setAbout(user.getAbout());


        return userRepo.save(existingUser);
    }

    @Override
    public void deleteUser(String userId) {
        User existingUser=userRepo.findById(userId).orElseThrow(()->new ResourceNotFound("user not found with this id"));
        userRepo.delete(existingUser);

    }
}
