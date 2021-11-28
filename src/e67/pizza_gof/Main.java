package e67.pizza_gof;

public class Main {
    public static void main(String[] args) {
        // We can create specific pizzas using the Menu class
        var menu = new Menu();
        var margheritaBuilder = new MargheritaBuilder();
        var marinaraBuilder = new MarinaraBuilder();
        var hawaiianBuilder = new HawaiianBuilder();

        // Sinceramente creo que "buildPizza()" debería estar en el
        // builder abstracto, no entiendo por qué GOF lo pone solo
        // en los builders concretos.
        menu.buildNormal(margheritaBuilder);
        Pizza pizza1 = margheritaBuilder.buildPizza();
        System.out.println(pizza1);

        menu.buildNormal(marinaraBuilder);
        Pizza pizza2 = marinaraBuilder.buildPizza();
        System.out.println(pizza2);

        menu.buildWithoutToppings(hawaiianBuilder);
        Pizza pizza3 = hawaiianBuilder.buildPizza();
        System.out.println(pizza3);

        // Para construir un pizza particular ahora habría que crear una
        // clase que implementara los métodos abstractos de PizzaBuilder
//        Pizza pizza4 = new PizzaBuilder()
//                .setDough(Dough.THIN_CRISPY)
//                .setSauce(Sauce.SPICY)
//                .setCheese(Cheese.GORGONZOLA)
//                .addTopping(Topping.CHICKEN)
//                .addTopping(Topping.OREGANO)
//                .buildPizza();
//
//        System.out.println(pizza4);
    }
}
