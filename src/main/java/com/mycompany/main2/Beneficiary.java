
package com.mycompany.main2;


public class Beneficiary {

    public enum RegionCategory
    {AlZohour, AlSafti, AlManshiya, AlThawraStreet, AhmedMaherStreet, AlQitaa, KafrMalit, AlAtf, AlBahrStreet, OutsideAlMahmoudiya}

    public enum SeverityLevel  
    {RED, YELLOW, GREEN}
    
    private String nationalId;
    private String fullName;
    private int age;
    private String phone;
    private String street;
    private String region;
    private RegionCategory regionCategory;
    private double income;
    private String job;
    private String typeOfHousing;
    private String status;
    private SeverityLevel severity;
    private Committee committee;
    
    public Beneficiary(String nationalId, String fullName, int age) {
        this.nationalId = nationalId;
        this.fullName = fullName;
        this.age = age;
    }

    // setters / getters:
    public String getNationalId() { return nationalId; }
    public String getFullName() { return fullName; }
    public int getAge() { return age; }

    public void setPhone(String phone) { this.phone = phone; }
    public void setStreet(String street) { this.street = street; }
    public void setRegion(String region) { this.region = region; }
    public void setRegionCategory(RegionCategory regionCategory) { this.regionCategory = regionCategory; }
    public void setIncome(double income) { this.income = income; }
    public void setJob(String job) { this.job = job; }
    public void setTypeOfHousing(String typeOfHousing) { this.typeOfHousing = typeOfHousing; }
    public void setStatus(String status) { this.status = status; }
    public void setSeverity(SeverityLevel severity) { this.severity = severity; }
    public void setCommittee(Committee committee) { this.committee = committee; }
        public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public String getStatus() {
        return status;
    }

    public SeverityLevel getSeverity() {
        return severity;
    }
        

    public void requestHelp() {
        System.out.println(fullName + " requested help!");
    }
}
