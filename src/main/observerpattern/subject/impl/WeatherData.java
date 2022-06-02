package main.observerpattern.subject.impl;

import main.observerpattern.observers.Observer;
import main.observerpattern.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    //concrete impl of subject has a list of observers
    private List<Observer> observerList;

    //it has its related data, which it wants to notify
    //to its observers
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update();
        }
    }

    //when subject gets the latest measurements/changes in state conditions,
    //it notifies observers
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
