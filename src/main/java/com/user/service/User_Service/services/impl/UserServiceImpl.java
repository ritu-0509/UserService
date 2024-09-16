package com.user.service.User_Service.services.impl;

import com.user.service.User_Service.entities.User;
import com.user.service.User_Service.exceptions.ResourceNotFoundException;
import com.user.service.User_Service.repositories.UserRepository;
import com.user.service.User_Service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
       String randomUserId =  UUID.randomUUID().toString();//generate unique userid
       user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User with given id is not available on server" +userId));
    }
@Override
    public User deleteUser(String userId){
        return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User with given id is not available on server" +userId));
}


}
