package com.estiam.Estiam_SpringJava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String mainPage(){
        return "Page Principale";
    }

    @GetMapping("/hello")
    public String direBonjour(){
        return "hello web service";
    }

}
