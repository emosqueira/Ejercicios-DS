package e67.pizza_chain;

import java.util.HashSet;
import java.util.Set;

public class PizzaBuilder {

    private Dough dough;
    private Sauce sauce;
    private Cheese cheese;
    private Set<Topping> toppings = new HashSet<>();

    public PizzaBuilder setDough(Dough dough){
        this.dough = dough;
        return this;
    }
    public PizzaBuilder setSauce(Sauce sauce){
        this.sauce = sauce;
        return this;
    }
    public PizzaBuilder setCheese(Cheese cheese){
        this.cheese = cheese;
        return this;
    }
    public PizzaBuilder addTopping(Topping topping){
        this.toppings.add(topping);
        return this;
    }
    public Pizza buildPizza(){
        return new Pizza(dough, sauce, cheese, toppings);
    }

}
