package com.mycompany.main2;
import java.sql.*;
import java.util.ArrayList;

public class HelpDAO {
    public static ArrayList<HelpCase> getAllHelpCases() {
        ArrayList<HelpCase> list = new ArrayList<>();
        String sql = "SELECT * FROM help"; 

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                HelpCase h = new HelpCase();
                h.name = rs.getNString("name");
                h.projectName = rs.getNString("name_project");
                
                h.examinationType = rs.getNString("Examination_Type");
                h.medications = rs.getNString("Medications");
                h.medicalAnalysis = rs.getNString("Medical_Analysis");
                h.surgery = rs.getNString("Surgery");
                h.xRay = rs.getNString("X_Ray");
                
                h.foundationLessons = rs.getNString("Foundation_Lessons");
                h.teachersNames = rs.getNString("Teachers_Names");
                h.schoolFees = rs.getNString("School_Fees");
                h.schoolBooks = rs.getNString("School_Books");

                h.debtReason = rs.getNString("Debt_Reason");
                h.debtValue = rs.getNString("Debt_Value");
                h.officialDocuments = rs.getNString("Official_Documents");

                h.weddingDate = rs.getNString("Wedding_Date");
                h.needsRequirements = rs.getNString("Needs_Requirements");
                h.marriageContract = rs.getNString("Marriage_Contract");

                h.clothingAid = rs.getNString("Clothing_Aid");
                h.homeNeeds = rs.getNString("Home_Needs");
                h.projectType = rs.getNString("Project_Type");
                h.readyMealsCount = rs.getNString("Ready_Meals_Count");
                h.unreadyMealsCount = rs.getNString("Unready_Meals_Count");
                
                list.add(h);
            }
        } catch (SQLException e) { 
         e.printStackTrace();
        }
        return list;
    }

    
    public static boolean addHelpCase(HelpCase h) {
        String sql = "INSERT INTO help (name, name_project, Examination_Type, Medications, Medical_Analysis, Surgery, X_Ray, "
                   + "Foundation_Lessons, School_Fees, School_Books, Teachers_Names, "
                   + "Debt_Reason, Debt_Value, Official_Documents, "
                   + "Wedding_Date, Needs_Requirements, Marriage_Contract, "
                   + "Clothing_Aid, Home_Needs, Project_Type, Ready_Meals_Count, Unready_Meals_Count) "
                   + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setNString(1, h.name);
            stmt.setNString(2, h.projectName);
            // الصحة
            stmt.setNString(3, h.examinationType);
            stmt.setNString(4, h.medications);
            stmt.setNString(5, h.medicalAnalysis);
            stmt.setNString(6, h.surgery);
            stmt.setNString(7, h.xRay);
            // التعليم
            stmt.setNString(8, h.foundationLessons);
            stmt.setNString(9, h.schoolFees);
            stmt.setNString(10, h.schoolBooks);
            stmt.setNString(11, h.teachersNames);
            // الديون
            stmt.setNString(12, h.debtReason);
            stmt.setNString(13, h.debtValue);
            stmt.setNString(14, h.officialDocuments);
            // العرايس
            stmt.setNString(15, h.weddingDate);
            stmt.setNString(16, h.needsRequirements);
            stmt.setNString(17, h.marriageContract);
            // إنسان وإطعام
            stmt.setNString(18, h.clothingAid);
            stmt.setNString(19, h.homeNeeds);
            stmt.setNString(20, h.projectType);
            stmt.setNString(21, h.readyMealsCount);
            stmt.setNString(22, h.unreadyMealsCount);

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean deleteHelpCase(String name) {
        String sql = "DELETE FROM help WHERE name = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setNString(1, name);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
