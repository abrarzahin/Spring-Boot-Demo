package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * This class is 
 */
@Controller
public class GreetingController {

    /**
     * This controller doesn't render and return an html file. Instead, 
     * it returns a Plain Old Java Object (POJO) as JSON (JavaScript Object Notation)
     * to the requester. 
     */
    @GetMapping("/greeting")
    @ResponseBody // This annotatin makes the controller return JSON instead of html
    public MyObject greeting(
        @RequestParam(name = "name", required = false, defaultValue = "World") String name,
        @RequestParam(name = "major", required = false, defaultValue = "CS") String major) {
            System.out.printf("Received from the user: name='%s', major='%s'\n", name, major);

        return new MyObject(name, major);
    }

    // This controller renders and returns hello.html in resources/templates to the requester
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}