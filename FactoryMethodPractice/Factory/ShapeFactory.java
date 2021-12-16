package FactoryMethodPractice.Factory;

import FactoryMethodPractice.Product.Shape;
import FactoryMethodPractice.Product.ShapeType;
import FactoryMethodPractice.Shapes.Circle;
import FactoryMethodPractice.Shapes.Rectangle;
import FactoryMethodPractice.Shapes.Square;

public class ShapeFactory {
     public static Shape createFigure(ShapeType type){
          Shape figure = null;
          if(type.equals(ShapeType.CIRCLE)){
               figure = new Circle();
          } else if(type.equals(ShapeType.SQUARE)){
               figure = new Square();
          } else if(type.equals(ShapeType.RECTANGLE)){
               figure = new Rectangle();
          }
          return figure;
     }
}
