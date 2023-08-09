package BuilderPattern.impl;

import BuilderPattern.impl.abstractClass.Burger;

/**
 * @Author
 * @Date 2023-08-09-8:27 pm
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
