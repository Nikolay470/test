package patterns.factoryMethod.classes.coffeeShop;

import patterns.factoryMethod.CoffeeType;
import patterns.factoryMethod.abstractClasses.Coffee;
import patterns.factoryMethod.abstractClasses.CoffeeShop;
import patterns.factoryMethod.classes.coffee.AmericanoAmericanStyle;
import patterns.factoryMethod.classes.coffee.CappuccinoAmericanStyle;
import patterns.factoryMethod.classes.coffee.EspressoAmericanStyle;
import patterns.factoryMethod.classes.coffee.LatteAmericanStyle;

public class AmericanCoffeeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case LATTE:
                coffee = new LatteAmericanStyle(type);
                break;
            case ESPRESSO:
                coffee = new EspressoAmericanStyle(type);
                break;
            case AMERICANO:
                coffee = new AmericanoAmericanStyle(type);
                break;
            case CAPPUCCINO:
                coffee = new CappuccinoAmericanStyle(type);
                break;
        }

        return coffee;
    }
}
