package Creational.AbstructFactory.OSSystem.AbstractFactory;

import Creational.AbstructFactory.OSSystem.AbstractProductInterfaces.Button;
import Creational.AbstructFactory.OSSystem.AbstractProductInterfaces.CheckBox;


public interface GUIFactory {

    Button createButton();

    CheckBox createCheckbox();
}
