package e67.pizza_gof;

import java.util.Collections;
import java.util.Set;

public class Pizza {

    private final Dough dough;
    private final Sauce sauce;
    private final Cheese cheese;
    private final Set<Topping> toppings;

    public Pizza(Dough dough, Sauce sauce, Cheese cheese, Set<Topping> toppings) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
    }

    // some getters...
    public Dough getDough() {
        return dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public Set<Topping> getToppings() {
        return Collections.unmodifiableSet(toppings);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", toppings=" + toppings +
                '}';
    }
}
