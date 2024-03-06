package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Welcome to Home";
    }

    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }
}
