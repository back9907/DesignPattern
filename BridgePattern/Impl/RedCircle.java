package BridgePattern.Impl;

import BridgePattern.DrawAPI;

/**
 * @Author
 * @Date 2023-08-12-2:59 pm
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
