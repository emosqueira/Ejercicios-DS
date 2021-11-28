package e66.solution_v3;

// now collaborator has changed how it does its business
public class Collaborator {
    private Thing thing;
    private int property3;

    public Collaborator(Thing thing) {
        this.thing = thing;
    }

    public int doSomething() {
        return (property3 * 100) + thing.someOtherCalculation();
    }

    public int calculateSomething() {
        return thing.someOtherCalculation() + property3;
    }
}