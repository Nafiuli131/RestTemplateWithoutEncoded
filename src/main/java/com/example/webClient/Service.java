package com.example.webClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private RestTemplate restTemplate;


    String work() {
        String baseUrl = "https://path%hello?%rich";
//        String baseUrl = "https://www.googleapis.com/calendar/v3/calendars/en.uk%23holiday%40group.v.calendar.google.com/events?key=73hghdgfhdsgfh";
//        String baseUrl = "https://api.publicapis.org/entries";
//        String baseUrl = "hello%rich%you";
        // Use UriComponentsBuilder to build the URI without automatic encoding
        String fullUrl = UriComponentsBuilder.fromUriString(baseUrl).build().toUriString();

//        System.out.println(fullUrl);
        // Use the injected RestTemplate instance to make requests
//        String result = restTemplate.getForObject(fullUrl, String.class);

        // Process the response as needed
//        System.out.println(result);
        ResponseEntity<String> response
                = restTemplate.getForEntity(fullUrl, String.class);
//        System.out.println(response.getHeaders());
        String productsJson = response.getBody();
        System.out.println(productsJson);
        return productsJson;

    }
    }
