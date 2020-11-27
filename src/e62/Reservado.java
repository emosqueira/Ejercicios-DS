package e62;

/**
 *
 * @author Eduardo Mosqueira Rey
 */
public class Reservado implements EstadoLibro {
    private static final Reservado instancia = new Reservado();
    private Reservado() { }
    public static Reservado getInstancia() { return instancia; }
    
    @Override
    public void solicitarPrestamo(Libro l, String cliente) {
        if (cliente.equals(l.reservas.get(0))) {
            l.estado = Prestado.getInstancia();
            l.lectorActual = cliente;
            System.out.println("Prestando libro reservado a " + cliente);
            l.reservas.remove(0);
        } else {
            l.reservas.add(cliente);
            System.out.println("Nueva reserva de " + cliente);
        }
    }

    @Override
    public void devolver(Libro l) {
        if (l.unaSemanaReservado) {
            l.reservas.remove(0);
            l.unaSemanaReservado = false;
            System.out.println("Caduca la reserva");
            if (l.reservas.isEmpty()) {
                l.estado = Disponible.getInstancia();
                System.out.println("Libro disponible...");
            } else {
                System.out.println("Libro reservado a " + l.reservas.get(0));
            }
        }
    }
}
