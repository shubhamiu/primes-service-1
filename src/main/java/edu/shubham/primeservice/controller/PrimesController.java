package edu.shubham.primeservice.controller;


import edu.shubham.primeservice.service.IPrimeService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin

@RequestMapping("/prime")

public class PrimesController {
    IPrimeService primeService;
    @GetMapping("/")
    public String Greetings() {
        return "Welcome to prime!";
    }
    public PrimesController(IPrimeService primeService){
        this.primeService = primeService;
    }

    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable long n){
        return primeService.isPrime(n);
    }

}
