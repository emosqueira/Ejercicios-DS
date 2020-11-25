package e61;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Mazo {
    // Colección de cartas
    private final ArrayList<Carta> cartas = new ArrayList<>(); // No especificamos el tamaño

    public Mazo(Baraja baraja) {
        for (int i = 0; i < baraja.getNumCartas(); i++) {
            cartas.add(baraja.getCarta(i));
        }
    }

    public Carta getCarta(int posicion) {
        if (posicion < 0 || posicion >= cartas.size())
            throw new IllegalArgumentException();
        return cartas.get(posicion);
    }

    public int getNumCartas() {
        return cartas.size();
    }

    public void introducirCarta(Carta c) {
        cartas.add(c);
    }

    public void introducirCartas(Collection<Carta> c) {
        cartas.addAll(c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Carta c : cartas)
            sb.append(c.toString()); // Delegación - Limitado a métodos de Object
        return sb.toString();
    }

    public Carta sacarCarta() {
        if (cartas.isEmpty())
            throw new IllegalStateException("Baraja vacía");
        Carta result = cartas.get(cartas.size()-1);  // NO typecast
        cartas.remove(cartas.size()-1);
        return result;
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }
}
