package FactoryPattern.impl;

import FactoryPattern.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw(){
        System.out.println("this is a rectangle");
    }
}
