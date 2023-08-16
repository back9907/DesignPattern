package FacadePattern.Impl;

import FacadePattern.Shape;

/**
 * @Author
 * @Date 2023-08-16-10:28 am
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("This is shape");
    }
}
