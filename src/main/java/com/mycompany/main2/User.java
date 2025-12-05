
package com.mycompany.main2;

import java.util.ArrayList;
public abstract class User {
   protected int userId;
   protected String fullName;
   protected String nationalId;
   protected String phone;
   protected String email;
   protected String address;
   protected String username;
   protected String password;
   protected String role;
    public User() {
    }

    public User(int userId, String fullName, String nationalId, String phone, String email, String address, String username, String password, String role) {
        this.userId = userId;
        this.fullName = fullName;
        this.nationalId = nationalId;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.username = username;
        this.password = password;
        this.role = role;
    }
   
 public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
    public String getFullName() { return fullName; }
   
    public abstract boolean login(String username, String password);
    public abstract ArrayList<Beneficiary> viewBeneficiaries();
    public abstract ArrayList<Project> viewProjects();

}
