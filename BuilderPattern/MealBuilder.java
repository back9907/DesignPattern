package BuilderPattern;

import BuilderPattern.impl.ChickenBurger;
import BuilderPattern.impl.Pepsi;
import BuilderPattern.impl.VegBurger;

/**
 * @Author
 * @Date 2023-08-09-10:43 pm
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
