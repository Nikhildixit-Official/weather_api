package org.weather.cloudapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.weather.cloudapp.service.WeatherService;

@Controller
public class WeatherController {
    @Autowired
private WeatherService weatherService;
}
