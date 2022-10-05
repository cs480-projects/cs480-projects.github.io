package com.example.CS4800A3_JacobJung.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class APIController {

    @ResponseBody
    @GetMapping("/api/hello")
    public String api(){
        return "Hello World from Jacob!";
    }
}
