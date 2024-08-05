package com.edigest.myFirstProject.controller;

import com.edigest.myFirstProject.entity.User;
import com.edigest.myFirstProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    private UserService userService;

    @GetMapping("/health-check")
    public String heathCheck(){
        return "OK";
    }

    @PostMapping
    public void addEntry(@RequestBody User user) {
        userService.saveUser(user);
    }
}
