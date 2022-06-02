package main.decoratorpattern.decorator;

import main.decoratorpattern.component.Beverage;

//decorator has to have the same type as the component
//it is going to decorate
public abstract class CondimentDecorator extends Beverage {

    //decorator has an instance of component
    public Beverage beverage;

    //need to implemented by concrete decorators
    public abstract String getDescription();
}
