package com.javatechie.spring.https.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController
{

    @GetMapping("/getData")
    public String getMsg()
    {
        return "Access by HTTPS ....";
    }
}
