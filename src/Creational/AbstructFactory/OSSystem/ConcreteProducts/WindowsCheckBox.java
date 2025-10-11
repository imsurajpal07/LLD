package Creational.AbstructFactory.OSSystem.ConcreteProducts;

import Creational.AbstructFactory.OSSystem.AbstractProductInterfaces.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void createCheckBox() {
        System.out.println("created windows check box.");
    }
}
