package FactoryMethodPractice.Shapes;

import FactoryMethodPractice.Product.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    public Square() {
        System.out.println("Square was created!");
    }
}
