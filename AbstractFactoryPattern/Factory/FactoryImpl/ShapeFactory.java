package AbstractFactoryPattern.Factory.FactoryImpl;

import AbstractFactoryPattern.Factory.AbstractFactory;
import AbstractFactoryPattern.Factory.Color;
import AbstractFactoryPattern.Factory.Shape;
import AbstractFactoryPattern.Factory.shapeImpl.Circle;
import AbstractFactoryPattern.Factory.shapeImpl.Rectangle;
import AbstractFactoryPattern.Factory.shapeImpl.Square;


public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
