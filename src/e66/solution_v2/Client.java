package e66.solution_v2;

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

    // now client delegates the calculation to collaborator.
    // it no longer knows about property1, 2 and 3 of collaborator.
    public int doSomethingElse() {
        return collaborator.calculateSomething();
    }
}
