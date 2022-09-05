package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    @GetMapping

//    Extension task 1
    public String newGreeting(@RequestParam(value = "timeOfDay") String timeOfDay) {
        return String.format(timeOfDay + " Shivangi" );
    }

//    http://localhost:8080/greeting?timeOfDay=Afternoon prints out "Good afternoon Shivangi"


//    public Celebration newGreeting(){
//        Greeting greeting = new Greeting("Afternoon");
//        return new Celebration("Merry Christmas");
//    }

//    Extension task 3
//    public String newGreeting(@RequestParam(value = "message") String message){
//        return String.format(message);
//    }
}
