package e25;

public record Carta(Numero numero, Palo palo) {
    @Override
    public String toString() {
        return "[" + numero + palo + "]";
    }
}
