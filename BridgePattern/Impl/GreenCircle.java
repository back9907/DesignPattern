package BridgePattern.Impl;

import BridgePattern.DrawAPI;

/**
 * @Author
 * @Date 2023-08-12-3:00 pm
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
