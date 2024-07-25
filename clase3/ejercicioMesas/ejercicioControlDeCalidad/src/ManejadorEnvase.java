public class ManejadorEnvase extends Manejador {
    @Override
    public void procesarArticulo(Articulo articulo) {
        if (articulo.getEnvase() == "sano" || articulo.getEnvase() == "casi sano") {
            System.out.println("Artículo pasa todos los controles");
            articulo.setEstado("aceptado");
        } else {
            System.out.println("Artículo no pasa control de peso de Envase");
        }

    }
}