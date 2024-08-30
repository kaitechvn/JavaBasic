package oop.entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Intern extends Employee {
    private String major;
    private Integer semester;
    private String uniName;

    public Intern(Integer id, String fullName, LocalDate dOb, String phoneNum, String email,
                  ArrayList<Certificate> certificates, String major, Integer semester, String uniName) {
        super(id, fullName, email, dOb, phoneNum, certificates);
        this.major = major;
        this.semester = semester;
        this.uniName = uniName;
    }

    public Intern(){
        super();
    }

    public void ShowMe() {
        super.ShowInfo();
        System.out.println("Major: " + major);
        System.out.println("semester: " + semester);
        System.out.println("University name: " + uniName);
    }

}
