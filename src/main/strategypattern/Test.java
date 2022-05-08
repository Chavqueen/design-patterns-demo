package main.strategypattern;

import main.strategypattern.behavior.impl.FlyWithWings;
import main.strategypattern.behavior.impl.NoFlyBehavior;
import main.strategypattern.behavior.impl.Quack;
import main.strategypattern.behavior.impl.Squeak;
import main.strategypattern.entity.DecoyDuck;
import main.strategypattern.entity.Duck;
import main.strategypattern.entity.MallardDuck;

/*Strategy Pattern - abstracting out set of algorithms, so they can vary independently*/
//Another way of re-using code, than inheritance

public class Test {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        //we can dynamically set/change behaviors from here, without touching
        //any impl
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("\n");

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.setFlyBehavior(new NoFlyBehavior());
        decoyDuck.setQuackBehavior(new Squeak());
        decoyDuck.performFly();
        decoyDuck.performQuack();
    }
}

/*

Expected Output -

Heya!! I am a mallard
Every duck swims!!!
I fly high!!!
Quack Quack Quack!!!


Heya!!! I am a Decoy
Every duck swims!!!
I do not fly!!!
Squeak Squeak Squeak!!!*/
