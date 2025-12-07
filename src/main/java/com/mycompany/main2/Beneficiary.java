
package com.mycompany.main2;

public class Beneficiary {

    public enum Region
    {AlZohour, AlSafti, AlManshiya, AlThawraStreet, AhmedMaherStreet, AlQataa, KafrMalit, AlAtf, AlBahrStreet, OutsideAlMahmoudiya}

    public enum Severity  
    {RED, YELLOW, GREEN, Null_Level}
    
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
    public void setPhone(String phone) { this.phone = phone; }
    public void setRegion(Region region) { this.region = region; }  
    public void setIncome(double income) { this.income = income; }
    public void setStatus(String status) { this.status = status; }
    public void setSeverity(Severity severity) { this.severity = severity; }
    public void setCommittee(Committee committee) { this.committee = committee; }
    public void setStreet(String street) { this.street = street;}
    public void setJob(String job) { this.job = job;}
    public void setHousingType(String housingType) { this.housingType = housingType;}


    public String getNationalId() { return nationalId; }
    public String getFullName() { return fullName; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }
    public Region getRegion() { return region; }
    public double getIncome() { return income; }
    public String getStatus() { return status; }
    public Severity getSeverity() { return severity; }
    public Committee getCommittee() { return committee; }
    public String getStreet() { return street; }
    public String getJob() { return job;}
    public String getHousingType() { return housingType;}

    @Override
    public String toString() {
        return "Beneficiary{" + "nationalId=" + nationalId + ", fullName=" + fullName + ", age=" + age + ", phone=" + phone + ", street=" + street + ", region=" + region + ", income=" + income + ", job=" + job + ", housingType=" + housingType + ", status=" + status + ", severity=" + severity + ", committee=" + committee + '}';
    }

}