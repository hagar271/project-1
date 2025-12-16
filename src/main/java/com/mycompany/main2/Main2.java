package com.mycompany.main2;

import com.mycompany.main2.GUI.Ahmedma;
import com.mycompany.main2.GUI.login;
import com.mycompany.main2.GUI.next;




public class Main2 {

// في ملف Main2.java
// داخل كلاس Main2.java
public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        next frame = new next();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null); // لفتحها في منتصف الشاشة
    });
}
    }

    