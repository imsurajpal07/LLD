package Creational.AbstructFactory.OSSystem.ConcreteProducts;

import Creational.AbstructFactory.OSSystem.AbstractProductInterfaces.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void createCheckBox() {
        System.out.println("Created mac checkbox.");
    }
}
