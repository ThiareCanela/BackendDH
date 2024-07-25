public class Articulo {

    private String nombre;
    private int lote;
    private int peso;
    private String envase; //sano, casi sano, no sano
    private String estado ="rechazado";

    public Articulo(String nombre, int lote, int peso, String envase) {
        this.envase = envase;
        this.peso = peso;
        this.lote = lote;
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEnvase() {
        return envase;
    }

    public void setEnvase(String envase) {
        this.envase = envase;
    }
}
