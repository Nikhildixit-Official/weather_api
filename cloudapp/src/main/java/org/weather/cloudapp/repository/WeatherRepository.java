package org.weather.cloudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.weather.cloudapp.model.Location;

public interface WeatherRepository extends JpaRepository<Location, Long> {

}
