package Creational.AbstructFactory.OSSystem.ConcreteFactory;

import Creational.AbstructFactory.OSSystem.AbstractFactory.GUIFactory;
import Creational.AbstructFactory.OSSystem.AbstractProductInterfaces.Button;
import Creational.AbstructFactory.OSSystem.AbstractProductInterfaces.CheckBox;
import Creational.AbstructFactory.OSSystem.ConcreteProducts.MacButton;
import Creational.AbstructFactory.OSSystem.ConcreteProducts.MacCheckBox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacCheckBox();
    }
}
