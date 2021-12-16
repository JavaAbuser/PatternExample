package FactoryMethodPractice.Shapes;

import FactoryMethodPractice.Product.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    public Circle() {
        System.out.println("Circle was created!");
    }
}
