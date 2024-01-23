package patterns.factoryMethod.abstractClasses;

import patterns.factoryMethod.CoffeeType;

public abstract class Coffee {
    private CoffeeType type;

    public abstract void makeCoffee();

    public abstract void pourInCup();
}
