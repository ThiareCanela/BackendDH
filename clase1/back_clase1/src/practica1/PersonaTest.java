package practica1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonaTest {

    @Test




    public void siElNombreCompletoEsCorrecto(){
        Persona Felipe = new Persona("Felipe", "Vargas", "felipe.vargas@gmail.com", 19);
        Persona Maria = new Persona("Maria", "Rojas", "maria.rojas@gmail.com", 17);



        assertEquals(false, Maria.esMayorDeEdad());
        assertEquals("Felipe, Vargas", Felipe.devuelveNombreYApellido());

    }
}
