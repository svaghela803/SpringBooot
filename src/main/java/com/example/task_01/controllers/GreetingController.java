package com.example.task_01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping?("/greeting")
    public String greeting() {
        return "Good afternoon Shivangi!";
    }
}
