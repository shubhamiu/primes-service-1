package edu.shubham.primeservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin
public class HomeController {

    @GetMapping("/")
    public String Greetings() {
        return "Welcome to Home  Service!";
    }
}
