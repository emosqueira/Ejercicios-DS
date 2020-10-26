package e35.genericidad;

// public enum Numero {AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO, REY}

public enum Numero {
    AS("A"),
    DOS("2"),
    TRES("3"),
    CUATRO("4"),
    CINCO("5"),
    SEIS("6"),
    SIETE("7"),
    SOTA("S"),
    CABALLO("C"),
    REY("R");

    private final String abreviatura;

    Numero(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    @Override
    public String toString() {
        return abreviatura;
    }
}