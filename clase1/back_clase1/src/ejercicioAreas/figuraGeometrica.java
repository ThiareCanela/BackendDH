package ejercicioAreas;

public class figuraGeometrica {

    private String tipo; //circulo,cuadrado
    private int valorFigura; // valor del lado o del radio

    public figuraGeometrica(String tipo, int valorFiguraa) {
        this.tipo = tipo;
        this.valorFigura = valorFigura;
    }

    public String getTipo() {
        return tipo;
    }

    public int getValorFigura() {
        return valorFigura;
    }

    public boolean checkValor(){
       boolean validez = false;
        if(this.getValorFigura()>0){
            validez = true;
        } else{
            System.out.println("El valor del radio o lado debe ser mayor que cero");
        }
        return validez;
    }

    private double calcularArea() {
        double Pi = Math.PI;
        double area = 0; //
        if (this.tipo.equals("circulo")) {
            area = Pi * Math.pow(this.valorFigura, 2);
        } else if (this.tipo.equals("cuadrado")) {
            area = this.valorFigura * this.valorFigura;
        }
        return area;
    }

}
