package org.weather.cloudapp.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class Forecast {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@Column
private LocalDate date;
@Column
private Double predictedTemperature;
@Column
private String predictedDescription;
@Column
private Location location;

    

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getPredictedTemperature() {
        return predictedTemperature;
    }

    public void setPredictedTemperature(Double predictedTemperature) {
        this.predictedTemperature = predictedTemperature;
    }

    public String getPredictedDescription() {
        return predictedDescription;
    }

    public void setPredictedDescription(String predictedDescription) {
        this.predictedDescription = predictedDescription;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
