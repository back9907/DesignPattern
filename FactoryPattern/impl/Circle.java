package FactoryPattern.impl;

import FactoryPattern.Shape;

public class Circle implements Shape {
    @Override
    public void draw(){
        System.out.println("this is a circle");
    }
}
