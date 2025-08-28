package com.UserService.repository;


import com.UserService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface UserRepo extends JpaRepository<User,String> {
    }


