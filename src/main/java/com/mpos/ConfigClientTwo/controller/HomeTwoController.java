package com.mpos.ConfigClientTwo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeTwoController {

    @Value("${keytwo.message}")
    private String keytwo;

    @Value("${product.message}")
    private String prodmessage;

    @GetMapping("/")
    public String home(){
        return "Message "+keytwo + " -> " +prodmessage;
    }
}
