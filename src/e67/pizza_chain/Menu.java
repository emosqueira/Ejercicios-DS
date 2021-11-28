package e67.pizza_chain;

public class Menu {

    public Pizza pizzaMargherita() {
        return new PizzaBuilder()
                .setDough(Dough.TRADITIONAL)
                .setSauce(Sauce.TOMATO)
                .setCheese(Cheese.MOZZARELLA)
                .addTopping(Topping.BASIL)
                .buildPizza();
    }

    public Pizza pizzaMarinara() {
        return new PizzaBuilder()
                .setDough(Dough.TRADITIONAL)
                .setSauce(Sauce.TOMATO)
                .setCheese(Cheese.MOZZARELLA)
                .addTopping(Topping.GARLIC)
                .addTopping(Topping.OLIVE_OIL)
                .buildPizza();
    }

    public Pizza pizzaHawaiian() {
        return new PizzaBuilder()
                .setDough(Dough.TRADITIONAL)
                .setSauce(Sauce.TOMATO)
                .setCheese(Cheese.MOZZARELLA)
                .addTopping(Topping.HAM)
                .addTopping(Topping.PINEAPPLE)
                .buildPizza();
    }
}
