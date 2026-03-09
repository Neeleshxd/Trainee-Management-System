package com.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "Spring MVC working!";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}