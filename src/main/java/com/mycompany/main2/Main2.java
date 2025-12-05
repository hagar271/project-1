// Main.java
package com.mycompany.main2;

import java.util.ArrayList;
import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
Committee c1 = new Committee(1, "NonFixed Projects", Committee.Type.Fixed);
c1.setFixedFile(Committee.FixedFile.HEALTH);
c1.setArea(Committee.NonFixedArea.AlAtf);
        System.out.println(c1.getFixedFile());
        System.out.println(c1.getArea());
    }
}