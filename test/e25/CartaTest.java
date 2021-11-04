package e25;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CartaTest {
    Carta c1, c2, c3;

    @BeforeEach
    void setUp() {
        c1 = new Carta(Numero.CINCO, Palo.ESPADAS);
        c2 = new Carta(Numero.CINCO, Palo.ESPADAS);
        c3 = new Carta(Numero.CINCO, Palo.OROS);
    }

    @Test
    void getNumero() {
        assertEquals(Numero.CINCO, c1.numero());
        assertEquals(Numero.CINCO, c2.numero());
        assertEquals(Numero.CINCO, c3.numero());
    }

    @Test
    void getPalo() {
        assertEquals(Palo.ESPADAS, c1.palo());
        assertEquals(Palo.ESPADAS, c2.palo());
        assertEquals(Palo.OROS, c3.palo());
    }

    @Test
    void testEquals() {
        assertEquals(c1, c2);
        assertNotEquals(c1, c3);
        assertNotEquals(c2, c3);
    }

    @Test
    void testHashCode() {
        assertEquals(c1.hashCode(), c2.hashCode());

        // Different objects could have same hashCode value
        // But a good hashCode algorithm tries to avoid that
        assertNotEquals(c1.hashCode(), c3.hashCode());
        assertNotEquals(c2.hashCode(), c3.hashCode());
    }

    @Test
    void testToString() {
        assertEquals("[5E]", c1.toString());
        assertEquals("[5E]", c2.toString());
        assertEquals("[5O]", c3.toString());
    }
}