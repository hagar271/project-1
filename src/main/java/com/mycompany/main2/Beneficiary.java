
package com.mycompany.main2;

public class Beneficiary {

    public enum Region
    {AlZohour, AlSafti, AlManshiya, AlThawraStreet, AhmedMaherStreet, AlQitaa, KafrMalit, AlAtf, AlBahrStreet, OutsideAlMahmoudiya}

    public enum Severity  
    {RED, YELLOW, GREEN}
    
    private String nationalId;
    private String fullName;
    private int age;
    private String phone;
    private String street;
    private Region region;
    private double income;
    private String job;
    private String housingType;
    private String status;
    private Severity severity;
    private Committee committee;
    
   public Beneficiary(String nationalId, String fullName, int age) {
        this.nationalId = nationalId;
        this.fullName = fullName;
        this.age = age;
    }

    // جيترز وستيرز مهمين
    public String getNationalId() { return nationalId; }
    public String getFullName() { return fullName; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public Region getRegion() { return region; }
    public void setRegion(Region region) { this.region = region; }
    public double getIncome() { return income; }
    public void setIncome(double income) { this.income = income; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Severity getSeverity() { return severity; }
    public void setSeverity(Severity severity) { this.severity = severity; }
    public Committee getCommittee() { return committee; }
    public void setCommittee(Committee committee) { this.committee = committee; }


}
