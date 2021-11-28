package e66.solution_v1;

public class Client {
    private final Collaborator collaborator;
    private int clientInternalDetail1;
    private int clientInternalDetail2;

    public Client(Collaborator collaborator) {
        this.collaborator = collaborator;
        clientInternalDetail1 = 10;
        clientInternalDetail2 = 20;
    }

    // this method makes use of client's internal state
    public int doSomething() {
        return clientInternalDetail1 + clientInternalDetail2;
    }

    // extract the behaviour that is doing the asking.
    // this will be moved onto collaborator
    public int doSomethingElse() {
        return calculateSomething();
    }

    // next we use move method and move the extracted method to collaborator
    private int calculateSomething() {
        return (collaborator.property1 * collaborator.property2)
                + collaborator.property3;
    }
}
