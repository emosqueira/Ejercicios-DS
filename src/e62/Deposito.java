package e62;

public class Deposito implements EstadoLibro {
    private static final Deposito instancia = new Deposito();
    private Deposito() { }
    public static Deposito getInstancia() { return instancia; }

    @Override
    public void solicitarPrestamo(Libro l, String cliente) {
        l.setEstado(Reservado.getInstancia());
        l.reservas.add(cliente);
        System.out.println("Añadida reserva a " + cliente);
    }

    @Override
    public void devolver(Libro l) {
        // en blanco o excepcion
        throw new UnsupportedOperationException();
    }
}
