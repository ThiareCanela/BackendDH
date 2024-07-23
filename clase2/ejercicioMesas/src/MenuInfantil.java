class MenuInfantil extends Menu {
    private static final double precioBase = 40.0;
    private int cantidadJuguetes;

    public MenuInfantil(int cantidadJuguetes) {
        this.cantidadJuguetes = cantidadJuguetes;
    }

    @Override
    protected void armarMenu() {
        System.out.println("Armando menú infantil con " + cantidadJuguetes + " juguete(s)");
        // Aquí puedes añadir la lógica específica para armar el menú infantil
    }

    @Override
    protected double calcularPrecio() {
        return precioBase + (cantidadJuguetes * 3);
    }
}
