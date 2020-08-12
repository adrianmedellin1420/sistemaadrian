package conexion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author adria
 */
public class Conexion{
    Connection con;
    public Connection Conexion() {
    try{
       Class.forName("com.mysql.jdbc.Driver"); 
       con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sistemaalma","root","");
       System.out.println("Conexion correcta");
    }   catch (ClassNotFoundException | SQLException ex) {
           System.out.println("ERROR:"+ex);
        }
        return con;
    }
    
    public static void main(String[] args){
        Conexion cn= new Conexion();
    }
}
    

   
    
   
    


