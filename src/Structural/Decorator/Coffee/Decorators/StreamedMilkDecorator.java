package Structural.Decorator.Coffee.Decorators;

import Structural.Decorator.Coffee.Coffee;

public class StreamedMilkDecorator extends AbstructCoffeeDecorator {

    public StreamedMilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 15;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Streamed Milk";
    }
}
