package AbstractFactoryPattern;

import AbstractFactoryPattern.Factory.AbstractFactory;
import AbstractFactoryPattern.Factory.Color;
import AbstractFactoryPattern.Factory.Shape;


public class demo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        Shape shape1 = shapeFactory.getShape("Circle");

        shape1.draw();

        Shape shape2 = shapeFactory.getShape("recTangle");

        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Square");

        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        Color color1 = colorFactory.getColor("RED");

        color1.fill();

        Color color2 = colorFactory.getColor("Green");

        color2.fill();

        Color color3 = colorFactory.getColor("Blue");

        color3.fill();
    }

}
