package main.strategypattern.entity;

import main.strategypattern.behavior.FlyBehavior;
import main.strategypattern.behavior.QuackBehavior;

public abstract class Duck {

    //Coded to the interface not implementation
    public FlyBehavior flyBehavior;

    //favoring composition over inheritance
    public QuackBehavior quackBehavior;

    //code-reuse
    public void swim(){
        System.out.println("Every duck swims!!!");
    }

    //polymorphism
    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
