
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
// ⬅️ الآن يستخدم BeneficiaryDAO لجلب كل المستفيدين (صلاحية Admin)
    return BeneficiaryDAO.getAllBeneficiaries();
       
    }

@Override
    public ArrayList<Project> viewProjects() {
       return new ArrayList<>();
    }
    
    

public boolean addBeneficiary(Beneficiary b) {
    return BeneficiaryDAO.addBeneficiary(b);
}

public boolean updateBeneficiary(Beneficiary b) {
    return BeneficiaryDAO.updateBeneficiary(b);
}

public boolean deleteBeneficiary(String nationalId) {
    return BeneficiaryDAO.deleteBeneficiary(nationalId);

}
}
