package Ej4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormaTest {
    @Test
    void testFormaToString(){
        Forma cilindro = new Cilindro("cilindro", 6, 21);
        String salidaEsperada = "Forma: cilindro";
        String salidaRecibida = cilindro.toString();
        assertEquals(salidaEsperada, salidaRecibida);

        Forma esfera = new Esfera("esfera", 6);
        salidaEsperada = "Forma: esfera";
        salidaRecibida = esfera.toString();
        assertEquals(salidaEsperada, salidaRecibida);

        Forma rectangulo = new Rectangulo("rectangulo", 18, 7);
        salidaEsperada = "Forma: rectangulo";
        salidaRecibida = rectangulo.toString();
        assertEquals(salidaEsperada, salidaRecibida);
    }

    @Test
    void testFromaDevolverArea(){
        Forma cilindro = new Cilindro("cilindro", 6, 21);
        double salidaEsperada = Math.PI * 6 * 6 * 21;
        double salidaRecibida = cilindro.area();
        assertEquals(salidaEsperada, salidaRecibida);

        Forma esfera = new Esfera("esfera", 6);
        salidaEsperada = 4 * Math.PI * 6 * 6;
        salidaRecibida = esfera.area();
        assertEquals(salidaEsperada, salidaRecibida);

        Forma rectangulo = new Rectangulo("rectangulo", 10, 5);
        salidaEsperada = 10 * 5;
        salidaRecibida = rectangulo.area();
        assertEquals(salidaEsperada, salidaRecibida);
    }
}