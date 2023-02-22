package com.boulderingbaddies.tsabackend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TsaBackendController {

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World from Bouldering Baddies";
    }

    @RequestMapping("/goodbye")
    public String goodbye() {
        return "Goodbye from Bouldering Baddies";
    }

    @RequestMapping("/seth")
    public String seth() {
        return "Did I do A3 right?";
    }
}
