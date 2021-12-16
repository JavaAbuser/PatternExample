package FactoryMethodPractice.Shapes;

import FactoryMethodPractice.Product.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public Rectangle() {
        System.out.println("Rectangle was created!");
    }
}
