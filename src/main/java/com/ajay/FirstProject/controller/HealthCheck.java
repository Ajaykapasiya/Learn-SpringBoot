package com.ajay.FirstProject.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HealthCheck {

    @GetMapping("/health-check")
    public  String healthcheck(){
        return "Ok";
    }
}
