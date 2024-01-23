package patterns.factoryMethod.classes.coffee;

import patterns.factoryMethod.abstractClasses.Coffee;
import patterns.factoryMethod.CoffeeType;

public class EspressoAmericanStyle extends Coffee {
    private CoffeeType type;

    public EspressoAmericanStyle(CoffeeType type) {
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
