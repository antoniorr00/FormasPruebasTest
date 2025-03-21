package Ej4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PinturaTest {
    @Test
    void testPintura(){
        Pintura pintura = new Pintura(10);

        Forma rectangulo = new Rectangulo("Rectangulo", 10, 5);
        double salidaEsperada = (10 * 5) / 10;
        double salidaRecibida = pintura.calcularPintura(rectangulo);
        assertEquals(salidaEsperada, salidaRecibida);

        Forma esfera = new Esfera("Esfera", 6);
        salidaEsperada = (4 * Math.PI * 6 * 6) / 10;
        salidaRecibida = pintura.calcularPintura(esfera);
        assertEquals(salidaEsperada, salidaRecibida);

        Forma cilindro = new Cilindro("Cilindro", 6, 21);
        salidaEsperada = (Math.PI * 6 * 6 * 21) / 10;
        salidaRecibida = pintura.calcularPintura(cilindro);
        assertEquals(salidaEsperada, salidaRecibida);
    }
}