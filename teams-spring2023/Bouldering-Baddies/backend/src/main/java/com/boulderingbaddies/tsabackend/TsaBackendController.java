package com.boulderingbaddies.tsabackend;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;

import java.util.Arrays;
import java.util.List;


import java.util.Arrays;

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

    @RequestMapping("/joshua")
    public String joshua() {
        return "It would be hilarious if I messed up Seth's commit";
    }

    @RequestMapping("/apache")
    public String apache() {

        List<Double> data = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);

        Mean mean = new Mean();
        double dataMean = mean.evaluate(data.stream().mapToDouble(Double::doubleValue).toArray());
        System.out.println("Mean: " + dataMean);

        StandardDeviation std = new StandardDeviation();
        double dataStd = std.evaluate(data.stream().mapToDouble(Double::doubleValue).toArray());
        System.out.println("Standard deviation: " + dataStd);
        String result = "Standard deviation: " + dataStd;
        return result;
    }

}
