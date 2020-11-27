package e62;

/**
 *
 * @author Eduardo Mosqueira Rey
 */
public class Disponible implements EstadoLibro {
    private static final Disponible instancia = new Disponible();
    private Disponible() { }
    public static Disponible getInstancia() { return instancia; }
    
    @Override
    public void solicitarPrestamo(Libro l, String cliente) {
        l.setEstado(Prestado.getInstancia());
        l.lectorActual = cliente;
        System.out.println("Prestando libro a " + cliente);
    }

    @Override
    public void devolver(Libro l) {
        // Un libro disponible no se puede devolver
        throw new UnsupportedOperationException();
    }

    @Override
    public void depositar(Libro l) {
        l.setEstado(Deposito.getInstancia());
        System.out.println("Mandando el libro al depósito...");
    }
}
