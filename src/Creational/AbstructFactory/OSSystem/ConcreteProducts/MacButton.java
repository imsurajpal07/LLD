package Creational.AbstructFactory.OSSystem.ConcreteProducts;

import Creational.AbstructFactory.OSSystem.AbstractProductInterfaces.Button;

public class MacButton implements Button {
    @Override
    public void createButton() {
        System.out.println("Created mac button.");
    }
}
