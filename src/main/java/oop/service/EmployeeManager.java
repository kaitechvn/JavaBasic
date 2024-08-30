package oop.service;

import oop.entity.Employee;
import oop.entity.Experience;
import oop.entity.Fresher;
import oop.entity.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManager {

    private List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void insert(Employee employee) {
        this.employees.add(employee);
    }

    public Employee findById(Integer id) {
        return this.employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
    }

    public List<Employee> findByType(int type) {
        return this.employees.stream()
                .filter(employee -> {
                    if (type == 0) {
                        return employee instanceof Experience;
                    }
                    if (type == 1) {
                        return employee instanceof Fresher;
                    }
                    if (type == 2) {
                        return employee instanceof Intern;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

    public List<Employee> findAll() {
        return this.employees;
    }

    public Integer checkNumberOfEmployees(){
        return this.employees.size();
    }
}
