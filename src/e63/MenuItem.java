package e63;

public class MenuItem extends MenuComponent {

    private boolean vegetarian;
    private double price;

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price) {
        super(name, description);
        this.vegetarian = vegetarian;
        this.price = price;
    }
    // Specific methods of MenuItem
    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    // Implementation of print()
    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println(" -- " + getDescription());
    }
}

