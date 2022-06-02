package main.observerpattern.display;

import main.observerpattern.observers.Observer;
import main.observerpattern.subject.impl.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    //data to display
    private float temperature;
    private float humidity;

    //concrete impl of subject
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: temperature: %s, humidity: %s",temperature,humidity);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
