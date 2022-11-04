package com.dailycodebuffer.Springboot.totorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld () {
        return "Welcome to Daily Code Buffer!! aaa";
    }
}
