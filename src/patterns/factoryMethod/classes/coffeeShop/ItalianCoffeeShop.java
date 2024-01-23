package patterns.factoryMethod.classes.coffeeShop;

import patterns.factoryMethod.CoffeeType;
import patterns.factoryMethod.abstractClasses.Coffee;
import patterns.factoryMethod.abstractClasses.CoffeeShop;
import patterns.factoryMethod.classes.coffee.*;

public class ItalianCoffeeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case LATTE:
                coffee = new LatteItalianStyle(type);
                break;
            case ESPRESSO:
                coffee = new EspressoItalianStyle(type);
                break;
            case AMERICANO:
                coffee = new AmericanoItalianStyle(type);
                break;
            case CAPPUCCINO:
                coffee = new CappuccinoItalianStyle(type);
                break;
        }

        return coffee;
    }
}
