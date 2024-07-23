package ejercicioAreas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class figuraGeometricaTest {

    @Test

    public void siElAreaEsCorrecta(){
        figuraGeometrica circulo = new figuraGeometrica("circulo",2);
        figuraGeometrica cuadrado = new figuraGeometrica("cuadrado", 3);

        assertEquals(true, cuadrado.checkValor());


    }
}
