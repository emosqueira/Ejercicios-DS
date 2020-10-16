package e33.v2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharSequenceBackwardsTest {

    public CharSequenceBackwards csb1 = new CharSequenceBackwards("HolaMundo");

    @Test
    void length() {
        assertEquals(9, csb1.length());
    }

    @Test
    void charAt() {
        assertEquals('o', csb1.charAt(0));
        assertEquals('d', csb1.charAt(1));
        assertEquals('n', csb1.charAt(2));
        assertEquals('u', csb1.charAt(3));
        assertEquals('M', csb1.charAt(4));
        assertEquals('a', csb1.charAt(5));
        assertEquals('l', csb1.charAt(6));
        assertEquals('o', csb1.charAt(7));
        assertEquals('H', csb1.charAt(8));

        assertThrows(IndexOutOfBoundsException.class, () -> csb1.charAt(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> csb1.charAt(15));
    }

    @Test
    void subSequence() {
        assertEquals("nuMal", csb1.subSequence(2,7));
        assertThrows(IndexOutOfBoundsException.class, () -> csb1.subSequence(-1, 5));
        assertThrows(IndexOutOfBoundsException.class, () -> csb1.subSequence(2, -7));
        assertThrows(IndexOutOfBoundsException.class, () -> csb1.subSequence(2, 15));
        assertThrows(IndexOutOfBoundsException.class, () -> csb1.subSequence(7, 2));
    }

    @Test
    void toStringTest() {
        assertEquals("odnuMaloH", csb1.toString());
    }


    // Test de métodos por defecto
    @Test
    void isEmpty() {
        assertFalse(csb1.isEmpty());
    }

    // Test de métodos estáticos
    @Test
    void compare() {
        assertEquals(0, CharSequence.compare("odnuMaloH", csb1));
        assertTrue(0 > CharSequence.compare("holaMundo", csb1));
        assertTrue(0 < CharSequence.compare("zenote", csb1));
    }

}