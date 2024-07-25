import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ControlCalidadTest {

    @Test

    public void testControl(){


        Articulo papas = new Articulo("papas", 1800, 1200, "sano");

        AnalistaDeCalidad analista = new AnalistaDeCalidad();
        analista.CompruebaCalidad(papas);
        analista.efectuarControl(papas);
        assertEquals("aceptado", papas.getEstado());

    }


@Test

public void testControlrechazado(){

    Articulo pan = new Articulo("pan", 100, 1200, "sano");

    AnalistaDeCalidad analista = new AnalistaDeCalidad();
    analista.CompruebaCalidad(pan);
    analista.efectuarControl(pan);
    System.out.println(pan.getEstado());
    assertEquals("rechazado", pan.getEstado());

}
}
