package com.example.wechatappplaygroundv2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "usertesting")
public class UserTesting {

    @Id
    private Integer id;  // Assuming '_id' in MongoDB is an Integer

    @Field("userName")
    private String userName;

    @Field("wechatId")
    private String wechatId;

    @Field("createAt")
    private String createAt;  // Assuming 'createAt' is stored as a String

    // Standard getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
}
