package AbstractFactoryPattern;

import AbstractFactoryPattern.Factory.AbstractFactory;
import AbstractFactoryPattern.Factory.FactoryImpl.ColorFactory;
import AbstractFactoryPattern.Factory.FactoryImpl.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
