package FacadePattern.Impl;

import FacadePattern.Shape;

/**
 * @Author
 * @Date 2023-08-16-10:09 am
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is a circle");
    }
}
