package com.example.userservice.services;

import com.example.userservice.mappers.UserMapper;
import com.example.userservice.model.user.User;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.services.feign.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PaymentService paymentService;

    public boolean register(User user){
        if (userMapper.searchUserWithAllInfoByUsername(user.getUsername()) != null){
            return false;
        }
        userMapper.insert(user);
        paymentService.openWallet(user);
        return true;
    }
}
