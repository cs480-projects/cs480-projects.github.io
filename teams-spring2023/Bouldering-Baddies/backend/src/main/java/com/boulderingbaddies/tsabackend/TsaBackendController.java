package com.boulderingbaddies.tsabackend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Autowired
    TerminalRepository terminalRepo;

    @RequestMapping("/terminals")
    public @ResponseBody ResponseEntity<?> getAllTerminals() {
        Iterable<Terminal> terminals = terminalRepo.findAll();
        if(terminals == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        CollectionModel<Terminal> resources = CollectionModel.of(terminals);
        return ResponseEntity.ok(resources);
    }

    // Save 3 Sample Terminals for SNA
    @PostMapping("/create/terminals")
    public @ResponseBody ResponseEntity<?> createTerminal() {
        Terminal snaA = new Terminal("SNA", "A");
        Terminal snaB = new Terminal("SNA", "B");
        Terminal snaC= new Terminal("SNA", "C");

        terminalRepo.save(snaA);
        terminalRepo.save(snaB);
        terminalRepo.save(snaC);

        List<Terminal> savedTerminals = new ArrayList<>();
        savedTerminals.add(snaA);
        savedTerminals.add(snaB);
        savedTerminals.add(snaC);

        return new ResponseEntity<>(savedTerminals, HttpStatus.CREATED);
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
