package com.example.demo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.apache.commons.lang3.text.*; //API

public class WebController {
    
    private static final String POSTS_API_URL = "https://google.com/";

    public static void main(String[] args) throws IOException, InterruptedException {
        //SpringApplication.run(DemoApplication.class, args);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "appplication/json")
                .uri(URI.create(POSTS_API_URL))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        //capitalizes the first character of every word
        System.out.println(WordUtils.capitalizeFully(response.body()));
    }
}
