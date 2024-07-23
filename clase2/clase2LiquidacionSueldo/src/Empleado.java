public class Empleado {
    private String nombre, apellido;
    private int cuentaBancaria;

    public Empleado(String nombre, String apellido, int cuentaBancaria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCuentaBancaria() {
        return cuentaBancaria;
    }
}
