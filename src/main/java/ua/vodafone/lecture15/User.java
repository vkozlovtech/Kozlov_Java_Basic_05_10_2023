package ua.vodafone.lecture15;

import java.util.Objects;
import java.util.regex.Pattern;

public class User {
    private final String login;
    private final String password;
    private final static String loginRegex = "[a-zA-Z]{1,20}";
    private final static String passwordRegex = "(?=.*[0-9])(?=.*[a-zA-Z])([a-zA-Z0-9]){6,25}";

    public User(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        isValidLogin(login, loginRegex);
        isValidPassword(password, confirmPassword, passwordRegex);
        this.login = login;
        this.password = password;
    }

    public static void isValidLogin(String login, String loginRegex) throws WrongLoginException {
        Pattern pattern = Pattern.compile(loginRegex);
        if (login == null || !pattern.matcher(login).matches()) {
            throw new WrongLoginException("\n[ERROR] Entered LOGIN has wrong format, ");
        }
    }

    public static void isValidPassword(String password, String confirmPassword, String passwordRegex)
            throws WrongPasswordException {
        Pattern pattern = Pattern.compile(passwordRegex);
        if (password == null || confirmPassword == null || !pattern.matcher(password).matches()) {
            throw new WrongPasswordException("\n[ERROR] Entered PASSWORD has wrong format, ");
        } else if (!Objects.equals(password, confirmPassword)) {
            throw new WrongPasswordException("\n[ERROR] Entered PASSWORDS are different, ");
        }
    }
}
