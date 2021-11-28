package e67.pizza_chain;

public class Main {
    public static void main(String[] args) {
        // We can create specific pizzas using the Menu class
        Menu menu = new Menu();
        Pizza pizza1 = menu.pizzaMargherita();
        System.out.println(pizza1);

        Pizza pizza2 = menu.pizzaMarinara();
        System.out.println(pizza2);

        Pizza pizza3 = menu.pizzaHawaiian();
        System.out.println(pizza3);

        // Or build our own pizza using the Builder
        Pizza pizza4 = new PizzaBuilder()
                .setDough(Dough.THIN_CRISPY)
                .setSauce(Sauce.SPICY)
                .setCheese(Cheese.GORGONZOLA)
                .addTopping(Topping.CHICKEN)
                .addTopping(Topping.OREGANO)
                .buildPizza();

        System.out.println(pizza4);
    }
}
