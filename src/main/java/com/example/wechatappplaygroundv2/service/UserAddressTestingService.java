package com.example.wechatappplaygroundv2.service;

import com.example.wechatappplaygroundv2.model.UserAddressTesting;
import com.example.wechatappplaygroundv2.repository.UserAddressTestingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAddressTestingService {

    @Autowired
    private UserAddressTestingRepository repository;

    public UserAddressTesting saveUserAddress(UserAddressTesting userAddress) {
        return repository.save(userAddress);
    }
}
