package patterns.factoryMethod;

import patterns.factoryMethod.abstractClasses.Coffee;
import patterns.factoryMethod.abstractClasses.CoffeeShop;
import patterns.factoryMethod.classes.coffeeShop.AmericanCoffeeShop;
import patterns.factoryMethod.classes.coffeeShop.ItalianCoffeeShop;

public class Program {
    public static void main(String[] args) {
        CoffeeShop americanShop = new AmericanCoffeeShop();
        CoffeeShop italianShop = new ItalianCoffeeShop();

        Coffee coffee = americanShop.orderCoffee(CoffeeType.CAPPUCCINO);
        if (coffee != null) {
            System.out.println("Вот ваш кофе");
        }

        coffee = italianShop.orderCoffee(CoffeeType.ESPRESSO);
        if (coffee != null) {
            System.out.println("Ваш коофе готов");
        }
    }
}
