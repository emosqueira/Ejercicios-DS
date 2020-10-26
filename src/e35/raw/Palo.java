package e35.raw;

// public enum Palo {ESPADAS, COPAS, BASTOS, OROS}

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