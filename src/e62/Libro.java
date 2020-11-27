package e62;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo Mosqueira Rey
 */
public class Libro {
    // visibilidad no privada para simplificar y evitarnos setters
    EstadoLibro estado = Disponible.getInstancia();
    List<String> reservas = new ArrayList<>();
    String lectorActual;
    boolean unaSemanaReservado = false;
    
    public void solicitarPrestamo(String cliente) { 
        estado.solicitarPrestamo(this, cliente);
    }
    
    public void devolver() {
        estado.devolver(this);    
    }

    public void depositar() {
        estado.depositar(this);
    }

    public EstadoLibro getEstado() {
        return estado;
    }
    
    public void setEstado(EstadoLibro estado) {
        this.estado = estado;
    }  
    
    public static void main(String[] args) {
        Libro l = new Libro();

        l.solicitarPrestamo("Pepe");
        l.solicitarPrestamo("Juan");
        l.devolver();
        l.solicitarPrestamo("Jose");
        l.solicitarPrestamo("Juan");  // Cuando va a buscar la reserva
        l.devolver();
        l.unaSemanaReservado = true; // No ha ido a buscar el libro => se devuelve
        l.devolver();

        l.depositar();
        l.solicitarPrestamo("Basilio");
        l.solicitarPrestamo("Basilio");
        l.devolver();
        l.depositar();
    }
}
