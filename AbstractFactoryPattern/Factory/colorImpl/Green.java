package AbstractFactoryPattern.Factory.colorImpl;

import AbstractFactoryPattern.Factory.Color;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Green");
    }
}
