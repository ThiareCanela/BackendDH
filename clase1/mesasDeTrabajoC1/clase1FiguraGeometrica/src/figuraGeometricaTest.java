
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class figuraGeometricaTest {

    @Test

    public void siElAreaEsCorrecta(){
        figuraGeometrica circulo = new figuraGeometrica("circulo",2);
        figuraGeometrica cuadrado = new figuraGeometrica("cuadrado", 3);

        assertEquals(true, cuadrado.checkValor());

        assertEquals(9.0,cuadrado.calcularArea(),0.001);
        assertEquals(12.5664, circulo.calcularArea(), 0.001);

    }
}
