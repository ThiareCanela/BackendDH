package Dao;

import Model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MedicamentoDAOH2 implements iDao<Medicamento>{

    /* private Integer id;
        private String nombre;
        private int codigoNumerico;
        private String laboratorio;
        private Double precio;
        private Integer cantidad;*/
    private static final Logger logger= Logger.getLogger(MedicamentoDAOH2.class);
    private static final String SQL_INSERT="INSERT INTO MEDICAMENTOS VALUES(?,?,?,?,?,?)";
    private static final String SQL_SELECT_ONE="SELECT * FROM MEDICAMENTOS WHERE ID =?";
    private static final String SQL_SELECT_TODO="SELECT * FROM MEDICAMENTOS";
    @Override
    public Medicamento guardar(Medicamento medicamento) {
        //deberia ir toda la logica para persistir el medicamento en la base de datos
        Connection connection=null;
        try{
            connection= BD.getConnection();
            PreparedStatement psInsert= connection.prepareStatement(SQL_INSERT);
            psInsert.setInt(1,medicamento.getId());
            psInsert.setString(2, medicamento.getNombre());
            psInsert.setInt(3,medicamento.getCodigoNumerico());
            psInsert.setString(4, medicamento.getLaboratorio());
            psInsert.setDouble(5,medicamento.getPrecio());
            psInsert.setInt(6,medicamento.getCantidad());
            psInsert.execute();
            logger.info("datos cargados con exito");

        }catch (Exception e){
            logger.error(e.getMessage());
        }
        System.out.println(medicamento.getId());
        return medicamento;
    }

    @Override
    public Medicamento buscarPorId(Integer id) {
        Connection connection= null;
        Medicamento medicamento= null;
        try{
            connection=BD.getConnection();
            PreparedStatement psSelect = connection.prepareStatement(SQL_SELECT_ONE);
            psSelect.setInt(1, id); // Buscamos ID
            ResultSet rs = psSelect.executeQuery();

            // Si se encuentra el medicamento, se extraen sus datos
            if (rs.next()) {
                int medicamentoId = rs.getInt("ID");
                String nombre = rs.getString("NOMBRE");
                int codigoNumerico = rs.getInt("CODIGONUMERICO");
                String laboratorio = rs.getString("LABORATORIO");
                double precio = rs.getDouble("PRECIO");
                int cantidad = rs.getInt("CANTIDAD");

                // Crear el objeto Medicamento con los datos obtenidos
                medicamento = new Medicamento(medicamentoId, nombre, codigoNumerico, laboratorio, precio, cantidad);
                logger.info("Medicamento encontrado: " + medicamento);
            } else {
                logger.info("No se encontró ningún medicamento con el ID: " + id);
            }

        }catch (Exception e){
            logger.error(e.getMessage());
        }

        return medicamento;
    }


}
