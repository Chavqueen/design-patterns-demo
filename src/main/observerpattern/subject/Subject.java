package main.observerpattern.subject;


import main.observerpattern.observers.Observer;

//this interface is reusable
//we can plug-in any subject of any form
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
