package Structural.Decorator.Coffee.Decorators;

import Structural.Decorator.Coffee.Coffee;

public class AbstructCoffeeDecorator implements Coffee {

    Coffee coffee;

    public AbstructCoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public int getPrice() {
        return coffee.getPrice();
    }
}
