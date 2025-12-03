
package com.mycompany.main2;


public abstract class User {
   protected int userId;
   protected String fullName;
   protected String nationalId;
   protected int phone;
   protected String email;
   protected String address;
   protected String passwordHash;

    public User(int userId, String fullName, String nationalId, int phone, String email, String address, String passwordHash) {
        this.userId = userId;
        this.fullName = fullName;
        this.nationalId = nationalId;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.passwordHash = passwordHash;
    }

    public int getUserid() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }
  
protected String hashPassword(String pass){
    return Integer.toHexString(pass.hashCode());
}

public boolean checkPassword(String plain) {
    return passwordHash.equals(hashPassword(plain));
}

    public abstract boolean login(String inputId, String password);
    public abstract java.util.List<Beneficiary> viewBeneficiaries();
    public abstract java.util.List<Project> viewProjects();


}
