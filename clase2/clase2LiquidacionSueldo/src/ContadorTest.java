import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContadorTest {

    @Test
    public void liquidarSueldoContratado(){
        //DADO
        //Empleado empleadoJuan= new EmpleadoContratado("Juan","Monardez",11111111,8,10);
        Empleado empleadoJuan= new EmpleadoEfectivo("Juan","Monardez",11111111,100,156,1000);
        Contador conta1= new ContadorEmpleadoContratado();
        String respEsp= "la liquidacion es un documento digitalsueldo a liquidar: 80.0";
        //CUANDO
        String respActual= conta1.liquidarSueldo(empleadoJuan);
        //ENTONCES
        assertEquals(respActual,respEsp);
    }
}
