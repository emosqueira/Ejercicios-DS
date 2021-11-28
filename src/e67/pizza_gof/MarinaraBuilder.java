package e67.pizza_gof;

import java.util.HashSet;
import java.util.Set;

public class MarinaraBuilder extends PizzaBuilder {
    private Dough dough;
    private Sauce sauce;
    private Cheese cheese;
    private Set<Topping> toppings;

    @Override
    public void setDough() {
        dough = Dough.TRADITIONAL;
    }

    @Override
    public void setSauce() {
        sauce = Sauce.TOMATO;
    }

    @Override
    public void setCheese() {
        cheese = Cheese.MOZZARELLA;
    }

    @Override
    public void addTopping() {
        toppings = new HashSet<>();
        toppings.add(Topping.GARLIC);
        toppings.add(Topping.OLIVE_OIL);
    }

    public Pizza buildPizza(){
        return new Pizza(dough, sauce, cheese, toppings);
    }
}
