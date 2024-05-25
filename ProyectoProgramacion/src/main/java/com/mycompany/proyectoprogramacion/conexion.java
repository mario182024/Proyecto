/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprogramacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mario Sànchez
 */
public class conexion {
     private Connection conexion;
    private String user ="root";
    
    private String pass = "Mypetsare@2154";
    private String dbName;
    
    
   public conexion(String dbName){
this.dbName = dbName;
 }
   public void createConnection(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+ dbName, user, pass);
           System.out.println("Se realizo la conexión");
           
       }
       catch(ClassNotFoundException | SQLException ex){
           System.out.println("Error: "+ ex.getMessage());
       }
   }
       public void closeConnection() {
        try {
            conexion.close();
            System.out.println("Se ha finalizado la conexión con el servidor");
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public Connection getConexion() {
        return conexion;
    }
    
}
