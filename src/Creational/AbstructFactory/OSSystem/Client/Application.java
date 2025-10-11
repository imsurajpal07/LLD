package Creational.AbstructFactory.OSSystem.Client;

import Creational.AbstructFactory.OSSystem.AbstractFactory.GUIFactory;
import Creational.AbstructFactory.OSSystem.AbstractProductInterfaces.Button;
import Creational.AbstructFactory.OSSystem.AbstractProductInterfaces.CheckBox;


public class Application {
    private final Button button;
    private final CheckBox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.createButton();
        checkbox.createCheckBox();
    }
}
