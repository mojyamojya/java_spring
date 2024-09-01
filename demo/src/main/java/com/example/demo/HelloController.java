package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        String[] fruits = {"apple", "orange", "melon"};
        return Arrays.toString(fruits);
    }
    
}
