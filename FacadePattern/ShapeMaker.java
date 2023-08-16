package FacadePattern;

import FacadePattern.Impl.Circle;
import FacadePattern.Impl.Rectangle;
import FacadePattern.Impl.Square;

/**
 * @Author
 * @Date 2023-08-16-10:30 am
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
