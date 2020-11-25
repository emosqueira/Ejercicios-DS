package e61;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Baraja {
    // Colección de cartas
    private final ArrayList<Carta> cartas = new ArrayList<>(); // No especificamos el tamaño

    // Comportamiento => Delegación
    public Baraja() {
        for (Palo palo : Palo.values())
            for (Numero numero : Numero.values())
                cartas.add(new Carta(numero, palo));
    }

    public Carta getCarta(int posicion) {
        if (posicion < 0 || posicion >= cartas.size())
            throw new IllegalArgumentException();
        return cartas.get(posicion);
    }

    public int getNumCartas() {
        return cartas.size();
    }

    public List<Carta> barajaALista() {
        return Collections.unmodifiableList(cartas);
    }

    public Mazo getMazo() {
        return new Mazo(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Carta c : cartas)
            sb.append(c.toString()); // Delegación - Limitado a métodos de Object
        return sb.toString();
    }

    public static void main(String[] args) {
        Baraja b = new Baraja();
        System.out.println(b.toString());
        Mazo m = b.getMazo();
        System.out.println(m);
        m.barajar();
        m.sacarCarta();
        m.sacarCarta();
        System.out.println(m);

        //----

        m = b.getMazo();
        System.out.println(m);

    }
}
