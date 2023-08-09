package BuilderPattern.impl.abstractClass;

import BuilderPattern.Item;
import BuilderPattern.Packing;
import BuilderPattern.impl.Bottle;

/**
 * @Author
 * @Date 2023-08-09-8:27 pm
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
