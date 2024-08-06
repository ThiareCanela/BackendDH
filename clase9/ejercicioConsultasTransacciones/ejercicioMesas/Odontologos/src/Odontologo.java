import org.apache.log4j.Logger;

import java.sql.*;


public class Odontologo {

    private static final Logger logger = Logger.getLogger(Odontologo.class);
    private  static final String SQL_DROP_CREATE="DROP TABLE IF EXISTS ODONTOLOGOS; " +
            "CREATE TABLE ODONTOLOGOS(ID INT PRIMARY KEY, APELLIDO VARCHAR(100) NOT NULL, NOMBRE VARCHAR(100) NOT NULL, MATRICULA VARCHAR(100) NOT NULL)";

    private static final String SQL_INSERT="INSERT INTO ODONTOLOGOS VALUES (?,?,?,?)";
    private static final String SQL_UPDATE="UPDATE ODONTOLOGOS SET MATRICULA=? WHERE ID=?";


    public static void main(String[] args) {
        Connection connection= null;
        try{
            connection= getConnection();

            //crear la tabla
            Statement statement= connection.createStatement();
            statement.execute(SQL_DROP_CREATE);
            logger.info("tabla creada con exito");

            //Insertar datos
            PreparedStatement psInsert= connection.prepareStatement(SQL_INSERT);
            psInsert.setInt(1,1);
            psInsert.setString(2,"CARVAJAL");
            psInsert.setString(3,"CAMILA");
            psInsert.setString(4,"33453564");
            psInsert.execute();
            logger.info(" primera carga de datos cargados con exito");

            // Actualizar la matrícula
            PreparedStatement psUpdate= connection.prepareStatement(SQL_UPDATE);
            psUpdate.setString(1,"444");
            psUpdate.setInt(2, 1);
            psUpdate.execute();
            logger.info(" MODIFICACIÓN MATRICULA exito");

            // Mostrar los datos de la tabla
            ResultSet rs = statement.executeQuery("SELECT * FROM ODONTOLOGOS");


            System.out.println("****************************Datos de la tabla ODONTOLOGOS************************************");
            while (rs.next()) {
                int id = rs.getInt("ID");
                String apellido = rs.getString("APELLIDO");
                String nombre = rs.getString("NOMBRE");
                String matricula = rs.getString("MATRICULA");

                System.out.println("ID: " + id + ", Apellido: " + apellido + ", Nombre: " + nombre + ", Matrícula: " + matricula);
            }
        }catch (SQLException sql){
                logger.error(sql.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/TablaOdontologos","admin","admin");
    }



}

