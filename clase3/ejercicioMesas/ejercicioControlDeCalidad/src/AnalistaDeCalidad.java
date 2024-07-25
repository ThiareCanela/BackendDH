public class AnalistaDeCalidad {

    private Manejador inicial;

    public void CompruebaCalidad(Articulo articulo){

        inicial = new ManejadorLote();
        Manejador peso = new ManejadorPeso();
        Manejador envase = new ManejadorEnvase();


        inicial.setSigControl(peso);
        peso.setSigControl(envase);


    }

    public void efectuarControl(Articulo articulo){
       inicial.procesarArticulo(articulo);

    }
}
