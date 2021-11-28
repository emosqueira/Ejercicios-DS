package e63;

public abstract class MenuComponent {
    private String name; // Common properties of all menu components
    private String description;

    public MenuComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    // abstract method
    public abstract void print();

    // maximizing the MenuComponent interface
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
}

