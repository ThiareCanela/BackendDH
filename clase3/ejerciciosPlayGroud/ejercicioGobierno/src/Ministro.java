public class Ministro extends EmpleadoGobierno{
    @Override
    public void procesarDocumento(Integer tipo) {
        if(tipo <= 2) {
            System.out.println("Documento leído. Ministro");
            if (getSigEmpleadoGobierno()!=null) {
                getSigEmpleadoGobierno().procesarDocumento(tipo);
            }
        }
        else if (getSigEmpleadoGobierno()!=null){
            getSigEmpleadoGobierno().procesarDocumento(tipo);
        }
    }
}
