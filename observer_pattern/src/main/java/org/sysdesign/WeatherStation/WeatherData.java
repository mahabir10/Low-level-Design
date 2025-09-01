package org.sysdesign.WeatherStation;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temperature;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    private float humidity;
    private float pressure;

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        this.setChanged();
        this.notifyObservers();
    }
}
