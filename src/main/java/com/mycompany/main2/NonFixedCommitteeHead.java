
package com.mycompany.main2;

import java.util.List;


public class NonFixedCommitteeHead extends User{
private Committee committee;
    public NonFixedCommitteeHead(int userId, String fullName, String nationalId, int phone, String email, String address, String passwordHash, Committee committee) {
        super(userId, fullName, nationalId, phone, email, address, passwordHash);
        this.committee= committee;
    }

    public Committee getCommittee() { return committee; }

       @Override
    public boolean login(String inputId, String password) {
        return checkPassword(password);
    }

    @Override
    public java.util.List<Beneficiary> viewBeneficiaries() {
        return committee.getBeneficiaries();
    }

    @Override
    public java.util.List<Project> viewProjects() {
        return committee.getProjects();
    }
}