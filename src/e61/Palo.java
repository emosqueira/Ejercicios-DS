package e61;

public enum Palo {
    ESPADAS("E"),
    COPAS("C"),
    BASTOS("B"),
    OROS("O");

    private final String abreviatura;

    Palo(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    @Override
    public String toString() {
        return abreviatura;
    }
}
