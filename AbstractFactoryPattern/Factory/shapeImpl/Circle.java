package AbstractFactoryPattern.Factory.shapeImpl;


import AbstractFactoryPattern.Factory.Shape;

public class Circle implements Shape {
    @Override
    public void draw(){
        System.out.println("this is a circle");
    }
}
