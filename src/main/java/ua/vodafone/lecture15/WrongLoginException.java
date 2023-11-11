package ua.vodafone.lecture15;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}
