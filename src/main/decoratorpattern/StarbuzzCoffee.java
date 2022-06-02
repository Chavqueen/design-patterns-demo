package main.decoratorpattern;

import main.decoratorpattern.component.Beverage;
import main.decoratorpattern.component.impl.Espresso;
import main.decoratorpattern.component.impl.HouseBlend;
import main.decoratorpattern.decorator.impl.Mocha;

//decorator pattern is used to extend functionality
//favoring composition over inheritance

//design principle used - open for extension, closed for modification
public class StarbuzzCoffee {

    public static void main(String[] args) {

        //beverage without any decorators
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        //beverage with mocha as decorator or wrapper
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

    }
}
