package com.example.wechatappplaygroundv2.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "testingDB";
    }

    @Override
    public MongoClient mongoClient() {
        String uri = "mongodb://root:wechatMongo2024@dds-3ns87169d5c923141398-pub.mongodb.rds.aliyuncs.com:3717,dds-3ns87169d5c923142132-pub.mongodb.rds.aliyuncs.com:3717/admin?replicaSet=mgset-74548685";
        return MongoClients.create(uri);
    }
}

