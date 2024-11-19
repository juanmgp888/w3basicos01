package es.jmg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class Basico04Test {

    @Test
    public void testCalcularSeries() {

        // Si el método calcularSeries en Basico04.java le pongo como privado en lugar de público,
        // no podría acceder a él desde aquí para el test y que iniciara las variables.
        // Anteriormente lo tenía privado y lo que hacía era iniciar aquí las variables y no llamar a ese método.
        Basico04.calcularSeries();
        
        // Al ser un método estático que no devuelve valores,
        // nos remitimos al retorno de las variables en sus getters
        
        assertEquals(43, Basico04.getA());
        assertEquals(1, Basico04.getB());
        assertEquals(19, Basico04.getC());
        assertEquals(13, Basico04.getD());
    }
}
