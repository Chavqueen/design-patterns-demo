package main.strategypattern.behavior.impl;

import main.strategypattern.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack Quack!!!");
    }
}
