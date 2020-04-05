package com.intercorp.msirdigital.model.dto.model;

import lombok.Data;

@Data
public class Metrics {

    private Double ageAverage;
    private Double ageStandarDeviation;

    public Metrics() {
        this.ageAverage = 0.0;
        this.ageStandarDeviation = 0.0;
    }

    public Metrics(Double ageAverage, Double ageStandarDeviation) {
        this.ageAverage = ageAverage;
        this.ageStandarDeviation = ageStandarDeviation;
    }
}
