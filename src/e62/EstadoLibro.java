/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e62;

/**
 *
 * @author Eduardo
 */
public interface EstadoLibro {
    void solicitarPrestamo(Libro l, String cliente);
    void devolver(Libro l);
    default void depositar(Libro l) {
        throw new UnsupportedOperationException();
    }
}
