package main.decoratorpattern.component.impl;

import main.decoratorpattern.component.Beverage;

public class Espresso extends Beverage {

    public Espresso(){
        //inherited from beverage
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
