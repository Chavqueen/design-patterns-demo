package behavior.impl;

import behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak Squeak Squeak!!!");
    }
}
