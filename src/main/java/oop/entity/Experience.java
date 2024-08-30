package oop.entity;

import java.time.LocalDate;
import java.util.ArrayList;
public class Experience extends Employee {
    private Integer expInYear;
    private ArrayList<String> proSkills;

    public Experience() {
        super();
    }
    public Experience(Integer id, String fullName, String email, LocalDate dOb, String phoneNum,
                      ArrayList<Certificate> certificates, Integer expInYear, ArrayList<String> proSkills) {
        super(id, fullName, email, dOb, phoneNum, certificates);
        this.expInYear = expInYear;
        this.proSkills = proSkills;
    }

    public Integer getExpInYear() {
        return expInYear;
    }

    public ArrayList<String> getProSkills() {
        return proSkills;
    }

    public void setExpInYear(Integer expInYear) {
        this.expInYear = expInYear;
    }

    public void setProSkills(ArrayList<String> proSkills) {
        this.proSkills = proSkills;
    }

    public void ShowMe() {
        super.ShowInfo(); // Calls the ShowInfo method in entity.Employee
        System.out.println("Years of entity.Experience: " + expInYear);
    }

}
