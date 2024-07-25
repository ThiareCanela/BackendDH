public class ManejadorPeso extends Manejador {
    @Override
    public void procesarArticulo(Articulo articulo) {
        if (articulo.getPeso() >= 1200 && articulo.getPeso() <= 1300) {
            getSigControl().procesarArticulo(articulo);

        } else {
            System.out.println("Artículo no pasa control de peso" + articulo.getPeso());
        }

    }
}

