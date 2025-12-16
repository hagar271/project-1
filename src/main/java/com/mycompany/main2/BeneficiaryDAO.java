package com.mycompany.main2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BeneficiaryDAO {

    // 1. خريطة تعيين لربط الأسماء العربية في الداتا بيز بأسماء الـ Enum الانجليزيه
    // هذا يضمن أن التحويل يعمل بغض النظر عن لغة الـ Enum في جافا.
    private static final Map<String, Beneficiary.Region> REGION_MAP = new HashMap<>();
    private static final Map<Beneficiary.Region, String> REVERSE_REGION_MAP = new HashMap<>();
//    خريطة تعيين عكسية لتحويل الـ Enum الانجليزي إلى الاسم العربي
    static {
      
        REGION_MAP.put("الزهور", Beneficiary.Region.AlZohour); 
        REGION_MAP.put("الصفتى", Beneficiary.Region.AlSafti);
        REGION_MAP.put("المنشية", Beneficiary.Region.AlManshiya);
        REGION_MAP.put("شارع الثورة", Beneficiary.Region.AlThawraStreet);
        REGION_MAP.put("شارع احمد ماهر", Beneficiary.Region.AhmedMaherStreet);
        REGION_MAP.put("القطعة", Beneficiary.Region.AlQataa);
        REGION_MAP.put("كفر مليط", Beneficiary.Region.KafrMalit); 
        REGION_MAP.put("العطف", Beneficiary.Region.AlAtf);
        REGION_MAP.put("شارع البحر", Beneficiary.Region.AlBahrStreet);
        REGION_MAP.put("خارج المحمودية", Beneficiary.Region.OutsideAlMahmoudiya);
    
    // تعبئة الخريطة العكسية آلياً
    for (Map.Entry<String, Beneficiary.Region> entry : REGION_MAP.entrySet()) {
        REVERSE_REGION_MAP.put(entry.getValue(), entry.getKey());
    }
}
    
    // 2. استرجاع جميع المستفيدين (يستخدم بواسطة Admin)
    public static ArrayList<Beneficiary> getAllBeneficiaries() {
        ArrayList<Beneficiary> beneficiaries = new ArrayList<>();
        String sql = "SELECT national_id, full_name, age, job, phone, region, street, income, type_of_housing, status, level FROM beneficiaries";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                Beneficiary b = createBeneficiaryFromResultSet(rs);
                beneficiaries.add(b);
            }
        } catch (SQLException e) {
            System.err.println("Error fetching all beneficiaries: " + e.getMessage());
            e.printStackTrace();
        }
        return beneficiaries;
    }

    // 3. استرجاع المستفيدين حسب المنطقة (يستخدم بواسطة NonFixedCommitteeHead)
    public static ArrayList<Beneficiary> getBeneficiariesByRegion(String region) {
        ArrayList<Beneficiary> beneficiaries = new ArrayList<>();
        String sql = "SELECT national_id, full_name, age, job, phone, region, street, income, type_of_housing, status, level FROM beneficiaries WHERE region = ?";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, region);
            
            try(ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Beneficiary b = createBeneficiaryFromResultSet(rs);
                    beneficiaries.add(b);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error fetching beneficiaries by region: " + e.getMessage());
            e.printStackTrace();
        }
        return beneficiaries;
    }
    
// وظيفة الإضافة للأدمن: تضيف مستفيد جديد إلى جدول beneficiaries في قاعدة البيانات.
    
public static boolean addBeneficiary(Beneficiary b) {
    String sql = "INSERT INTO beneficiaries (national_id, full_name, age, job, phone, region, street, income, type_of_housing, status, level) " +
                 "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    // ⬅️ الحصول على الاسم العربي للمنطقة من الخريطة العكسية
    String arabicRegionName = null;
    if (b.getRegion() != null) {
        arabicRegionName = REVERSE_REGION_MAP.get(b.getRegion());
    }
    // ⬅️ الحصول على اسم المستوى (Severity) 
    String severityName = b.getSeverity() != null ? b.getSeverity().name() : null;
    
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        // البيانات الأساسية
        stmt.setString(1, b.getNationalId());
        stmt.setString(2, b.getFullName());
        stmt.setInt(3, b.getAge());
        
        // البيانات التفصيلية
        stmt.setString(4, b.getJob());
        stmt.setString(5, b.getPhone());
        
        // ⬅️ استخدام الاسم العربي للمنطقة هنا
        stmt.setString(6, arabicRegionName); 
        
        stmt.setString(7, b.getStreet());
        stmt.setDouble(8, b.getIncome());
        stmt.setString(9, b.getHousingType());
        stmt.setString(10, b.getStatus());
        stmt.setString(11, severityName);

        // تنفيذ الأمر
        int rowsAffected = stmt.executeUpdate();
        
        if (rowsAffected > 0) {
            System.out.println("SQL: Beneficiary '" + b.getFullName() + "' added successfully (Region: " + arabicRegionName + ").");
            return true;
        } else {
            System.err.println(" SQL: Failed to add beneficiary. No rows affected.");
            return false;
        }
        
    } catch (SQLException e) {
        System.err.println(" Error adding beneficiary: " + e.getMessage());
        e.printStackTrace();
        return false;
    }
}



