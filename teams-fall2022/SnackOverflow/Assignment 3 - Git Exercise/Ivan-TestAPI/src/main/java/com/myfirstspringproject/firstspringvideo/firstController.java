package com.myfirstspringproject.firstspringvideo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {

    @GetMapping("/welcome")
    public String first_api() {
        return "Welcome to first API.";
    }
}
