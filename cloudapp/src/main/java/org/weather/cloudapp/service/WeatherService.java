package org.weather.cloudapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.weather.cloudapp.repository.LocationRepository;
import org.weather.cloudapp.repository.WeatherRepository;
@Service
public class WeatherService {
    @Autowired
    private LocationRepository locationRepository;
    @Autowired
    private WeatherRepository weatherRepository;
    

}
