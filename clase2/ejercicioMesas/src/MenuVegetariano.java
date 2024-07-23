class MenuVegetariano extends Menu {
    private static final double precioBase = 45.0;
    private int cantidadSalsas;
    private double especiasCosto;

    public MenuVegetariano(int cantidadSalsas, double especiasCosto) {
        this.cantidadSalsas = cantidadSalsas;
        this.especiasCosto = especiasCosto;
    }

    @Override
    protected void armarMenu() {
        System.out.println("Armando menú vegetariano con " + cantidadSalsas + " salsa(s)");
        // Aquí puedes añadir la lógica específica para armar el menú vegetariano
    }

    @Override
    protected double calcularPrecio() {
        double recargoEspecias = precioBase * 0.01 * especiasCosto;
        double recargoSalsas = cantidadSalsas * 2;
        return precioBase + recargoEspecias + recargoSalsas;
    }
}

