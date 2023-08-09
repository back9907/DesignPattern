package BuilderPattern.impl;

import BuilderPattern.Packing;

/**
 * @Author
 * @Date 2023-08-09-8:23 pm
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
