package Creational.AbstructFactory.OSSystem.ConcreteFactory;

import Creational.AbstructFactory.OSSystem.AbstractFactory.GUIFactory;
import Creational.AbstructFactory.OSSystem.AbstractProductInterfaces.Button;
import Creational.AbstructFactory.OSSystem.AbstractProductInterfaces.CheckBox;

import Creational.AbstructFactory.OSSystem.ConcreteProducts.WindowsButton;
import Creational.AbstructFactory.OSSystem.ConcreteProducts.WindowsCheckBox;



public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckBox();
    }

}
