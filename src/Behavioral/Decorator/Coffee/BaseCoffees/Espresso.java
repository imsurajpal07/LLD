package Behavioral.Decorator.Coffee.BaseCoffees;

import Behavioral.Decorator.Coffee.Coffee;

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
