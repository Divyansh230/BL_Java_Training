package org.Bnzemeine.validation;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Validator {

    private static final Pattern Email=Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
    private static final Pattern Phone=Pattern.compile("^[6-9][0-9]{9}$");
    private static final Pattern PASSWORD =Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).{8,}$");

    public static boolean isValidEmail(String email) {
        return Email.matcher(email).matches();
    }

    public static boolean isValidPhone(String phone) {
        return Phone.matcher(phone).matches();
    }
    public static boolean isValidPassword(String password) {
        return PASSWORD.matcher(password).matches();
    }

    public static String maskPhone(String phone) {
        return phone.replaceAll("\\d(?=\\d{4})", "*");
    }

    // method references exposed
    public static final Predicate<String> EMAIL_CHECK = Validator::isValidEmail;
    public static final Predicate<String> PHONE_CHECK = Validator::isValidPhone;
    public static final Predicate<String> PASSWORD_CHECK = Validator::isValidPassword;


}
