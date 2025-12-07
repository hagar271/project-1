package com.mycompany.main2;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
// 12. Main.java (Test everything)

        User user = UserDAO.loginUser("2024"
                + "", "122026"); // Board
        // User user = UserDAO.login("2023", "122026"); // Fixed leader
        // User user = UserDAO.login("2024", "122026"); // Unfixed leader

        if (user == null) {
            System.out.println("Wrong username or password");
            return;
        }

        System.out.println("Welcome " + user.getFullName() + " (" + user.getRole() + ")");

        System.out.println("\n" + Beneficiary.class);
        System.out.println("-".repeat(160));

        for (Beneficiary b : user.viewBeneficiaries()) {
            System.out.println(b);
        }

        System.out.println("\nProjects:");
        for (Project p : user.viewProjects()) {
            System.out.println(" - " + p.getProjectName());
        }

        DatabaseConnection.close();
    }
}
    