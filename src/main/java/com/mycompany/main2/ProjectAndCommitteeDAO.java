package com.mycompany.main2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProjectAndCommitteeDAO {

    
//   يسترجع كائن اللجنة بناءً على الاسم (يستخدم لتحديد نوع القائد)
  
    public static Committee getCommitteeByName(String name) {
        // بما أن بيانات اللجنة ثابتة في الداتا بيز (fixed committee, unfixed committee)
        // سنستخدم الكود الثابت الذي يرجع الكائن مباشرة:
        try {
            if ("fixed committee".equals(name)) {
                return new Committee(1, name, Committee.Type.Fixed);
            } else if ("unfixed committee".equals(name)) {
                 return new Committee(2, name, Committee.Type.NonFixed);
            }
        } catch (Exception e) {
             System.err.println("Error retrieving committee object: " + e.getMessage());
        }
        return null;
    }

    /**
     * يسترجع أسماء المشاريع التابعة للجنة (Fixed Committee)
     */
    public static ArrayList<String> getProjectsNamesByCommittee(String committeeName) {
        ArrayList<String> projectNames = new ArrayList<>();
        String sql = "SELECT name_project FROM projects WHERE nam_committee = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, committeeName);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    projectNames.add(rs.getString("name_project")); 
                }
            }
        } catch (SQLException e) {
            System.err.println("Error fetching project names: " + e.getMessage());
            e.printStackTrace();
        }
        return projectNames;
    }
    
    public static ArrayList<Project> getFixedProjectsByFile(String fileName) {

    ArrayList<Project> projects = new ArrayList<>();

    String sql = "SELECT id_project, name_project FROM projects " +
                 "WHERE type = 'fixed' AND file_name = ?";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, fileName);

        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Project p = new Project(
                    rs.getInt("id_project"),
                    rs.getString("name_project"),
                    "Fixed"
                );
                projects.add(p);
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return projects;
}

}