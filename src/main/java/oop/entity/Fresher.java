package oop.entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fresher extends Employee {

    private Integer graduationDate;
    private String graduationRank;

    public Fresher(Integer id, String fullName, LocalDate dOb, String phoneNum, String email,
                   ArrayList<Certificate> certificates, Integer graduationDate, String graduationRank) {
        super(id, fullName, email, dOb, phoneNum, certificates);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public Fresher() {
        super();
    }

    public Integer getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Integer graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public void ShowMe() {
        super.ShowInfo(); // Calls the ShowInfo method in entity.Employee
        System.out.println("Graduation Date: " + graduationDate);
        System.out.println("Graduation Rank: " + graduationRank);
    }
}
