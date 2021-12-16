package BuilderPractice.Builder;

import BuilderPractice.Product.Car;

public interface CarBuilder {
    CarBuilder setName(String name);
    CarBuilder setPrice(int price);
    CarBuilder setYear(int year);

    Car getResult();
}
