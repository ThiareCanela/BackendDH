public class ManejadorLote extends Manejador {
    @Override
    public void procesarArticulo(Articulo articulo) {
        if (articulo.getLote()>= 1000 && articulo.getLote()<= 2000){
            getSigControl().procesarArticulo(articulo);
        }
        else {
            System.out.println("Artículo no pasa control de lote");
        }

    }
}
