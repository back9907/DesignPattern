package BridgePattern;

/**
 * @Author
 * @Date 2023-08-12-3:00 pm
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
