package e66.solution_v2;

// now collaborator has 3 private fields and 2 public methods
public class Collaborator {
    private int property1;
    private int property2;
    private int property3;

    public int doSomething() {
        return (property3 * 100) + (property1 - property2);
    }

    public int calculateSomething() {
        return (property1 * property2) + property3;
    }
}


