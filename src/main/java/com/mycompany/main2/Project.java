
package com.mycompany.main2;

public class Project {
    private int projectId;
    private String name;
    private Committee committee; 
     
    private java.util.List<Beneficiary> beneficiaries = new java.util.ArrayList<>();
       public Project(int projectId, String name) {
        this.projectId = projectId;
        this.name = name;
    }
       
    public int getProjectId() { return projectId; }
    public String getName() { return name; }
        public Committee getCommittee() { return committee; }
    public void setCommittee(Committee committee) { this.committee = committee; }
    
        public java.util.List<Beneficiary> getBeneficiaries() { return beneficiaries; }

    public void addBeneficiary(Beneficiary b) {
        if (!beneficiaries.contains(b)) {
            beneficiaries.add(b);
            b.setCommittee(this.committee);
        }
    }
}
