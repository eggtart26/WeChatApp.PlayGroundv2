package com.example.wechatappplaygroundv2.controller;

import com.example.wechatappplaygroundv2.model.UserTesting;
import com.example.wechatappplaygroundv2.service.UserTestingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserTestingController {

    @Autowired
    private UserTestingService service;

    @GetMapping("/usertesting")
    public ResponseEntity<List<UserTesting>> getAllUserTesting() {
        return ResponseEntity.ok(service.getAllUserTesting());
    }
}

