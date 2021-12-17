package AbstractFactoryPractice;

import AbstractFactoryPractice.AbstractFactory.Factory;
import AbstractFactoryPractice.AbstractFactory.HondaFactory;
import AbstractFactoryPractice.AbstractFactory.RenaultFactory;
import AbstractFactoryPractice.Product.Coupe;
import AbstractFactoryPractice.Product.Sedan;

/**
 * @author Max Steblevskiy(JavaAbuser) on 17.12.2021
 */
public class Main {
    public static void main(String[] args) {
        Factory hondaFactory = new HondaFactory();
        Coupe coupe = hondaFactory.createCoupe();
        coupe.doorCount();

        System.out.println("---------------");

        Factory renaultFactory = new RenaultFactory();
        Sedan sedan = renaultFactory.createSedan();
        sedan.doorCount();

        System.out.println("---------------");

        Factory renaultFactory2 = new RenaultFactory();
        Coupe coupe2 = renaultFactory2.createCoupe();
        coupe2.doorCount();

    }
}
