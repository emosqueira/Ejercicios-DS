package e62;

/**
 *
 * @author Eduardo Mosqueira Rey
 */
public class Prestado implements EstadoLibro {
    private static final Prestado instancia = new Prestado();
    private Prestado() { }
    public static Prestado getInstancia() { return instancia; }
    
    @Override
    public void solicitarPrestamo(Libro l, String cliente) {
        l.reservas.add(cliente);
        System.out.println("Reserva de " + cliente);
    }

    @Override
    public void devolver(Libro l) {
        if (l.reservas.isEmpty()) {
            l.estado = Disponible.getInstancia();
            System.out.println("Libro disponible...");
        } else {
            l.estado = Reservado.getInstancia();
            System.out.println("Libro en reserva de " + l.reservas.get(0));
        }
    }
}
