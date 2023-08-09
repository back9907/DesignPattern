package BuilderPattern.impl;

import BuilderPattern.impl.abstractClass.ColdDrink;

/**
 * @Author
 * @Date 2023-08-09-8:30 pm
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
