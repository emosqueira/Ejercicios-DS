package e66.solution_v3;

public class Client {
    private final Collaborator collaborator;
    private int clientInternalDetail1;
    private int clientInternalDetail2;

    public Client(Collaborator collaborator) {
        this.collaborator = collaborator;
        clientInternalDetail1 = 10;
        clientInternalDetail2 = 20;
    }

    public int doSomething() {
        return clientInternalDetail1 + clientInternalDetail2;
    }

    // client knows nothing about the internal change to collaborator
    public int doSomethingElse() {
        return collaborator.calculateSomething();
    }
}
