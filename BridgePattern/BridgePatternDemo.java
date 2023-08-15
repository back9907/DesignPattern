package BridgePattern;

import BridgePattern.Impl.GreenCircle;
import BridgePattern.Impl.RedCircle;

/**
 * @Author
 * @Date 2023-08-12-3:05 pm
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
