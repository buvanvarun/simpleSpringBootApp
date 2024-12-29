package com.project.SimpleWebSpringBootApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Hello world!";
    }

    @RequestMapping("/about")
    public String about(){
        return "Hey this is Buvan, I am learning spring boot!";
    }
}
