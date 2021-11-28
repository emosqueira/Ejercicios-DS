package e66.problem;

// https://danparkin.com/2018/09/18/tell-dont-ask/

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

    // this method uses none of client's internal state,
    // but it is interested in all of collaborator's state.
    // client is doing a lot of "asking" when it could be "telling" instead.
    public int doSomethingElse() {
        return (collaborator.property1 * collaborator.property2)
                + collaborator.property3;
    }
}
