package patterns.factoryMethod.abstractClasses;

import patterns.factoryMethod.CoffeeType;

public abstract class CoffeeShop {
    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);

        coffee.makeCoffee();
        coffee.pourInCup();
        return coffee;
    }
    public abstract Coffee createCoffee(CoffeeType type);
}
