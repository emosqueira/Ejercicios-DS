package e66.solution_v1;

// all of collaborator's properties are publicly exposed
public class Collaborator {
    public int property1;
    public int property2;
    public int property3;

    public int doSomething() {
        return (property3 * 100) + (property1 - property2);
    }
}


