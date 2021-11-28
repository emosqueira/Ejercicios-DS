package e63;

import java.util.ArrayList;

public class Menu extends MenuComponent {
    private ArrayList<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name, String description) {
        super(name, description);
    }

    // Specific methods of Menu
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    // Implementation of print()
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        for(MenuComponent mc : menuComponents)
            mc.print();
    }
}

