package ua.vodafone.lecture15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {

    @Test
    public void successfulRegistration() throws WrongLoginException, WrongPasswordException {
        // given
        String login = "Test";
        String password = "Tester1";
        String confirmPassword = "Tester1";

        // when
        new User(login, password, confirmPassword);
    }

    @Test
    public void loginEmpty() {
        // given
        String login = "";
        String password = "Tester1";

        // when
        WrongLoginException exception =
                assertThrows(WrongLoginException.class, () -> new User(login, password, password));

        // then
        assertEquals("\n[ERROR] Entered LOGIN has wrong format, ", exception.getMessage());
    }

    @Test
    public void loginMoreThanAllowed() {
        // given
        String login = "Testtesttesttesttestt";
        String password = "Tester1";

        // when
        WrongLoginException exception =
                assertThrows(WrongLoginException.class, () -> new User(login, password, password));

        // then
        assertEquals("\n[ERROR] Entered LOGIN has wrong format, ", exception.getMessage());
    }

    @Test
    public void loginWithNumbers() {
        // given
        String login = "Test123";
        String password = "Tester1";

        // when
        WrongLoginException exception =
                assertThrows(WrongLoginException.class, () -> new User(login, password, password));

        // then
        assertEquals("\n[ERROR] Entered LOGIN has wrong format, ", exception.getMessage());
    }

    @Test
    public void loginWithSpecialSymbols() {
        // given
        String login = "Test@";
        String password = "Tester1";

        // when
        WrongLoginException exception =
                assertThrows(WrongLoginException.class, () -> new User(login, password, password));

        // then
        assertEquals("\n[ERROR] Entered LOGIN has wrong format, ", exception.getMessage());
    }

    @Test
    public void loginWithCyrillic() {
        // given
        String login = "Тест";
        String password = "Tester1";

        // when
        WrongLoginException exception =
                assertThrows(WrongLoginException.class, () -> new User(login, password, password));

        // then
        assertEquals("\n[ERROR] Entered LOGIN has wrong format, ", exception.getMessage());
    }

    @Test
    public void loginNull() {
        // given
        String login = null;
        String password = "Tester1";

        // when
        WrongLoginException exception =
                assertThrows(WrongLoginException.class, () -> new User(login, password, password));

        // then
        assertEquals("\n[ERROR] Entered LOGIN has wrong format, ", exception.getMessage());
    }

    @Test
    public void passwordEmpty() {
        // given
        String login = "Test";
        String password = "";

        // when
        WrongPasswordException exception =
                assertThrows(WrongPasswordException.class, () -> new User(login, password, password));

        // then
        assertEquals("\n[ERROR] Entered PASSWORD has wrong format, ", exception.getMessage());
    }

    @Test
    public void passwordLessThanAllowed() {
        // given
        String login = "Test";
        String password = "Test1";

        // when
        WrongPasswordException exception =
                assertThrows(WrongPasswordException.class, () -> new User(login, password, password));

        // then
        assertEquals("\n[ERROR] Entered PASSWORD has wrong format, ", exception.getMessage());
    }

    @Test
    public void passwordMoreThanAllowed() {
        // given
        String login = "Test";
        String password = "TesterTesterTesterTesterT1";

        // when
        WrongPasswordException exception =
                assertThrows(WrongPasswordException.class, () -> new User(login, password, password));

        // then
        assertEquals("\n[ERROR] Entered PASSWORD has wrong format, ", exception.getMessage());
    }

    @Test
    public void passwordWithoutNumbers() {
        // given
        String login = "Test";
        String password = "TesterTester";

        // when
        WrongPasswordException exception =
                assertThrows(WrongPasswordException.class, () -> new User(login, password, password));

        // then
        assertEquals("\n[ERROR] Entered PASSWORD has wrong format, ", exception.getMessage());
    }

    @Test
    public void passwordWithoutCharacters() {
        // given
        String login = "Test";
        String password = "123456789";

        // when
        WrongPasswordException exception =
                assertThrows(WrongPasswordException.class, () -> new User(login, password, password));

        // then
        assertEquals("\n[ERROR] Entered PASSWORD has wrong format, ", exception.getMessage());
    }

    @Test
    public void passwordWithCyrillic() {
        // given
        String login = "Test";
        String password = "Тестер1";

        // when
        WrongPasswordException exception =
                assertThrows(WrongPasswordException.class, () -> new User(login, password, password));

        // then
        assertEquals("\n[ERROR] Entered PASSWORD has wrong format, ", exception.getMessage());
    }

    @Test
    public void passwordSpecialSymbols() {
        // given
        String login = "Test";
        String password = "Tester1@";

        // when
        WrongPasswordException exception =
                assertThrows(WrongPasswordException.class, () -> new User(login, password, password));

        // then
        assertEquals("\n[ERROR] Entered PASSWORD has wrong format, ", exception.getMessage());
    }

    @Test
    public void passwordNull() {
        // given
        String login = "Test";
        String password = null;

        // when
        WrongPasswordException exception =
                assertThrows(WrongPasswordException.class, () -> new User(login, password, password));

        // then
        assertEquals("\n[ERROR] Entered PASSWORD has wrong format, ", exception.getMessage());
    }

    @Test
    public void passwordsDoNotMatch() {
        // given
        String login = "Test";
        String password = "Tester1";
        String confirmPassword = "Tester2";

        // when
        WrongPasswordException exception =
                assertThrows(WrongPasswordException.class, () -> new User(login, password, confirmPassword));

        // then
        assertEquals("\n[ERROR] Entered PASSWORDS are different, ", exception.getMessage());
    }
}
