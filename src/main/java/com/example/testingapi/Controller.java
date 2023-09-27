package com.example.testingapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("")
    public String achar(){
        return "Uhuls";
    }

    @GetMapping("/achar")
    public String acharUm(){
        return "Você é o cara!";
    }
}
