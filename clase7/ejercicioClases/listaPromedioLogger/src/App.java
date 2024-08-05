import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class App {

    //creamos un objeto looger
//le sirve a la clase app y no al objeto app por eso es estático y final para que quede como constante
    private static final Logger logger = Logger.getLogger(App.class);
    private List<Integer> listaEnteros;

    public App(){
        listaEnteros = new ArrayList<>();
        logger.info("instancia creada");

    }

    public void agregarEnterosAlaLista(Integer numero){
        listaEnteros.add(numero);

        if(listaEnteros.size()>10){
            logger.warn("La lista tiene más de 10 elementos");
        } else
        if(listaEnteros.size()>5){
            logger.warn("La lista tiene más de 5 elementos");
        }
    }

    public void promediarLista(){
        if (listaEnteros.isEmpty()) {
            logger.warn("La lista está vacía, no se puede calcular el promedio.");
            return;
        }

        double suma = 0;
        for (Integer numero : listaEnteros) {
            suma += numero;
        }

        double promedio = suma / listaEnteros.size();
        logger.info("El promedio de la lista es: " + promedio);
    }
}
