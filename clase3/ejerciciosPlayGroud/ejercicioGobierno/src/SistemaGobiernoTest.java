import org.junit.Test;

public class SistemaGobiernoTest {

    @Test

    public void testSistemaGobierno(){
        EmpleadoGobierno diputado1 = new Diputado();
        EmpleadoGobierno ministro1 = new Ministro();
        EmpleadoGobierno presidente1 = new Presidente();

        diputado1.setSigEmpleadoGobierno(ministro1);
        ministro1.setSigEmpleadoGobierno(presidente1);

        diputado1.procesarDocumento(2);

        presidente1.procesarDocumento(3);

    }
}
