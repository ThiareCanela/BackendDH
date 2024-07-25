public class ManejadorAceptado extends Manejador{
    @Override
    public void procesarArticulo(Articulo articulo) {
        System.out.println("Artículo pasa todos los controles");
    }
}
