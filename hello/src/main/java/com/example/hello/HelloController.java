package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @GetMapping("/hello")
    public String hello(@RequestParam("name") String param, Model model) {
        model.addAttribute("msg", "Hi!" + param);
        return "hello";
    }
    
}
