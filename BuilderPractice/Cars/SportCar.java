package BuilderPractice.Cars;

import BuilderPractice.Builder.CarBuilder;
import BuilderPractice.Product.Car;

public class SportCar implements CarBuilder {
    private String name;
    private int price;
    private int year;

    @Override
    public CarBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public CarBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    @Override
    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    @Override
    public Car getResult() {
        return new Car(name, price, year);
    }
}
