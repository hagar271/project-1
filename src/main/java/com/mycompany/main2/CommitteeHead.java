
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
        return committee.getBeneficiaries(); //بيشوف بس حالات لجنته
    }

@Override
    public ArrayList<Project> viewProjects() {
        return committee.getProjects();
    }
}
