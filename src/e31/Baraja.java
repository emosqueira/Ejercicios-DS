package e31;

import java.util.Random;

public class Baraja {
    // Estado => Composición
    // Colección de cartas
    private Carta[] cartas = new Carta[40];
    int cima;

    // Comportamiento => Delegación
    public Baraja() {
        int i=0;
        for (Palo palo : Palo.values())
            for (Numero numero : Numero.values())
                cartas[i++] = new Carta(numero, palo);
        cima = i - 1;
    }

    public void introducirCarta(Carta c) {
        if (cima == 39)
            throw new IllegalStateException("Baraja llena");
        cartas[++cima] = c;
    }

    public Carta sacarCarta() {
        if (cima < 0)
            throw new IllegalStateException("Baraja vacía");
        return cartas[cima--];
    }

    public void barajar() {
        Random rand = new Random();
        for (int i = 0; i <= cima; i++) {
            int index = rand.nextInt(cima+1);
            Carta temp = cartas[index];
            cartas[index] = cartas[i];
            cartas[i] = temp;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= cima; i++)
            sb.append(cartas[i].toString());
        return sb.toString();
    }

    // ¿debería ser inmutable? => Podría, pero en este caso no lo es

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
