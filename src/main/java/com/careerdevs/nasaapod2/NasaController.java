package com.careerdevs.nasaapod2;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/nasa")
public class NasaController {

    @GetMapping("/apod")
     public Object getRequesthandlerReq(RestTemplate restTemplate) {
        return restTemplate.getForObject("https://api.nasa.gov/planetary/apod?api_key=" + "EyYqFD5EeIjFv1oDtWej5fAYlywEOqJwIqr1r2yz", Object.class);
    }
}


























}

