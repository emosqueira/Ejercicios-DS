package e23;

public enum Numero {
    AS("1"),
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
