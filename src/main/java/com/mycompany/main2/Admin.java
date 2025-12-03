
package com.mycompany.main2;

import java.util.List;


public class Admin extends User {

    public Admin(int userId, String fullName, String nationalId, int phone, String email, String address, String passwordHash) {
        super(userId, fullName, nationalId, phone, email, address, passwordHash);
    }

    @Override
    public boolean login(String inputId, String password) {
        return (email.equalsIgnoreCase(inputId) || nationalId.equals(inputId))
                && checkPassword(password);
    }

    @Override
    public java.util.List<Beneficiary> viewBeneficiaries() {
        return new java.util.ArrayList<>(); // Admin sees all (dummy for OOP only)
    }

    @Override
    public java.util.List<Project> viewProjects() {
        return new java.util.ArrayList<>();
    }

    // Admin-only features
    public void editBeneficiary(Beneficiary b, String newStatus) {
        b.setStatus(newStatus);
    }

    public void manageCommittees() {
        System.out.println("Managing all committees...");
    }
}
