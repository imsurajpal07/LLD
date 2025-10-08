package Behavioral.Decorator.Coffee.Decorators;

import Behavioral.Decorator.Coffee.Coffee;

public class HotChocolateDecorator extends AbstructCoffeeDecorator {

    public HotChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", Hot Chocolate";
    }

    public int getPrice() {
        return coffee.getPrice() + 10;
    }
}
