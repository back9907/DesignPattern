package BuilderPattern.impl;

import BuilderPattern.impl.abstractClass.Burger;

/**
 * @Author
 * @Date 2023-08-09-8:28 pm
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
