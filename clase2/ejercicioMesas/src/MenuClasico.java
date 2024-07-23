class MenuClasico extends Menu {
    private static final double precioBase = 50.0;

    @Override
    protected void armarMenu() {
        System.out.println("Armando menú clásico");
        // Aquí puedes añadir la lógica específica para armar el menú clásico
    }

    @Override
    protected double calcularPrecio() {
        return precioBase;
    }
}