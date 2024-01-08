package com.example.wechatappplaygroundv2.controller;

import com.example.wechatappplaygroundv2.model.UserAddressTesting;
import com.example.wechatappplaygroundv2.service.UserAddressTestingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserAddressTestingController {

    @Autowired
    private UserAddressTestingService service;

    @PostMapping("/adduseraddress")
    public ResponseEntity<UserAddressTesting> addUserAddress(@RequestBody UserAddressTesting userAddress) {
        UserAddressTesting savedUserAddress = service.saveUserAddress(userAddress);
        System.out.println("Received user address: " + userAddress);
        return ResponseEntity.ok(savedUserAddress);
    }

    @GetMapping("/getuseraddresses")
    public ResponseEntity<List<UserAddressTesting>> getAllUserAddresses() {
        List<UserAddressTesting> userAddresses = service.getAllUserAddresses();
        return ResponseEntity.ok(userAddresses);
    }
}
