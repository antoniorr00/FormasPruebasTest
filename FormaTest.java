package Ej4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormaTest {
    @Test
    void testFormaToString(){
        Forma cilindro = new Cilindro("cilindro", 10, 30);
        String salidaEsperada = "Forma: cilindro";
        String salidaRecibida = cilindro.toString();
        assertEquals(salidaEsperada, salidaRecibida);

        Forma esfera = new Esfera("esfera", 15);
        salidaEsperada = "Forma: esfera";
        salidaRecibida = esfera.toString();
        assertEquals(salidaEsperada, salidaRecibida);

        Forma rectangulo = new Rectangulo("rectangulo", 35, 20);
        salidaEsperada = "Forma: rectangulo";
        salidaRecibida = rectangulo.toString();
        assertEquals(salidaEsperada, salidaRecibida);
    }

    @Test
    void testFromaDevolverArea(){
        Forma cilindro = new Cilindro("cilindro", 10, 30);
        double salidaEsperada = 9424.777;
        double salidaRecibida = cilindro.area();
        assertEquals(salidaEsperada, salidaRecibida, 0.001);

        Forma esfera = new Esfera("esfera", 15);
        salidaEsperada = 2827.433;
        salidaRecibida = esfera.area();
        assertEquals(salidaEsperada, salidaRecibida, 0.001);

        Forma rectangulo = new Rectangulo("rectangulo", 35, 20);
        salidaEsperada = 700.0;
        salidaRecibida = rectangulo.area();
        assertEquals(salidaEsperada, salidaRecibida, 0.001);
    }
}
