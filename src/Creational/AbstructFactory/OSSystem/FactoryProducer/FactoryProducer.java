package Creational.AbstructFactory.OSSystem.FactoryProducer;

import Creational.AbstructFactory.OSSystem.AbstractFactory.GUIFactory;
import Creational.AbstructFactory.OSSystem.ConcreteFactory.MacFactory;
import Creational.AbstructFactory.OSSystem.ConcreteFactory.WindowsFactory;

public class FactoryProducer {

    public static GUIFactory getFactory(String osName) {
        if (osName.equalsIgnoreCase("Windows")) {
            return new WindowsFactory();
        } else if (osName.equalsIgnoreCase("Mac")) {
            return new MacFactory();
        } else {
            throw new IllegalArgumentException("Unknown OS: " + osName);
        }
    }
}
