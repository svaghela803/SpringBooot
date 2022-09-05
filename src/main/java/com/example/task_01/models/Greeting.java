package com.example.task_01.models;

public class Greeting {

    private String name;
    private String timeOfDay;

    public Greeting( String timeOfDay, String name,) {
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public Greeting() {

    }
}
