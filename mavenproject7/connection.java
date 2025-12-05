/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject7;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hagar
 */
public class connection {
    private final String user="sa";
    private final String password="hager";
    private final String url = "jdbc:sqlserver://localhost:1433;databaseName=sonaa;TrustServerCertificate=true;;encrypt=false";
    public Connection connect()throws SQLException{
   
       return DriverManager.getConnection(url,user,password);
      
     }
}

