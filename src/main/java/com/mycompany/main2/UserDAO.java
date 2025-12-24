
package com.mycompany.main2;

import java.sql.*;
import java.util.ArrayList;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public static User loginUser(String usernameOrID, String passwordHash) {
        

        String sql = "SELECT national_id, full_name, role, user_name " + 
                     "FROM people WHERE (national_id = ? OR user_name = ?) AND password_hash = ?";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, usernameOrID); 
            stmt.setString(2, usernameOrID); 
            stmt.setString(3, passwordHash); 
            
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nationalId = rs.getString("national_id");

                    String role = rs.getString("role").trim(); 
                    String fullName = rs.getString("full_name");
                    
                    String username = rs.getString("user_name"); 
                    if (username == null || username.trim().isEmpty()) {
                        username = nationalId;
                    }
                                        
                    if ("board of directores".equals(role)) {
                        return new Admin(0, fullName, nationalId, null, null, null, username, passwordHash);
                    } 
                    
                    if (role.startsWith("leader")) {
         
                        String commName;
                        String commType;
                        
                        if ("leader fixed committee".equals(role)) {
                            commName = "fixed committee";
                            commType = "fixed";
                        } else if ("leader unfixed committee".equals(role)) {
                            commName = "unfixed committee";
                            commType = "unfixed";
                        } else {
                            System.err.println("Error: Leader role not mapped.");
                            return null;
                        }
                        

                        Committee committee = ProjectAndCommitteeDAO.getCommitteeByName(commName);
                        
                        if (committee == null) {

                             committee = new Committee(0, commName, commType.equals("fixed") ? Committee.Type.Fixed : Committee.Type.NonFixed);
                        }
                        
                    //  committeeHead
                        return new CommitteeHead(0, fullName, nationalId, null, null, null, username, passwordHash, committee);
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Login error: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}