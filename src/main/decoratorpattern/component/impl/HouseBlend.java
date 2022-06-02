package main.decoratorpattern.component.impl;

import main.decoratorpattern.component.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return .89;
    }
}
