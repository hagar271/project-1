
package com.mycompany.main2;

import java.util.ArrayList;


public class Admin extends User {

    public Admin(int userId, String fullName, String nationalId, String phone, String email, String address, String username, String password) {
        super(userId, fullName, nationalId, phone, email, address, username, password, "admin");
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
@Override
    public ArrayList<Beneficiary> viewBeneficiaries() {
       
    //return DatabaseHelper.getAllBeneficiaries(); هنربطه بالداتا بيز 
        return new ArrayList<>();
       
    }

@Override
    public ArrayList<Project> viewProjects() {
       // return DatabaseHelper.getAllProjects(); هنربطه بالداتا بيز برده
       return new ArrayList<>();
    }
    
    

    public void editBeneficiary(Beneficiary b, String newStatus) {
        b.setStatus(newStatus);
        System.out.println("Status updated for "+ b.getFullName() +"to" + newStatus);
    }

}
