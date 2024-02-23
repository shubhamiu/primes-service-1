package edu.shubham.primeservice.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeServiceTest {

    PrimeService primeService = new PrimeService();
    @Test
    void _45IsNotPrime() {
        int n = 45;
        boolean expected = false;
        boolean actual = primeService.isPrime(n);
        assertEquals(expected, actual);
    }

    @Test
    void _539828495930573IsNotPrime() {
        long n = 539828495930573L;
        boolean expected = false;
        boolean actual = primeService.isPrime(n);
        assertEquals(expected, actual);
    }

    @Test
    void _285191IsPrime() {
        long n = 285191;
        boolean expected = true;
        boolean actual = primeService.isPrime(n);
        assertEquals(expected, actual);
    }

}