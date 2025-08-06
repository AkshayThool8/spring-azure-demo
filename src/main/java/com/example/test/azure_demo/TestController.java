package com.example.test.azure_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/home")
    public String testMethod() {
        return "Application got deployed to azure platforms successfully";
    }

    @GetMapping("/test")
    public String checkData() {
        return  "Hello World";
    }
}
