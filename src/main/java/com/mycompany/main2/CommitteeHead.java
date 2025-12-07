
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
        // قائد اللجنة الثابتة (Fixed): يرى المستفيدين حسب ملفات اللجنة (صحة، تعليم، إلخ)
        // بما أننا طلبنا استخدام نفس المستفيدين، سنرجع الكل أو سنحتاج دالة:
        // return BeneficiaryDAO.getBeneficiariesByProject(committee.getName());
         return BeneficiaryDAO.getAllBeneficiaries(); // للتبسيط حالياً
        
    } else if (committee.getType() == Committee.Type.NonFixed) {
        // قائد اللجنة غير الثابتة (NonFixed): يرى المستفيدين حسب المنطقة
        // بما أن المشروع يغطي منطقة واحدة حالياً (unfixed committee)، سنعرض الكل:
        // return BeneficiaryDAO.getBeneficiariesByRegion(committee.getName()); 
        return BeneficiaryDAO.getAllBeneficiaries(); // للتبسيط حالياً
    }
    return new ArrayList<>();
}

@Override
public ArrayList<Project> viewProjects() {
     // ⬅️ يستخدم ProjectAndCommitteeDAO لاسترجاع أسماء المشاريع
    if (committee.getType() == Committee.Type.Fixed) {
        // للجنة الثابتة، نظهر أسماء الملفات (المشاريع)
        ArrayList<String> names = ProjectAndCommitteeDAO.getProjectsNamesByCommittee(committee.getName());
        ArrayList<Project> projects = new ArrayList<>();
        // تحويل أسماء المشاريع إلى كائنات Project بسيطة
        int i = 0;
        for (String name : names) {
            projects.add(new Project(i++, name, "Fixed"));
        }
        return projects;
        
    } else if (committee.getType() == Committee.Type.NonFixed) {
         // للجنة غير الثابتة، نظهر المناطق (التي تمثل المشاريع في هذه الحالة)
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