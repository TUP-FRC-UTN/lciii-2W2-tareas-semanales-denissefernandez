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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
public class ConexionJDBC {
    private Connection con;
 private String cadenaConexion="jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=OfertasProducto";
 private String user="sa";
 private String pass="Nomeacuerdo22";

private void getConnection()
{
  try
  {
      con=DriverManager.getConnection(cadenaConexion,user,pass);
  }
  catch(Exception exc)
  {
      exc.printStackTrace();
  }
}

private void disconnect()
{
    try
    {
        if(!con.isClosed() || con!=null){con.close();}
    }
    catch(Exception exc)
    {
        exc.printStackTrace();
    }
}

    
}
