package com.example.wechatappplaygroundv2.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AssetController {
    @GetMapping("/asset/get")
    public String getAssets() {
        return "Hello, this is a Get request! v2";
    }

    @PostMapping("/asset/onboard")
    public String onboardAssets(@RequestBody String message) {
        return "You posted: " + message;
    }
}
