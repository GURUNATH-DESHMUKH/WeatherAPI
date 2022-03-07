package com.example.WeatherAPIPrac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.WeatherAPIPrac.service.LiveWeatherService;

@Controller
public class CurrentWeatherController {
    private final LiveWeatherService liveWeatherService;
 
    public CurrentWeatherController(LiveWeatherService liveWeatherService) {
        this.liveWeatherService = liveWeatherService;
    }
 
    @GetMapping("/weather")
    public String getCurrentWeather(Model model) {
        model.addAttribute("currentWeather", liveWeatherService.getCurrentWeather("Pune","india"));
        return "current-weather";
    }
}