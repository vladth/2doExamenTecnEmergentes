
package com.emergentes.utiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDB {
    static String driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/bd_almacen";
    static String usuario = "root";
    static String password = "admin";
    
    Connection conn = null;
    public ConexionDB(){
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, password);
        }catch(ClassNotFoundException ex){
            System.out.println("Error en Driver!!!"+ex.getMessage());
        }catch(SQLException ex){
            System.out.println("Error al Conectar!!!"+ex.getMessage());
        }
    
    }
    
    public Connection conectar(){
        return conn;
    }
    
    public void desconectar(){
        try{
            conn.close();
        }catch(SQLException ex){
            System.out.println("Error al cerrar la base de datos!!!"+ex.getMessage());
        }
    }
    
}
