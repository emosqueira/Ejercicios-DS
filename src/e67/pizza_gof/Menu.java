package e67.pizza_gof;

// El director decide el orden en que se añaden las partes
// Puede haber distintas formas de construir el producto,
// con más o menos partes.
public class Menu {

    public void buildNormal(PizzaBuilder builder) {
        builder.setDough();
        builder.setSauce();
        builder.setCheese();
        builder.addTopping();
    }

    public void buildWithoutToppings(PizzaBuilder builder) {
        builder.setDough();
        builder.setSauce();
        builder.setCheese();
    }
}
