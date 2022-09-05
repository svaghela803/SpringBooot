package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

//Returns a String
//@GetMapping
//public String greet(){
//    return "Good afternoon Shivangi!"}

////return POJO
//    @GetMapping
//    public Greeting greet(){
//    return new Greeting("Shivangi", "Afternoon" );
//    }
    

    @GetMapping

//  Add a RequestParameter
    public Greeting greet(@RequestParam String timeOfDay) {
        return new Greeting("Shivangi", timeOfDay);
    }

//    Celebration DTO
    @GetMapping (value = "/christmas")
    public Celebration festiveGreeting(){
        return new Celebration("Merry Christmas!");
    }

}
