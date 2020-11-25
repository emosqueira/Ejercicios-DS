package e61;

public final class Carta {
    // Estado - Definidos final porque la clase es inmutable
    private final Numero numero;
    private final Palo palo;

    // Comportamiento
    // getters
    public Numero getNumero() {
        return numero;
    }
    public Palo getPalo() {
        return palo;
    }

    // setters - Eliminados para hacer la clase inmutable

    // Creación de objetos
    public Carta(Numero numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Carta carta = (Carta) o;

        if (numero != carta.numero) return false;
        return palo.equals(carta.palo);
    }

    @Override
    public int hashCode() {
        int result = numero.hashCode();
        result = 31 * result + palo.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "[" + numero + palo + "]";
    }
}
