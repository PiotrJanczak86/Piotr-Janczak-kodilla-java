package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateMean() {
        double sumTemp = 0;
        for (Map.Entry<String, Double> entry :
                temperatures.getTemperatures().entrySet()) {
            sumTemp += entry.getValue();

        }
        return sumTemp / temperatures.getTemperatures().size();
    }

    public double calculateMedian() {
        ArrayList<Double> arrangedTemp = new ArrayList<>();

        for (Map.Entry<String, Double> entry :
                temperatures.getTemperatures().entrySet()) {
            arrangedTemp.add(entry.getValue());
        }
        Collections.sort(arrangedTemp);

        if(arrangedTemp.size() % 2 == 0) {
            return (arrangedTemp.get(arrangedTemp.size()/2 -1) + arrangedTemp.get(arrangedTemp.size()/2)) / 2;
        } else {
            return arrangedTemp.get(arrangedTemp.size()/2);
        }
    }
}