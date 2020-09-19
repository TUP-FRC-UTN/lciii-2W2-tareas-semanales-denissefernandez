/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Denise
 */
import Modelo.Oferta;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class ConexionJDBC {

    private Connection con;
    private String cadenaConexion = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=OfertasProducto";
    private String user = "sa";
    private String pass = "Nomeacuerdo22";

    private void getConnection() {
        try {
            con = DriverManager.getConnection(cadenaConexion, user, pass);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    private void disconnect() {
        try {
            if (!con.isClosed() || con != null) {
                con.close();
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public ArrayList<Producto> obtenerProductos() {
        ArrayList<Producto> list = new ArrayList<Producto>();
        String consultaSQL = "SELECT * FROM PRODUCTOS";
        try {
            getConnection();
            Statement stm = con.createStatement();
            ResultSet rst = stm.executeQuery(consultaSQL);
            while (rst.next()) {
                int id = rst.getInt("id");
                String nombre = rst.getString("nombre");

                Producto p = new Producto(id, nombre);
                list.add(p);
            }
            rst.close();

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            disconnect();
        }
        return list;

    }

    public boolean insertarOferta(Oferta nueva) {
        boolean insertado = false;
        String consultaSQL = "INSERT INTO Ofertas VALUES (?,?,?,?,?,?)";
        try {
            getConnection();
            PreparedStatement stm = con.prepareStatement(consultaSQL);
            stm.setInt(1, nueva.getProducto().getId());
            stm.setDouble(2, nueva.getPrecioNormal());
            stm.setDouble(3, nueva.getPreciOferta());
            stm.setInt(4, nueva.getStock());
            stm.setString(5, nueva.getFechaInicio());
            stm.setInt(6, nueva.getVigencia());
            stm.executeUpdate();
            insertado = true;
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            disconnect();
        }
        return insertado;
    }
    
    public double montoTotalPerdidoPorOfertas(int id)
    {
        double total=0;
        String consultaSQL = "select (sum(precioNormal)-sum(precioOferta))*stockDisponible\n" +
        "FROM OFERTAS O JOIN PRODUCTOS P ON P.id=O.idProducto\n" +
        "WHERE P.id=?\n" +
        "GROUP BY stockDisponible";
         try {
            getConnection();
            PreparedStatement stm = con.prepareStatement(consultaSQL);
            stm.setInt(1, id);
            ResultSet rst=stm.executeQuery();
            while(rst.next())
            {
                total=rst.getDouble(1);
            }
            rst.close();            
            
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            disconnect();
        }
        
        return total;
    }

}
