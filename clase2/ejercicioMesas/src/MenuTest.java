import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MenuTest {

    @Test
    public void testMenuClasico() {
        Empleado empleado = new EmpleadoConcreto();
        Menu menuClasico = new MenuClasico();


        empleado.prepararMenu(menuClasico);


        assertEquals(50.0, menuClasico.calcularPrecio(), 0.01); // ultimo  parametro es la precisión permitida en la comparación, si no no funciona al ser double ?
    }

    @Test
    public void testMenuInfantil() {
        Empleado empleado = new EmpleadoConcreto();
        Menu menuInfantil = new MenuInfantil(2);


        empleado.prepararMenu(menuInfantil);


        assertEquals(40.0 + 2 * 3, menuInfantil.calcularPrecio(), 0.01);
    }

    @Test
    public void testMenuVegetariano() {
        Empleado empleado = new EmpleadoConcreto();
        Menu menuVegetariano = new MenuVegetariano(3, 10);
        empleado.prepararMenu(menuVegetariano);

        double precioEsperado = 45.0 + (45.0 * 0.01 * 10) + (3 * 2);

        assertEquals(precioEsperado, menuVegetariano.calcularPrecio(), 0.01);
    }
}
