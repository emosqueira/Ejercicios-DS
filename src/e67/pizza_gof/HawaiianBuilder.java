package e67.pizza_gof;

import java.util.HashSet;
import java.util.Set;

// Aquí los Builders se limitan a construir las partes
public class HawaiianBuilder extends PizzaBuilder {
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
        toppings.add(Topping.HAM);
        toppings.add(Topping.PINEAPPLE);
    }

    public Pizza buildPizza(){
        return new Pizza(dough, sauce, cheese, toppings);
    }
}
