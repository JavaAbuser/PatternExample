package AbstractFactoryPractice.AbstractFactory;

import AbstractFactoryPractice.Product.Coupe;
import AbstractFactoryPractice.Product.Sedan;

public interface Factory {
    Sedan createSedan();
    Coupe createCoupe();
}
