package practicaEnClase;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public boolean esMayorQue(){
        return this.edad>=18;
    }

    public boolean checkEdad(){
        return edad>0&&edad<=120;
    }

    public boolean cantidadDeLetras(){
        return nombre.length()<4;
    }

    public boolean cantidadDeLetras(){
        boolean resp = false;
        char[] array= nombre.toCharArray();
        for (char letra : array) {
            if (!Character.isLetter(letra)) {
                return resp;
            }
        }
            resp = true;
            return resp;

        }

}
