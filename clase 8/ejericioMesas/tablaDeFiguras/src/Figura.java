import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



import static java.util.logging.Logger.*;

public class Figura {

    private static final Logger logger = Logger.getLogger(Figura.class);

    public static void main(String[] args) {
        //conexión vacía para iniciar
        Connection connection=null;
        try{

            connection= getConnection();
            logger.info("conexion establecida");

            //el objeto statement nos permite comunicarnos en lenguaje sql
            Statement statement= connection.createStatement();

            //ahora, usando el objeto statement podemos escribir en sql, donde creamos la tabla  y tipo de datos
            statement.execute("DROP TABLE IF EXISTS FIGURAS; " +
                    "CREATE TABLE FIGURAS (ID INT PRIMARY KEY, " +
                    "TIPOFIGURA VARCHAR(40) NOT NULL, COLOR VARCHAR(50) NOT NULL)");

            //Ya creamos la BD ahora podemos ingresar los datos
            System.out.println("****************************Insertando************************************");
            statement.execute("INSERT INTO FIGURAS VALUES(1,'CIRCULO','ROJO'),(2,'CIRCULO','VERDE'),(3,'CUADRADO','ROJO'),(4,'CUADRADO','VERDE'),(5,'CUADRADO','VIOLETA')");


            //para mostrar necesito un Objeto ResultSet y creamos una query con lo que deseamos obtener
            ResultSet rs= statement.executeQuery("SELECT * FROM FIGURAS WHERE COLOR = 'ROJO' AND TIPOFIGURA='CIRCULO' ");

            System.out.println("****************************Mostramos circulos color rojo************************************");
            //iteramos mientras rs.next significa iteramos mientras rs tenga datos o sea, mientras nuestra query tenga datos
            while (rs.next()){
                //mostrar por pantalla
                System.out.println("Tipo figura: "+rs.getString(2)+" color: "+rs.getString(3));

            }

            //creamos otra consulta donde eliminamos un elemento por su ID
            System.out.println("****************************MOSTRAMOS TODAS LAS FIGURAS************************************");

            rs= statement.executeQuery("SELECT * FROM FIGURAS");

            while (rs.next()){
                //mostrar por pantalla
                System.out.println("ID: "+rs.getInt(1)+" -TipoFigura: "+rs.getString(2)+" color: "+rs.getString(3));

            }
        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }

    //creamos un método que nos devuelva una conexión
    public static Connection getConnection () throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/tablaFiguras","admin","admin");
    }


}
