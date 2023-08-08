package AbstractFactoryPattern.Factory.FactoryImpl;

import AbstractFactoryPattern.Factory.AbstractFactory;
import AbstractFactoryPattern.Factory.Color;
import AbstractFactoryPattern.Factory.Shape;
import AbstractFactoryPattern.Factory.colorImpl.Blue;
import AbstractFactoryPattern.Factory.colorImpl.Green;
import AbstractFactoryPattern.Factory.colorImpl.Red;


public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }
        if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
