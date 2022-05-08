package main.strategypattern.behavior.impl;

import main.strategypattern.behavior.FlyBehavior;

public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I do not fly!!!");
    }
}
