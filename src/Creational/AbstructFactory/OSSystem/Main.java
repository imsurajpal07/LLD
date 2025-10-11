package Creational.AbstructFactory.OSSystem;

import Creational.AbstructFactory.OSSystem.AbstractFactory.GUIFactory;
import Creational.AbstructFactory.OSSystem.Client.Application;
import Creational.AbstructFactory.OSSystem.FactoryProducer.FactoryProducer;

public class Main {
    public static void main(String[] args) {

        GUIFactory windows = FactoryProducer.getFactory("Windows");
        GUIFactory mac = FactoryProducer.getFactory("Mac");

        Application windowsApplication = new Application(windows);
        Application macApplication = new Application(mac);
        windowsApplication.render();
        macApplication.render();
    }
}
