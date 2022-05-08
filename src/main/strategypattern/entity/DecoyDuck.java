package main.strategypattern.entity;

public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Heya!!! I am a Decoy");
    }
}
