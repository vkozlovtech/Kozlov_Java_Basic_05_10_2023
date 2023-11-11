package ua.vodafone.lecture15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void successfulRegistration() {
        // given
        String login = "Test";
        String password = "Tester1";
        String confirmPassword = "Tester1";
        boolean noThrown;

        // when
        try {
            User user = new User(login, password, confirmPassword);
            noThrown = true;
        } catch (WrongLoginException | WrongPasswordException e) {
            noThrown = false;
        }

        // then
        Assertions.assertTrue(noThrown);
    }

    @Test
    public void loginEmpty() throws WrongPasswordException {
        // given
        String login = "";
        String password = "Tester1";
        String confirmPassword = "Tester1";
        boolean thrown = false;

        // when
        try {
            User user = new User(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            thrown = true;
        }

        // then
        Assertions.assertTrue(thrown);
    }

    @Test
    public void loginMoreThanAllowed() throws WrongPasswordException {
        // given
        String login = "Testtesttesttesttestt";
        String password = "Tester1";
        String confirmPassword = "Tester1";
        boolean thrown = false;

        // when
        try {
            User user = new User(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            thrown = true;
        }

        // then
        Assertions.assertTrue(thrown);
    }

    @Test
    public void loginWithNumbers() throws WrongPasswordException {
        // given
        String login = "Test123";
        String password = "Tester1";
        String confirmPassword = "Tester1";
        boolean thrown = false;

        // when
        try {
            User user = new User(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            thrown = true;
        }

        // then
        Assertions.assertTrue(thrown);
    }

    @Test
    public void loginWithSpecialSymbols() throws WrongPasswordException {
        // given
        String login = "Test@";
        String password = "Tester1";
        String confirmPassword = "Tester1";
        boolean thrown = false;

        // when
        try {
            User user = new User(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            thrown = true;
        }

        // then
        Assertions.assertTrue(thrown);
    }

    @Test
    public void loginWithCyrillic() throws WrongPasswordException {
        // given
        String login = "Тест";
        String password = "Tester1";
        String confirmPassword = "Tester1";
        boolean thrown = false;

        // when
        try {
            User user = new User(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            thrown = true;
        }

        // then
        Assertions.assertTrue(thrown);
    }

    @Test
    public void passwordEmpty() throws WrongLoginException {
        // given
        String login = "Test";
        String password = "";
        String confirmPassword = "Tester1";
        boolean thrown = false;

        // when
        try {
            User user = new User(login, password, confirmPassword);
        } catch (WrongPasswordException e) {
            thrown = true;
        }

        // then
        Assertions.assertTrue(thrown);
    }

    @Test
    public void passwordLessThanAllowed() throws WrongLoginException {
        // given
        String login = "Test";
        String password = "Test1";
        String confirmPassword = "Test1";
        boolean thrown = false;

        // when
        try {
            User user = new User(login, password, confirmPassword);
        } catch (WrongPasswordException e) {
            thrown = true;
        }

        // then
        Assertions.assertTrue(thrown);
    }

    @Test
    public void passwordMoreThanAllowed() throws WrongLoginException {
        // given
        String login = "Test";
        String password = "TesterTesterTesterTesterT1";
        String confirmPassword = "TesterTesterTesterTesterT1";
        boolean thrown = false;

        // when
        try {
            User user = new User(login, password, confirmPassword);
        } catch (WrongPasswordException e) {
            thrown = true;
        }

        // then
        Assertions.assertTrue(thrown);
    }

    @Test
    public void passwordWithoutNumbers() throws WrongLoginException {
        // given
        String login = "Test";
        String password = "TesterTester";
        String confirmPassword = "TesterTester";
        boolean thrown = false;

        // when
        try {
            User user = new User(login, password, confirmPassword);
        } catch (WrongPasswordException e) {
            thrown = true;
        }

        // then
        Assertions.assertTrue(thrown);
    }

    @Test
    public void passwordWithoutCharacters() throws WrongLoginException {
        // given
        String login = "Test";
        String password = "123456789";
        String confirmPassword = "123456789";
        boolean thrown = false;

        // when
        try {
            User user = new User(login, password, confirmPassword);
        } catch (WrongPasswordException e) {
            thrown = true;
        }

        // then
        Assertions.assertTrue(thrown);
    }

    @Test
    public void passwordWithCyrillic() throws WrongLoginException {
        // given
        String login = "Test";
        String password = "Тестер1";
        String confirmPassword = "Тестер1";
        boolean thrown = false;

        // when
        try {
            User user = new User(login, password, confirmPassword);
        } catch (WrongPasswordException e) {
            thrown = true;
        }

        // then
        Assertions.assertTrue(thrown);
    }

    @Test
    public void passwordSpecialSymbols() throws WrongLoginException {
        // given
        String login = "Test";
        String password = "Tester@";
        String confirmPassword = "Tester@";
        boolean thrown = false;

        // when
        try {
            User user = new User(login, password, confirmPassword);
        } catch (WrongPasswordException e) {
            thrown = true;
        }

        // then
        Assertions.assertTrue(thrown);
    }

    @Test
    public void passwordsDoNotMatch() throws WrongLoginException {
        // given
        String login = "Test";
        String password = "Tester1";
        String confirmPassword = "Tester2";
        boolean thrown = false;

        // when
        try {
            User user = new User(login, password, confirmPassword);
        } catch (WrongPasswordException e) {
            thrown = true;
        }

        // then
        Assertions.assertTrue(thrown);
    }
}
