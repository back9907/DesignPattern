package FactoryPattern.impl;

import FactoryPattern.Shape;

public class Square implements Shape {
    @Override
    public void draw(){
        System.out.println("this is a square");
    }
}
