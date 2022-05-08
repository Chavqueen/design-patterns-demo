package main.strategypattern.behavior.impl;

import main.strategypattern.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I fly high!!!");
    }
}
