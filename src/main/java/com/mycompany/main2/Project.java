
package com.mycompany.main2;
import java.util.ArrayList;

public class Project {
    
    private int projectId;
    private String projectName;
    private String fileType;
    private Committee committee; 
    private ArrayList<Beneficiary> beneficiaries = new ArrayList<>();
  

    public Project(int projectId, String projectName, String fileType) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.fileType = fileType;
    }


    public int getProjectId() { return projectId; }
    public String getProjectName() { return projectName; }
    public String getFileType() { return fileType; }
    public Committee getCommittee() { return committee; }
    
    public void setCommittee(Committee committee) {
        this.committee = committee;
    }
  public ArrayList<Beneficiary> getBeneficiaries() {
        return beneficiaries;
  }
public void addBeneficiary(Beneficiary b) {
        if (!beneficiaries.contains(b)) {
            beneficiaries.add(b);
            if(b.getCommittee()== null){
                b.setCommittee(this.committee);
            }
        }
    }
}
