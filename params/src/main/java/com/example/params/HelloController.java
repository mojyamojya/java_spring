package com.example.params;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @GetMapping("/introduce/{name}")
    public String introduce(@PathVariable("name") String name, Model model) {
        model.addAttribute("msg", "私の名前は" + name + "です");
        return "hello";
    }
    
}
