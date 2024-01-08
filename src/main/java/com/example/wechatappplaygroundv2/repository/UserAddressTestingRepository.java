package com.example.wechatappplaygroundv2.repository;

import com.example.wechatappplaygroundv2.model.UserAddressTesting;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserAddressTestingRepository extends MongoRepository<UserAddressTesting, String> {
    // Custom query methods if needed
}
