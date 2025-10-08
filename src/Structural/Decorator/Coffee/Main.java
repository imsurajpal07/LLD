package Structural.Decorator.Coffee;

import Structural.Decorator.Coffee.BaseCoffees.Cappuccino;
import Structural.Decorator.Coffee.BaseCoffees.Espresso;
import Structural.Decorator.Coffee.Decorators.HotChocolateDecorator;
import Structural.Decorator.Coffee.Decorators.StreamedMilkDecorator;

public class Main {

    public static void main(String[] args) {
        Coffee espresso = new StreamedMilkDecorator(new HotChocolateDecorator( new Espresso()));
        System.out.println(espresso.getDescription());
        System.out.println(espresso.getPrice());

        Coffee cappuccino = new StreamedMilkDecorator(new HotChocolateDecorator( new Cappuccino()));
        System.out.println(cappuccino.getDescription());
        System.out.println(cappuccino.getPrice());
    }
}
