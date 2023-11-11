package ua.vodafone.lecture15;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private final String login;
    private final String password;
    private final String confirmPassword;

    public User(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (isValidLogin(login) == false) {
            throw new WrongLoginException("\n[ERROR] Entered LOGIN has wrong format, ");
        } else if (isValidPassword(password) == false) {
            throw new WrongPasswordException("\n[ERROR] Entered PASSWORD has wrong format, ");
        } else if (!Objects.equals(password, confirmPassword)) {
            throw new WrongPasswordException("\n[ERROR] Entered PASSWORDS are different, ");
        }
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
        System.out.println("\nRegistration is successful.");
    }

    public static boolean isValidLogin(String login) {
        String regex = "^[a-zA-Z]{1,20}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(login);
        return m.matches();
    }

    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-zA-Z])([a-zA-Z0-9]){6,25}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        return m.matches();
    }
}
