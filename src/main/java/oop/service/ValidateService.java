package oop.service;

import oop.exception.BirthdayException;
import oop.exception.EmailException;
import oop.exception.PhoneException;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateService {

    public static void checkBirthday(LocalDate birthday) throws BirthdayException {

        // birthday can not be in the future
        if (birthday.isAfter(LocalDate.now())) {
            throw new BirthdayException("Birthday cannot be in the future.");
        }

        // birthday can not be too far from the past
        if (birthday.isBefore(LocalDate.of(1900, 1, 1))) {
            throw new BirthdayException("Birthday is too far in the past.");
        }
    }

    public static void checkEmail(String email) throws EmailException {
        String email_regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        Pattern email_parttern = Pattern.compile(email_regex);

        if (email == null) {
            throw new EmailException("Email cannot be null");
        }

        Matcher matcher = email_parttern.matcher(email);
        if (!matcher.matches()) {
            throw new EmailException("Invalid email address " + email);
        }
    }

    public static void checkPhone(String phone) throws PhoneException {

        if (phone == null) {
            throw new PhoneException("Phone cannot be null");
        }

        if (phone.length() != 11) {
            throw new PhoneException("Phone number must have 11 numbers");
        }

        if (!phone.startsWith("0")) {
            throw new PhoneException("Phone number must start with 0");
        }


    }


}
