package com.example.CS4800A3_JacobJung.Controller;

import java.util.Random;
import org.apache.commons.math3.fraction.Fraction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.*;

@Controller
public class APIController {

    @ResponseBody
    @GetMapping("/api/hello")
    public String api(){
        return "Hello World from Jacob!";
    }
    
    @ResponseBody
    @GetMapping("/api/hello2")
    public String api2()
    {
        Random r = new Random();
        double randomValue = 1 * r.nextDouble();
        Fraction a = RandomFraction(randomValue);
        String retval = a.toString();
        return "<div class=\"center\" align=\"center\">" + "<h1>Here's a random fraction: " +  randomValue + " = " + retval + "</h1>";
    }
    public static Fraction RandomFraction(double randomValue)
    {
        Fraction fraction = new Fraction(randomValue);
        return fraction;
    }

}
