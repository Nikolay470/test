package patterns.factoryMethod.classes.coffee;

import patterns.factoryMethod.CoffeeType;
import patterns.factoryMethod.abstractClasses.Coffee;

public class LatteAmericanStyle extends Coffee {
    private CoffeeType type;

    public LatteAmericanStyle(CoffeeType type) {
        this.type = type;
    }
    @Override
    public void makeCoffee() {
        System.out.println("Кофе готовится ...");
    }

    @Override
    public void pourInCup() {
        System.out.println("Наливаем кофе в чашку ...");
    }
}
