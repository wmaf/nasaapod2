package com.careerdevs.nasaapod2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/nasa")
public class NasaController {

    @Autowired
    Environment env;

    @GetMapping ("/apikey")
    public String getApiKey () {
        return env.getProperty("apikey");

}
    @GetMapping ("/{date}")
    public Object getOneApod (@PathVariable ("date") String apodDate,
            RestTemplate restTemplate){
        String url = "https://api.nasa.gov/planetary/apod?api_key=" + env.getProperty("apikey") + "&date=" + apodDate;
        return restTemplate.getForObject(url,Object.class);
    }







 // @GetMapping("/apod")
 // public Object getRequesthandlerReq(RestTemplate restTemplate) {

 //   return restTemplate.getForObject("https://api.nasa.gov/planetary/apod?api_key=" + "EyYqFD5EeIjFv1oDtWej5fAYlywEOqJwIqr1r2yz", Object.class);
 // }
 // @GetMapping ("/getPhotosInRange/{date}")
 //public Object getPhotosInRange(RestTemplate restTemplate, @PathVariable String date) {
 //  return restTemplate.getForObject("https://api.nasa.gov/planetary/apod?" + date + "api_key=EyYqFD5EeIjFv1oDtWej5fAYlywEOqJwIqr1r2yz",Object.class);

//}


























}

