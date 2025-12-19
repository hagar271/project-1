
package com.mycompany.main2;

public class HelpCase {
public  String name;
public  String nationalId;
public  String projectName;

    // الصحة
 public   String examinationType;
public    String medications;
   public String medicalAnalysis;
  public  String surgery;
   public String xRay;

    // التعليم
  public  String foundationLessons;
  public  String teachersNames;
  public  String schoolFees;
 public   String schoolBooks;

    // الديون
public    String debtReason;
   public String debtValue;
   public String officialDocuments;

    // عرايس
 public   String weddingDate;
 public   String needsRequirements;
  public  String marriageContract;

    // إنسان / إطعام
  public  String clothingAid;
  public  String homeNeeds;
  public  String projectType;
  public  String readyMealsCount;
  public  String unreadyMealsCount;

    // ===== getters فقط (الـ GUI مش محتاج setters غالبًا) =====
    
    public String getName() { return name; }

 
    public String getBeneficiaryNationalId() {
        return nationalId;
    }
    public String getProjectName() { return projectName; }

    public void setName(String name) {
        this.name = name;
    }

    public void setBeneficiaryNationalId(String beneficiaryNationalId) {
        this.nationalId = beneficiaryNationalId;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getExaminationType() { return examinationType; }
    public String getMedications() { return medications; }
    public String getMedicalAnalysis() { return medicalAnalysis; }
    public String getSurgery() { return surgery; }
    public String getXRay() { return xRay; }

    public String getFoundationLessons() { return foundationLessons; }
    public String getTeachersNames() { return teachersNames; }
    public String getSchoolFees() { return schoolFees; }
    public String getSchoolBooks() { return schoolBooks; }

    public String getDebtReason() { return debtReason; }
    public String getDebtValue() { return debtValue; }
    public String getOfficialDocuments() { return officialDocuments; }

    public String getWeddingDate() { return weddingDate; }
    public String getNeedsRequirements() { return needsRequirements; }
    public String getMarriageContract() { return marriageContract; }

    public String getClothingAid() { return clothingAid; }
    public String getHomeNeeds() { return homeNeeds; }
    public String getProjectType() { return projectType; }
    public String getReadyMealsCount() { return readyMealsCount; }
    public String getUnreadyMealsCount() { return unreadyMealsCount; }

}
