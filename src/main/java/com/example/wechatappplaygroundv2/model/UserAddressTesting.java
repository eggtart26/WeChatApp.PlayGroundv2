package com.example.wechatappplaygroundv2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "userAddressTesting")
public class UserAddressTesting {

    @Id
    private String id;


    @Field("address")
    private String address;
    @Field("cityId")
    private String cityId;
    @Field("districtId")
    private String districtId;
    @Field("isDefault")
    private boolean isDefault;
    @Field("linkMan")
    private String linkMan;
    @Field("mobile")
    private String mobile;
    @Field("provinceId")
    private String provinceId;
    @Field("token")
    private String token;


    // Getters and setters for all fields
    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter for cityId
    public String getCityId() {
        return cityId;
    }

    // Setter for cityId
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    // Getter for districtId
    public String getDistrictId() {
        return districtId;
    }

    // Setter for districtId
    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    // Getter for isDefault
    public boolean getIsDefault() {
        return isDefault;
    }

    // Setter for isDefault
    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    // Getter for linkMan
    public String getLinkMan() {
        return linkMan;
    }

    // Setter for linkMan
    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    // Getter for provinceId
    public String getProvinceId() {
        return provinceId;
    }

    // Setter for provinceId
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    // Getter for token
    public String getToken() {
        return token;
    }

    // Setter for token
    public void setToken(String token) {
        this.token = token;
    }

    // Getter for districtId
    public String getMobile() {
        return mobile;
    }

    // Setter for districtId
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
