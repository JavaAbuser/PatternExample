package FactoryMethodPractice;

import FactoryMethodPractice.Factory.ShapeFactory;
import FactoryMethodPractice.Product.Shape;
import FactoryMethodPractice.Product.ShapeType;

public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.createFigure(ShapeType.CIRCLE);
        circle.draw();

        Shape square = ShapeFactory.createFigure(ShapeType.SQUARE);
        square.draw();

        Shape rectangle = ShapeFactory.createFigure(ShapeType.RECTANGLE);
        rectangle.draw();
    }
}
