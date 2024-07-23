package practicaEnClase;

import java.util.ArrayList;
import java.util.List;

public class GrupoPersona {
    private List<Persona> listaPersonas;

    public GrupoPersona(){
        listaPersonas=new ArrayList<>();
    }

    public void agregarPersona(Persona persona){
        if(persona.esMayorQue()&& persona.checkEdad()&& persona.cantidadDeLetras()){
            listaPersonas.add(persona);
            }
        }

    }

