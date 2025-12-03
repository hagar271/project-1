package com.mycompany.main2;

public class Main2 {

    public static void main(String[] args) {


//        // -------------------------------
//        // 1) Create Committees
//        // -------------------------------
//        Committee education = new Committee(1, "Education Committee", Committee.CommitteeType.Fixed);
//        Committee winterCampaign = new Committee(2, "Winter Campaign", Committee.CommitteeType.NonFixed);
//
//        // -------------------------------
//        // 2) Create Projects
//        // -------------------------------
//        Project schoolBags = new Project(101, "School Bags Project");
//        Project winterClothes = new Project(202, "Winter Clothes Project");
//
//        // Assign projects to committees
//        education.addProject(schoolBags);
//        winterCampaign.addProject(winterClothes);
//
//        // -------------------------------
//        // 3) Create Beneficiaries
//        // -------------------------------
//        Beneficiary b1 = new Beneficiary("12345678901234", "Ahmed Hassan", 35);
//        b1.setRegion("AlZohour");
//        b1.setRegionCategory(Beneficiary.RegionCategory.AlZohour);
//        b1.setSeverity(Beneficiary.SeverityLevel.RED);
//        b1.setStatus("Pending");
//
//        Beneficiary b2 = new Beneficiary("56789012345678", "Malak Ibrahim", 29);
//        b2.setRegion("KafrMalit");
//        b2.setRegionCategory(Beneficiary.RegionCategory.KafrMalit);
//        b2.setSeverity(Beneficiary.SeverityLevel.YELLOW);
//        b2.setStatus("Under Review");
//
//        // Assign beneficiaries to committees
//        education.addBeneficiary(b1);
//        winterCampaign.addBeneficiary(b2);
//
//        // Assign beneficiaries to projects
//        schoolBags.addBeneficiary(b1);
//        winterClothes.addBeneficiary(b2);
//
//        // -------------------------------
//        // 4) Create Users
//        // -------------------------------
//        Admin admin = new Admin(
//                10, "General Admin", "11111111111111",
//                1000000000, "admin@ngo.org", "Cairo",
//                Integer.toHexString("admin123".hashCode())
//        );
//
//FixedCommitteeHead fixedHead = new FixedCommitteeHead(
//        11, "Education Head", "22222222222222",
//        1005555555, "education@ngo.org", "Cairo",
//        Integer.toHexString("edu123".hashCode()),
//        education   // <--- THIS FIXES EVERYTHING
//);
//
//
//        // NOTE: your FixedCommitteeHead class does NOT take committee in constructor
//        // so we manually assign it
//        // (optional) if you want to store committee, add setter in your class
//
//        NonFixedCommitteeHead nonFixedHead = new NonFixedCommitteeHead(
//                12, "Events Head", "33333333333333",
//                1007777777, "events@ngo.org", "Alexandria",
//                Integer.toHexString("event999".hashCode()),
//                winterCampaign
//        );
//
//        // -------------------------------
//        // 5) Polymorphism demonstration
//        // -------------------------------
//        System.out.println("=== Beneficiaries visible to Fixed Committee Head ===");
//        for (Beneficiary b : fixedHead.viewBeneficiaries()) {
//            System.out.println("- " + b.getFullName() + " | Severity: " + b.getSeverity());
//        }
//
//        System.out.println("\n=== Beneficiaries visible to Non-Fixed Committee Head ===");
//        for (Beneficiary b : nonFixedHead.viewBeneficiaries()) {
//            System.out.println("- " + b.getFullName() + " | Severity: " + b.getSeverity());
//        }
//
//        // -------------------------------
//        // 6) Admin edits a status
//        // -------------------------------
//        System.out.println("\n=== Admin Status Update ===");
//        admin.editBeneficiary(b1, "Approved");
//        System.out.println("New status for " + b1.getFullName() + ": " + b1.getStatus());


















    }
}
