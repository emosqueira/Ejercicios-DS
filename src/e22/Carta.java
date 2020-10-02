package e22;

public class Carta {
    // Estado - Definidos final porque la clase es inmutable
    private final int numero;
    private final String palo;

    // Comportamiento
    // getters
    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    // setters - Eliminados para hacer la clase inmutable

    // Creación de objetos

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null) { return false; }
        if (this.getClass() != obj.getClass()) { return false; }

        // obj es una carta no nula y no igual a this
        Carta carta = (Carta) obj;
        if (this.numero != carta.numero) { return false; }
        return this.palo.equals(carta.palo);
    }

    public int hashCode() { // hash 31
        int result = numero;
        result = 31 * result + palo.hashCode();
        return result;
    }

    public static void main(String[] args) {
        Carta c1 = new Carta(5, "Espadas");
        Carta c2 = new Carta(5, "Espadas");
        Carta c3 = new Carta(5, "Oros");

           //   ==
        if (c1.equals(c2))
            System.out.println("son iguales");
        else
            System.out.println("Son distintas");

        System.out.println("c1.hashCode() = " + c1.hashCode());
        System.out.println("c2.hashCode() = " + c2.hashCode());
        System.out.println("c3.hashCode() = " + c3.hashCode());

    }
}
