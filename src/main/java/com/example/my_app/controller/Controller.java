package com.example.my_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/test")
    @ResponseBody
    public Object test() {
        return  "this is test endpoint";
    }
}
