package oop;

import oop.entity.Experience;
import oop.entity.Fresher;
import oop.entity.Intern;
import oop.exception.BirthdayException;
import oop.exception.EmailException;
import oop.exception.PhoneException;
import oop.service.EmployeeManager;
import oop.service.ValidateService;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Valid Employees
        try {
            Experience exp = new Experience(1, "John Doe", "john.doe@example.com", LocalDate.of(1990, 5, 15),
                    "01234567890", new ArrayList<>(), 5, new ArrayList<>());
            ValidateService.checkBirthday(exp.getdOb());
            ValidateService.checkEmail(exp.getEmail());
            ValidateService.checkPhone(exp.getPhoneNum());
            manager.insert(exp);

            Fresher fresher = new Fresher(2, "Jane Smith", LocalDate.of(1998, 8, 10), "09876543210",
                    "jane.smith@example.com", new ArrayList<>(), 2022, "First Class");
            ValidateService.checkBirthday(fresher.getdOb());
            ValidateService.checkEmail(fresher.getEmail());
            ValidateService.checkPhone(fresher.getPhoneNum());
            manager.insert(fresher);

            Intern intern = new Intern(3, "Alice Johnson", LocalDate.of(2000, 1, 1), "01123456789",
                    "alice.johnson@example.com", new ArrayList<>(), "Computer Science", 3, "MIT");
            ValidateService.checkBirthday(intern.getdOb());
            ValidateService.checkEmail(intern.getEmail());
            ValidateService.checkPhone(intern.getPhoneNum());
            manager.insert(intern);

            System.out.println("Valid Employees Inserted Successfully.");
        } catch (BirthdayException | EmailException | PhoneException e) {
            System.err.println("Error inserting valid employee: " + e.getMessage());
        }

        // Invalid Employees - Checking all exceptions
        Experience invalidExp = new Experience(4, "Invalid User", "invalid.email.com", LocalDate.of(2025, 5, 15),
                "1234567890", new ArrayList<>(), 2, new ArrayList<>());

        boolean hasErrors = false;

        try {
            ValidateService.checkBirthday(invalidExp.getdOb());
        } catch (BirthdayException e) {
            hasErrors = true;
            System.err.println("Birthday error: " + e.getMessage());
        }

        try {
            ValidateService.checkEmail(invalidExp.getEmail());
        } catch (EmailException e) {
            hasErrors = true;
            System.err.println("Email error: " + e.getMessage());
        }

        try {
            ValidateService.checkPhone(invalidExp.getPhoneNum());
        } catch (PhoneException e) {
            hasErrors = true;
            System.err.println("Phone error: " + e.getMessage());
        }

        if (!hasErrors) {
            manager.insert(invalidExp);
        } else {
            System.err.println("Invalid employee data. Not inserted. Please try again");
        }

        // Find and print all employees
        System.out.println("\nAll Employees:");
        manager.findAll().forEach(employee -> System.out.println(employee.getFullName() + ", " + employee.getEmail()));

        // Check specific searches
        System.out.println("\nFinding Employee with ID 1:");
        System.out.println(manager.findById(1).getFullName());

        System.out.println("\nFinding all Freshers:");
        manager.findByType(1).forEach(employee -> System.out.println(employee.getFullName()));
    }
}
