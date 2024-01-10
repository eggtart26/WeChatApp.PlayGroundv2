package com.example.wechatappplaygroundv2.repository;

import com.example.wechatappplaygroundv2.model.UserTesting;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserTestingRepository extends MongoRepository<UserTesting, String> {
    // Custom query methods if needed
}
