package e23;

public class Carta {
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

    public static void main(String[] args) {
        Carta c1 = new Carta(Numero.CINCO, Palo.ESPADAS);
        Carta c2 = new Carta(Numero.CINCO, Palo.ESPADAS);
        Carta c3 = new Carta(Numero.CINCO, Palo.OROS);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

           //   ==
        if (c1.equals(c2))
            System.out.println("c1 y c2 son iguales");
        else
            System.out.println("c1 y c2 on distintas");

        System.out.println("c1.hashCode() = " + c1.hashCode());
        System.out.println("c2.hashCode() = " + c2.hashCode());
        System.out.println("c3.hashCode() = " + c3.hashCode());

        System.out.println("Palos");
        for(Palo p : Palo.values())
            System.out.println(p);

        System.out.println("Números");
        for (Numero n : Numero.values())
            System.out.println(n);

        if(Numero.SOTA.ordinal() > Numero.DOS.ordinal())
            System.out.println("sota > dos");
    }
}
