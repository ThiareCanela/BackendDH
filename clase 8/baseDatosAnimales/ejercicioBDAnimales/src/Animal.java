import org.apache.log4j.Logger;

import java.sql.*;

import static org.h2.util.JdbcUtils.getConnection;

public class Animal {

    private static final Logger logger = Logger.getLogger(Animal.class);
//creamos un método que nos devuelva una conexión


    //generamos la conexión:
    public static void main(String[] args) {
        //conexión vacía para iniciar
        Connection connection=null;
        try{

            connection= getConnection();
            logger.info("conexion establecida");

            //el objeto statement nos permite comunicarnos en lenguaje sql
            Statement statement= connection.createStatement();

            //ahora, usando el objeto statement podemos escribir en sql, donde creamos la tabla  y tipo de datos
            statement.execute("DROP TABLE IF EXISTS ANIMALES; " +
                    "CREATE TABLE ANIMALES (ID INT PRIMARY KEY, " +
                    "NOMBRE VARCHAR(40) NOT NULL, TIPO VARCHAR(50) NOT NULL)");

            //Ya creamos la BD ahora podemos ingresar los datos
            System.out.println("****************************Insertando************************************");
            statement.execute("INSERT INTO ANIMALES VALUES(1,'Tom','Perro'),(2,'Firulais','Perro'),(3,'lomito','gato'),(4,'attos','Conejo'),(5,'Chester','Raton')");


            //para mostrar necesito un Objeto ResultSet y creamos una query con lo que deseamos obtener
            ResultSet rs= statement.executeQuery("SELECT * FROM ANIMALES");

            //iteramos mientras rs.next significa iteramos mientras rs tenga datos o sea, mientras nuestra query tenga datos
            while (rs.next()){
                //mostrar por pantalla
                System.out.println("Nombre: "+rs.getString(2)+" tipo: "+rs.getString(3));

            }

            //creamos otra consulta donde eliminamos un elemento por su ID
            System.out.println("****************************Eliminamos************************************");
            statement.execute("DELETE FROM ANIMALES WHERE ID=3");
            rs= statement.executeQuery("SELECT * FROM ANIMALES");
            System.out.println("****************************Mostrando el resultado************************************");

            while (rs.next()){
                //mostrar por pantalla
                System.out.println("ID: "+rs.getInt(1)+" -Nombre: "+rs.getString(2)+" tipo: "+rs.getString(3));

            }
        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }


    public static Connection getConnection () throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:mem:~/tablaAnimales","sa","sa");
    }
}

