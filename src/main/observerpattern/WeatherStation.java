package main.observerpattern;

import main.observerpattern.display.CurrentConditionsDisplay;
import main.observerpattern.subject.impl.WeatherData;

//observer pattern defines one-to-many relationship between objects
//so that when an object changes its state, others get notified

//design principle used - loose coupling
public class WeatherStation {
    public static void main(String[] args) {

        //subject
        WeatherData weatherData = new WeatherData();

        //observer
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(45,65,30.4f);
    }
}
