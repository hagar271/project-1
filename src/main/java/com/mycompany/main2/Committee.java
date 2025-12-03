
package com.mycompany.main2;

public class Committee {
    public enum CommitteeType 
    {Fixed, NonFixed}
    private int committeeId;
    private String name;
    private CommitteeType type;

    private java.util.List<Project> projects = new java.util.ArrayList<>();
    private java.util.List<Beneficiary> beneficiaries = new java.util.ArrayList<>();
    public Committee(int committeeId, String name, CommitteeType type) {
        this.committeeId = committeeId;
        this.name = name;
        this.type = type;
    }
    public int getCommitteeId() 
    { return committeeId; }
    public String getName()
    { return name; }
    public CommitteeType getType()
    { return type; }

    public java.util.List<Project> getProjects() { return projects; }
    public java.util.List<Beneficiary> getBeneficiaries() { return beneficiaries; }
    
        public void addProject(Project p) {
        if (!projects.contains(p)) {
            projects.add(p);
          p.setCommittee(this);
        }
    }
    public void addBeneficiary(Beneficiary b) {
        if (!beneficiaries.contains(b)) {
            beneficiaries.add(b);
            b.setCommittee(this);
        }
    }
}
