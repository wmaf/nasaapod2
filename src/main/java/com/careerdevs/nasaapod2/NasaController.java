package com.careerdevs.nasaapod2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NasaController {
    @GetMapping ("/nasaphoto")
    public  Object getPost(RestTemplate restTemplate) {
        return restTemplate.getForObject("")
    }

























}

