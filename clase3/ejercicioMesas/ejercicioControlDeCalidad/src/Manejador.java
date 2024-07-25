public abstract class Manejador {

    private Manejador sigControl;
    public abstract void procesarArticulo(Articulo articulo);

    public void setSigControl(Manejador control){
        sigControl = control;

    }

    public Manejador getSigControl(){
        return sigControl;
    }
}
