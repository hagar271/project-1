
package com.mycompany.main2;

import java.util.ArrayList;

public class CommitteeHead extends User {

    private Committee committee;

    public CommitteeHead(int userId, String fullName, String nationalId, String phone, String email, String address, String username, String password, Committee c) {
        super(userId, fullName, nationalId, phone, email, address, username, password, "committee_head");
        this.committee= c;
    }
    
    public Committee getCommittee() { return committee; }

 @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

@Override
    public ArrayList<Beneficiary> viewBeneficiaries() {
if (committee.getType() == Committee.Type.Fixed) {
         return BeneficiaryDAO.getAllBeneficiaries(); 
    } else if (committee.getType() == Committee.Type.NonFixed) {
        return BeneficiaryDAO.getAllBeneficiaries(); 
    }
    return new ArrayList<>();
}

@Override
public ArrayList<Project> viewProjects() {
    if (committee.getType() == Committee.Type.Fixed) {
//ملفات مشروعات ثابته
        ArrayList<String> names = ProjectAndCommitteeDAO.getProjectsNamesByCommittee(committee.getName());
        ArrayList<Project> projects = new ArrayList<>();
        int i = 0;
        for (String name : names) {
            projects.add(new Project(i++, name, "Fixed"));
        }
        return projects;
        
    } else if (committee.getType() == Committee.Type.NonFixed) {
//مناطق مشروعات غير ثابته
         ArrayList<String> names = ProjectAndCommitteeDAO.getProjectsNamesByCommittee(committee.getName());
         ArrayList<Project> projects = new ArrayList<>();
         int i = 0;
         for (String name : names) {
             projects.add(new Project(i++, name, "NonFixed - Area"));
         }
         return projects;
    }
     return new ArrayList<>();
}
}