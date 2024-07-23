class EmpleadoConcreto implements Empleado {
    @Override
    public void prepararMenu(Menu menu) {
        menu.armarMenu();
        double costo = menu.calcularPrecio();
        System.out.println("El costo del menú es: " + costo + " pesos.");
    }
}