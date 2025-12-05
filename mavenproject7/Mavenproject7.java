/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author hagar
 */
public class Mavenproject7 {
  static Connection c;
 
    public static void main(String[] args)  {
        connection c1=new connection();
   
        try{
             c=c1.connect();
            
             Scanner s=new Scanner(System.in);
             
        System.out.println("ok");
        }
        catch (SQLException ex){
            System.getLogger(Mavenproject7.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
    }
        finally{
            try{
                c.close();
                
            }
            catch(SQLException ex){
                System.getLogger(Mavenproject7.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
            
}
}
