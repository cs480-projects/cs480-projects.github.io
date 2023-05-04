package com.boulderingbaddies.tsabackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class TsaBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TsaBackendApplication.class, args);
    }

}
