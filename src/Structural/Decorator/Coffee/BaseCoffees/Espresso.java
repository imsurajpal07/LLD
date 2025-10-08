package Structural.Decorator.Coffee.BaseCoffees;

import Structural.Decorator.Coffee.Coffee;

public class Espresso implements Coffee {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public int getPrice() {
        return 50;
    }
}
