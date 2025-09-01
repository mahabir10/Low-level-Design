package org.sysdesign;

import org.sysdesign.DisplayComponents.CurrentStatusDisplay;
import org.sysdesign.WeatherStation.WeatherData;

public class Main {
    public static void main(String[] args) {


    System.out.println("Weather Station!!!");

    WeatherData weatherData = new WeatherData();
    CurrentStatusDisplay currentStatusDisplay = new CurrentStatusDisplay(weatherData);

    weatherData.setMeasurements(0.9f,0.7f,0.8f);
    weatherData.setMeasurements(10.0f,1.0f,2.0f);
    weatherData.setMeasurements(20.0f,0.5f,3.0f);

    }
}