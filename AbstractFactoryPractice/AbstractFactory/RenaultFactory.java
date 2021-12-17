package AbstractFactoryPractice.AbstractFactory;

import AbstractFactoryPractice.Product.Coupe;
import AbstractFactoryPractice.Product.RenaultCoupe;
import AbstractFactoryPractice.Product.RenaultSedan;
import AbstractFactoryPractice.Product.Sedan;

public class RenaultFactory implements Factory{
    @Override
    public Sedan createSedan() {
        return new RenaultSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new RenaultCoupe();
    }
}
