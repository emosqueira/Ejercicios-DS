package e41;

/**
 * Clase Caja
 * @author Eduardo Mosqueira Rey
 */
public class Caja {
    private int lado;  // Lado de la caja
    private int valor; // Valor interno
    private static int numCajas = 0; // Valor estatico que almacena el numero de cajas creadas
    public static final double PI = 3.1416;

    // Constructores
    public Caja() { this(0, 10); }
    public Caja(int valor) { this(valor, 10); }

    public Caja(int valor, int lado) {
        this.valor = valor;
        this.lado = lado;
        numCajas++;
    }

    // Métodos de lectura y escritura (getters y setters)
    public int getValor() { return valor; }
    public void setValor(int valor) { this.valor = valor; }

    public int getLado() { return lado; }
    public void setLado(int lado) { this.lado = lado; }

    public static int getNumCajas() { return numCajas;  }

    // Métodos típicos de Java: equals, hashCode y toString
    public boolean equals(Object obj) {
        if (obj == null) { return false; }
        if (getClass() != obj.getClass()) { return false; }
        final Caja other = (Caja) obj;
        if (this.lado != other.lado) { return false; }
        if (this.valor != other.valor) { return false; }
        return true;
    }
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.lado;
        hash = 31 * hash + this.valor;
        return hash;
    }

    public String toString() { return "[Contenido: " + valor + "]"; }

    // Otros metodos
    public int areaCara() { return lado * lado; } // Area de una cara
    public double perimetroCirculo() { return PI * lado; } // Perimetro circulo cara

    // Main de prueba
    public static void main(String[] args) {
        Caja c1 = new Caja(5, 20);
        Caja c2 = new Caja();

        System.out.println("area cara c1 : " + c1.areaCara());
        System.out.println("Perimetro circulo c2 : " + c2.perimetroCirculo());
        System.out.println("Numero cajas : " + Caja.getNumCajas());
        System.out.println("c1 = " + c1);
    }
}

