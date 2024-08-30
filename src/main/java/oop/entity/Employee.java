package oop.entity;

import java.time.LocalDate;
import java.util.List;

public abstract class Employee {
    private Integer id;
    private String fullName;
    private String email;
    private LocalDate dOb;
    private String phoneNum;

    private List<Certificate> certificates;

    public Employee(Integer id, String fullName, String email, LocalDate dOb, String phoneNum, List<Certificate> certificates) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.dOb = dOb;
        this.phoneNum = phoneNum;
        this.certificates = certificates;
    }

    public Employee() {
    }

    public void ShowInfo() {
       System.out.println("entity.Employee Information:");
       System.out.println("ID: " + id);
       System.out.println("Full Name: " + fullName);
       System.out.println("Email: " + email);
       System.out.println("Date of Birth: " + dOb);
       System.out.println("Phone Number: " + phoneNum);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setdOb(LocalDate dOb) {
        this.dOb = dOb;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getdOb() {
        return dOb;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

}
