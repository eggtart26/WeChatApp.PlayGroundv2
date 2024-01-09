package com.example.wechatappplaygroundv2.controller;

import com.example.wechatappplaygroundv2.model.ApiResponse;
import com.example.wechatappplaygroundv2.model.UserAddressTesting;
import com.example.wechatappplaygroundv2.service.UserAddressTestingService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserAddressTestingController {

    @Autowired
    private UserAddressTestingService service;

    @Operation(summary = "Add a user address", description = "Add a user address to database")
    @PostMapping("/adduseraddress")
    public ResponseEntity<ApiResponse<UserAddressTesting>> addUserAddress(@RequestBody UserAddressTesting userAddress) {
        try {
            UserAddressTesting savedUserAddress = service.saveUserAddress(userAddress);
            ApiResponse<UserAddressTesting> response = ApiResponse.success(savedUserAddress);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(ApiResponse.error(1, "Error processing request", userAddress));
        }
    }

    @Operation(summary = "Get all user addresses", description = "Returns all data for user addresses")
    @GetMapping("/getuseraddresses")
    public ResponseEntity<List<UserAddressTesting>> getAllUserAddresses() {
        List<UserAddressTesting> userAddresses = service.getAllUserAddresses();
        return ResponseEntity.ok(userAddresses);
    }
}
