package FacadePattern.Impl;


import FacadePattern.Shape;

/**
 * @Author
 * @Date 2023-08-16-10:08 am
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is a rectangle");
    }
}
