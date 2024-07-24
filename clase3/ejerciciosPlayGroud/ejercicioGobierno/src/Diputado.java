public class Diputado extends EmpleadoGobierno {
    @Override
    public void procesarDocumento(Integer tipo) {
        if(tipo == 1) {
            System.out.println("Documento leído. Diputado");
            if (getSigEmpleadoGobierno()!=null) {
                getSigEmpleadoGobierno().procesarDocumento(tipo);
            }
        }
        else if (getSigEmpleadoGobierno()!=null){
            getSigEmpleadoGobierno().procesarDocumento(tipo);
        }
    }
}
