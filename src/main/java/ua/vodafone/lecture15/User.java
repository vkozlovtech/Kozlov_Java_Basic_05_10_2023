package ua.vodafone.lecture15;

import java.util.Objects;
import java.util.regex.Pattern;

public class User {
    private final static Pattern PATTERN_LOGIN_REGEX = Pattern.compile("[a-zA-Z]{1,20}");
    private final static Pattern PASSWORD_LOGIN_REGEX = Pattern.compile("(?=.*[0-9])(?=.*[a-zA-Z])([a-zA-Z0-9]){6,25}");
    private final String login;
    private final String password;

    public User(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        validateLogin(login);
        validatePassword(password, confirmPassword);
        this.login = login;
        this.password = password;
    }

    public static void validateLogin(String login) throws WrongLoginException {
        if (login == null || !PATTERN_LOGIN_REGEX.matcher(login).matches()) {
            throw new WrongLoginException("\n[ERROR] Entered LOGIN has wrong format, ");
        }
    }

    public static void validatePassword(String password, String confirmPassword)
            throws WrongPasswordException {
        if (password == null || confirmPassword == null || !PASSWORD_LOGIN_REGEX.matcher(password).matches()) {
            throw new WrongPasswordException("\n[ERROR] Entered PASSWORD has wrong format, ");
        } else if (!Objects.equals(password, confirmPassword)) {
            throw new WrongPasswordException("\n[ERROR] Entered PASSWORDS are different, ");
        }
    }
}
