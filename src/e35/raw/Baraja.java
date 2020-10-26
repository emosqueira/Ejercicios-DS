package e35.raw;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    // Estado => Composición
    // Colección de cartas
    private ArrayList cartas = new ArrayList(); // No especificamos tamaño
                                                // El array es de Object
    // int cima; // No necesitamos una cima para marcar el final

    // Comportamiento => Delegación
    public Baraja() {
        // int i=0; // No necesitamos llevar un índice
        for (Palo palo : Palo.values())
            for (Numero numero : Numero.values())
                cartas.add(new Carta(numero, palo));
        //cartas.add("Hola Mundo");  // Podría meter sin problemas algo que no fuera una Carta
    }                              // La colección no es segura

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
        Carta result = (Carta) cartas.get(cartas.size()-1); // Necesitamos un typecast
        cartas.remove(cartas.size()-1);               // Sacas un Object, no una Carta
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
        for(Object o : cartas) // La lista es de objects
            sb.append(o.toString()); // en Object está toString()
        return sb.toString();        // Para llamara a métodos de Carta necesitamos un typecast
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
