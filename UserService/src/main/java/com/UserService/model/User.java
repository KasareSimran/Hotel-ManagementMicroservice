package com.UserService.model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="micro-users")
public class User {
    @Id
    @Column(name="ID")
    private String  userId;

    @Column(name="NAME",length = 15)

    private String name;

    @Column(name="EMAIL")
    private String email;

    @Column(name="ABOUT")
    private String about;


//    @Transient
//    private List<Rating> rating=new ArrayList<>();
//
//    public User(List<Rating> rating) {
//        this.rating = rating;
//    }
//
//    public List<Rating> getRating() {
//        return rating;
//    }
//
//    public void setRating(List<Rating> rating) {
//        this.rating = rating;
//    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }


    public User(String userId, String name, String email, String about) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.about = about;
    }

    public User() {
    }
}
