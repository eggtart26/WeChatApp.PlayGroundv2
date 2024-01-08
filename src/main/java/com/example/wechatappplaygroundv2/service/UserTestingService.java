package com.example.wechatappplaygroundv2.service;

import com.example.wechatappplaygroundv2.model.UserTesting;
import com.example.wechatappplaygroundv2.repository.UserTestingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTestingService {

    @Autowired
    private UserTestingRepository repository;

    public List<UserTesting> getAllUserTesting() {
        return repository.findAll();
    }
}
