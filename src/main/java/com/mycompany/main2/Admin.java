
package com.mycompany.main2;

import java.util.ArrayList;


public class Admin extends User {

    public Admin(int userId, String fullName, String nationalId, String phone, String email, String address, String username, String password) {
        super(userId, fullName, nationalId, phone, email, address, username, password, "admin");
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && password.equals(password);
    }
@Override
    public ArrayList<Beneficiary> viewBeneficiaries() {
       
    //return DatabaseHelper.getAllBeneficiaries(); هنربطه بالداتا بيز ونكتب دي
        return new ArrayList<>();
       
    }

@Override
    public ArrayList<Project> viewProjects() {
       // return DatabaseHelper.getAllProjects(); هنربطه بالداتا بيز برده
       return new ArrayList<>();
    }
    
    
    // Admin-only features
    public void editBeneficiary(Beneficiary b, String newStatus) {
        b.setStatus(newStatus);
        System.out.println("The status has been updated "+ b.getFullName() +"to" + newStatus);
    }

    void updateBeneficiaryStatus(Beneficiary b1, String approved) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
