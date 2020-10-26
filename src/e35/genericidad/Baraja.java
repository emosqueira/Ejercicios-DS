package e35.genericidad;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    // Estado => Composición
    // Colección de cartas
    private ArrayList<Carta> cartas = new ArrayList<>(); // No especificamos tamaño
                                                // El array es ahora de Cartas
    // int cima; // No necesitamos una cima para marcar el final

    // Comportamiento => Delegación
    public Baraja() {
        // int i=0; // No necesitamos llevar un índice
        for (Palo palo : Palo.values())
            for (Numero numero : Numero.values())
                cartas.add(new Carta(numero, palo));
        // cartas.add("Hola Mundo");  // Intentar meter algo que no sea una carta => Error compilación
    }                                 // Las colecciones son seguras

    public void introducirCarta(Carta c) {
        // if (cima == 39)
        //    throw new IllegalStateException("Baraja llena");
        // El array está limitado en el tamaño
        // Un ArrayList es "infinito"...
        cartas.add(c);
    }

    public Carta sacarCarta() {
        if (cartas.isEmpty())  // Sigue siendo necesario comprobar si la baraja está vacía
            throw new IllegalStateException("Baraja vacía");
        Carta result = cartas.get(cartas.size()-1); // NO typecast
        cartas.remove(cartas.size()-1);
        return result;
    }

    public void barajar() {
        Collections.shuffle(cartas); // mucho más fácil ahora
//        Random rand = new Random();
//        for (int i = 0; i <= cima; i++) {
//            int index = rand.nextInt(cima+1);
//            Carta temp = cartas[index];
//            cartas[index] = cartas[i];
//            cartas[i] = temp;
//        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Carta c : cartas) // La lista es de Cartas
            sb.append(c.toString()); // en Carta está toString()
        return sb.toString();        // Podemos sin problemas llamar a métodos de Carta
    }

    // ¿debería ser inmutable? => NO

    public static void main(String[] args) {
        Baraja b = new Baraja();
        System.out.println(b);
        Carta c;
        c = b.sacarCarta(); // c = [RO]
        System.out.println(b);
        System.out.println("c = " + c); // [RO]
        b.introducirCarta(c);
        System.out.println(b);
        b.barajar();
        System.out.println(b);
    }
}
