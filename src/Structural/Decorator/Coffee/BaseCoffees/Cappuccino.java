package Structural.Decorator.Coffee.BaseCoffees;

import Structural.Decorator.Coffee.Coffee;

public class Cappuccino implements Coffee {
    @Override
    public String getDescription() {
        return "Cappuccino";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
