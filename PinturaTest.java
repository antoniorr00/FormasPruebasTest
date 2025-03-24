package Ej4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PinturaTest {
    @Test
    void testPintura(){
        Pintura pintura = new Pintura(250);

        Forma rectangulo = new Rectangulo("Rectangulo", 35, 20);
        double salidaEsperada = 2.8;
        double salidaRecibida = pintura.calcularPintura(rectangulo);
        assertEquals(salidaEsperada, salidaRecibida, 0.001);

        Forma esfera = new Esfera("Esfera", 15);
        salidaEsperada = 11.309;
        salidaRecibida = pintura.calcularPintura(esfera);
        assertEquals(salidaEsperada, salidaRecibida, 0.001);

        Forma cilindro = new Cilindro("Cilindro", 10, 30);
        salidaEsperada = 37.699;
        salidaRecibida = pintura.calcularPintura(cilindro);
        assertEquals(salidaEsperada, salidaRecibida, 0.001);
    }
}
