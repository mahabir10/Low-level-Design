package org.sysdesign.DisplayComponents;

import org.sysdesign.Interfaces.DisplayElement;
import org.sysdesign.WeatherStation.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentStatusDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Observable weatherData;

    public CurrentStatusDisplay(Observable weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.temperature = ((WeatherData)o).getTemperature();
        this.humidity = ((WeatherData)o).getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Temperature: " + this.temperature + " "
        + "Current Humidity: " + this.humidity);
    }
}
