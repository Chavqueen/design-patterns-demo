package main.decoratorpattern.component;

//convention to be an abstract class
//but can also be an interface
public abstract class Beverage {
    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    //abstract method to be implemented by concrete components
    public abstract double cost();
}
