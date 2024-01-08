package com.example.wechatappplaygroundv2.controller;

import com.example.wechatappplaygroundv2.model.UserAddressTesting;
import com.example.wechatappplaygroundv2.service.UserAddressTestingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserAddressTestingController {

    @Autowired
    private UserAddressTestingService service;

    @PostMapping("/useraddress")
    public ResponseEntity<UserAddressTesting> addUserAddress(@RequestBody UserAddressTesting userAddress) {
        UserAddressTesting savedUserAddress = service.saveUserAddress(userAddress);
        System.out.println("Received user address: " + userAddress);
        return ResponseEntity.ok(savedUserAddress);
    }
}
