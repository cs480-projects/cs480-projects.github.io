package com.example.springtest;

import java.util.Random;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GenerateRandomInt {

    @GetMapping("randInt")
    public int generateRandInt(){
        Random random = new Random();
        int randomInt = random.nextInt(10);
        return randomInt;
    }
}
