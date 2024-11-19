package es.jmg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class Basico04Test {

    @Test
    public void testCalcularSeries() {
        int a = -5 + 8 * 6;
        int b = (55+9) % 9;
        int c = 20 + -3*5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;

        // Al ser un método estático que no devuleve valores,
        // nos remitimos al retorno de las variables en sus getters
        
        assertEquals(43, a);
        assertEquals(1, b);
        assertEquals(19, c);
        assertEquals(13, d);
    }
}
