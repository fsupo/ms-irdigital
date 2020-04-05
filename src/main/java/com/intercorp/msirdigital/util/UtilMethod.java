package com.intercorp.msirdigital.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.stream.Collector;

import org.decimal4j.util.DoubleRounder;
import org.springframework.stereotype.Component;

import com.intercorp.msirdigital.model.dao.Client;

@Component
public class UtilMethod {
    
    private static final String DATE_FORMATTER = "dd/MM/yyyy";
    
    SimpleDateFormat format = new SimpleDateFormat(DATE_FORMATTER);

    public Double calculatedAverage(List<Client> clients) {
        return DoubleRounder.round(
                clients
                .stream()
                .mapToDouble(Client::getAge)
                .average()
                .orElse(0.0)
                , 
                2);
    }
    
    public Double calculatedStandarVariation(List<Client> clients) {
        return DoubleRounder.round(
                clients
                .stream()
                .mapToDouble(Client::getAge)
                .boxed()
                .collect(Collector.of(DoubleStatistics::new, DoubleStatistics::accept, DoubleStatistics::combine, d -> d.getStandardDeviation()))
                , 
                2);
                
    }
    
    public String convertDateFormat(Date date) {
        return format.format(date);
    }
    
    public String getDateOfDeath(Integer age) {
        long a = Double.valueOf((Math.random()*( 100 - age ) + 1)).longValue();
        return LocalDate.now().plusYears(a).format(DateTimeFormatter.ofPattern(DATE_FORMATTER));
    }
}
