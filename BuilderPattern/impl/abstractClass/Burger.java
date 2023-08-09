package BuilderPattern.impl.abstractClass;

import BuilderPattern.Item;
import BuilderPattern.Packing;
import BuilderPattern.impl.Wrapper;

/**
 * @Author
 * @Date 2023-08-09-8:24 pm
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
