package behavior.impl;

import behavior.FlyBehavior;

public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I do not fly!!!");
    }
}
