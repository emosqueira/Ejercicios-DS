package e24;

public enum Palo {
    ESPADAS("E"),
    BASTOS("B"),
    OROS("O"),
    COPAS("C");

    private final String abreviatura;

    Palo(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    @Override
    public String toString() {
        return abreviatura;
    }
}
