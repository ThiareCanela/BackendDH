public class Presidente extends EmpleadoGobierno{
    @Override
    public void procesarDocumento(Integer tipo) {
        if(tipo <= 3) {
            System.out.println("Documento leído. Presidente");
            if (getSigEmpleadoGobierno()!=null) {
                getSigEmpleadoGobierno().procesarDocumento(tipo);
            }
        }
        else if (getSigEmpleadoGobierno()!=null){
            getSigEmpleadoGobierno().procesarDocumento(tipo);
        }
    }
}
