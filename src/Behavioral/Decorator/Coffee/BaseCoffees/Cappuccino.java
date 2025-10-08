package Behavioral.Decorator.Coffee.BaseCoffees;

import Behavioral.Decorator.Coffee.Coffee;

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