//وظيفة التعديل للادمن: تعدل بيانات مستفيد موجود في جدول beneficiaries. شرط التعديل (بالnationalId)
public static boolean updateBeneficiary(Beneficiary b) {
    // ⚠️ ملاحظة: يجب أن تتطابق الأعمدة مع جدولك في SQL Server.
    String sql = "UPDATE beneficiaries SET full_name = ?, age = ?, job = ?, phone = ?, region = ?, street = ?, income = ?, type_of_housing = ?, status = ?, level = ? " +
                 "WHERE national_id = ?";
    
    // ⬅️ منطق التحويل إلى الاسم العربي (REVERSE_REGION_MAP)
    String arabicRegionName = null;
    if (b.getRegion() != null) {
        // نستخدم الخريطة العكسية لتحويل Enum المنطقة إلى اسمها العربي
        arabicRegionName = REVERSE_REGION_MAP.get(b.getRegion());
    }
    

    String severityName = b.getSeverity() != null ? b.getSeverity().name() : null;

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        // 1. ربط قيم التحديث (SET clauses) - بالترتيب
        stmt.setString(1, b.getFullName());
        stmt.setInt(2, b.getAge());
        stmt.setString(3, b.getJob());
        stmt.setString(4, b.getPhone());
        
        // ⬅️ القيمة العربية للمنطقة
        stmt.setString(5, arabicRegionName); 
        
        stmt.setString(6, b.getStreet());
        stmt.setDouble(7, b.getIncome());
        stmt.setString(8, b.getHousingType());
        stmt.setString(9, b.getStatus());
        stmt.setString(10, severityName); 

        // 2. ربط قيمة الشرط (WHERE clause) - وهي الرقم القومي
        stmt.setString(11, b.getNationalId()); 

        // 3. تنفيذ الأمر
        int rowsAffected = stmt.executeUpdate();
        
        if (rowsAffected > 0) {
            System.out.println(" SQL: Beneficiary '" + b.getFullName() + "' updated successfully.");
            return true;
        } else {
            System.err.println(" SQL: Failed to update beneficiary. ID " + b.getNationalId() + " not found.");
            return false;
        }
        
    } catch (SQLException e) {
        System.err.println(" Error updating beneficiary: " + e.getMessage());
        e.printStackTrace();
        return false;
    }
}

//  وظيفة الحذف: تحذف مستفيد من جدول beneficiaries بناءً على الرقم القومي.

public static boolean deleteBeneficiary(String nationalId) {
    // ⬅️ أمر SQL لحذف سجل بناءً على national_id
    String sql = "DELETE FROM beneficiaries WHERE national_id = ?";
    
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        // 1. ربط قيمة الشرط (WHERE clause parameter)
        stmt.setString(1, nationalId);
        
        // 2. تنفيذ الأمر
        int rowsAffected = stmt.executeUpdate();
        
        if (rowsAffected > 0) {
            System.out.println(" SQL: Beneficiary with ID " + nationalId + " deleted successfully.");
            return true;
        } else {
            System.err.println("SQL: Failed to delete beneficiary. ID " + nationalId + " not found.");
            return false;
        }
        
    } catch (SQLException e) {
        System.err.println("Error deleting beneficiary: " + e.getMessage());
        e.printStackTrace();
        return false;
    }
}

    // 5. دالة مساعدة لتحويل نتيجة الاستعلام إلى كائن Beneficiary
    private static Beneficiary createBeneficiaryFromResultSet(ResultSet rs) throws SQLException {
         Beneficiary b = new Beneficiary(
            rs.getString("national_id"),
            rs.getString("full_name"),
            rs.getInt("age")
        );
        b.setJob(rs.getString("job"));
        b.setPhone(rs.getString("phone"));

        // معالجة قيم المنطقة (Region) باستخدام الخريطة
        String regionValue = rs.getString("region");
        if (regionValue != null) {
            // نستخدم trim للتأكد من إزالة المسافات الزائدة قبل البحث في الخريطة
            Beneficiary.Region mappedRegion = REGION_MAP.get(regionValue.trim());
            if (mappedRegion != null) {
                b.setRegion(mappedRegion);
            } else {
                 System.err.println("Warning: Unmapped region value: " + regionValue + " ");
            }
        }

        // معالجة قيم المستوى (Level)
        String levelValue = rs.getString("level");
        if (levelValue != null) {
            try {
                // تحويل القيمة إلى حالة الأحرف الكبيرة وإزالة المسافات
                String normalizedLevel = levelValue.toUpperCase().replace(" ", "").trim();
                b.setSeverity(Beneficiary.Severity.valueOf(normalizedLevel));
            } catch (IllegalArgumentException ex) {
                 System.err.println("Warning: Invalid enum value for level: " + levelValue);
                 // محاولة تعيين قيمة NULL_LEVEL إذا فشل التحويل (للقيم الفارغة أو غير المتوقعة)
                 try {
                     b.setSeverity(Beneficiary.Severity.Null_Level);
                 } catch (Exception e2) { }
            }
        }
        
        b.setStreet(rs.getString("street"));
        b.setIncome(rs.getDouble("income"));
        b.setHousingType(rs.getString("type_of_housing"));
        b.setStatus(rs.getString("status"));
        
        return b;
    }
}