package com.user.service.User_Service.services;

import com.user.service.User_Service.entities.User;

import java.util.List;

public interface UserService {
    //operations
    User saveUser(User user); //Create

    List<User> getAllUser();// getALlUser

    User getUser(String userId);// get specific user whose id is mentioned

    User deleteUser(String userId);// delete user by email


}

