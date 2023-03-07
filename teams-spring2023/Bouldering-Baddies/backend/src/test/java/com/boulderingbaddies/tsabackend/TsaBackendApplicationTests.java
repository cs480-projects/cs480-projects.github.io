package com.boulderingbaddies.tsabackend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TsaBackendApplicationTests {

    @Test
    public void testAirportSNAExistsInAPI()
            throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://airport-info.p.rapidapi.com/airport?iata=SNA"))
                .header("X-RapidAPI-Key", "b0d3c98a37mshaf71740f91fe6ffp1c2bdejsnf8e4edef876b")
                .header("X-RapidAPI-Host", "airport-info.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        assertEquals(response.statusCode(), 200);
    }

    @Test
    public void testAirportLAXExistsInAPI()
            throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://airport-info.p.rapidapi.com/airport?iata=LAX"))
                .header("X-RapidAPI-Key", "b0d3c98a37mshaf71740f91fe6ffp1c2bdejsnf8e4edef876b")
                .header("X-RapidAPI-Host", "airport-info.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        assertEquals(response.statusCode(), 200);
    }

}
