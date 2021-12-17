package AbstractFactoryPractice.AbstractFactory;

import AbstractFactoryPractice.Product.Coupe;
import AbstractFactoryPractice.Product.HondaCoupe;
import AbstractFactoryPractice.Product.HondaSedan;
import AbstractFactoryPractice.Product.Sedan;

public class HondaFactory implements Factory{
    @Override
    public Sedan createSedan() {
        return new HondaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new HondaCoupe();
    }
}
