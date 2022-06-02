package main.decoratorpattern.decorator.impl;

import main.decoratorpattern.component.Beverage;
import main.decoratorpattern.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    //composition
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    //extending functionality without inheritance
    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
