
package com.mycompany.main2;
import java.util.ArrayList;

public class Committee {
    
    public enum Type {Fixed, NonFixed}
    public enum FixedFile { EDUCATION, FOOD, BRIDES, HUMAN, PENALTIES, HEALTH }
    public enum NonFixedArea { AlZohour,AlSafti, AlManshiya, AlThawraStreet, AhmedMaherStreet, AlQitaa,
        KafrMalit, AlAtf, AlBahrStreet, OutsideAlMahmoudiya}
    
    private int id;
    private String name;
    private Type type;
    private FixedFile fixedFile;     
    private NonFixedArea area;        
    private ArrayList<Project> projects = new ArrayList<>();
    private ArrayList<Beneficiary> beneficiaries = new ArrayList<>();
    
    public Committee(int id, String name, Type type ) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public FixedFile getFixedFile() {
        return fixedFile;
    }
    public void setFixedFile(FixedFile fixedFile) {
        this.fixedFile = fixedFile;
    }
    public NonFixedArea getArea() {
        return area;
    }
    public void setArea(NonFixedArea area) {
        this.area = area;
    }
    public int getId() 
    { return id; }
    public String getName()
    { return name; }
    public Type getType()
    { return type; }

    public ArrayList<Project> getProjects() { return projects; }
    public ArrayList<Beneficiary> getBeneficiaries() { return beneficiaries; }
    
        public void addProject(Project p) {
        if (!projects.contains(p)) {
            projects.add(p);
          p.setCommittee(this);
        }
    }
    public void addBeneficiary(Beneficiary b) {
        if (!beneficiaries.contains(b)) {
            beneficiaries.add(b);
            b.setCommittee(this);
        }
    }
}
