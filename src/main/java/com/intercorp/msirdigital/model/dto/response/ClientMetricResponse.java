package com.intercorp.msirdigital.model.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientMetricResponse {

    private Integer count;
    private Double ageAverage;
    private Double ageStandarDeviation;

    public ClientMetricResponse() {
        this.count = 0;
        this.ageAverage = 0.0;
        this.ageStandarDeviation = 0.0;
    }

    public ClientMetricResponse(Integer count, Double ageAverage, Double ageStandarDeviation) {
        this.count = count;
        this.ageAverage = ageAverage;
        this.ageStandarDeviation = ageStandarDeviation;
    }
}
