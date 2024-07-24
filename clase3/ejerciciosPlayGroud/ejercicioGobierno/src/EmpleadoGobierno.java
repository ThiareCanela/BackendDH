public abstract class EmpleadoGobierno {

    private EmpleadoGobierno sigEmpleadoGobierno;
    public abstract void procesarDocumento(Integer tipo);


    public void setSigEmpleadoGobierno(EmpleadoGobierno emp){
        sigEmpleadoGobierno = emp;
    }

    public EmpleadoGobierno getSigEmpleadoGobierno() {
        return sigEmpleadoGobierno;
    }
}
