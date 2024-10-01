import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    //at least 8 characters
    @Test
    @DisplayName("Exactly 8 characters")
   public void hasEightCharactersTest_when_password_expect_True() {
        //GIVEN
        String password = "password";

        //WHEN
        boolean actual = Main.hasEightCharacters(password);

        //THEN
        assertTrue(actual);
    }

    //
    @Test
    @DisplayName("Less than 8 characters")
    public void hasEightCharactersTest_when_word_expect_False() {
        //GIVEN
        String password = "word";

        //WHEN
        boolean actual = Main.hasEightCharacters(password);

        //THEN
        assertFalse(actual);
    }

    @Test
    @DisplayName("More than 8 characters")
    public void hasEightCharactersTest_when_SuperLongWord_expect_True() {
        //GIVEN
        String password = "SuperLongWord";

        //WHEN
        boolean actual = Main.hasEightCharacters(password);

        //THEN
        assertTrue(actual);
    }

    @Test
    @DisplayName("0 characters")
    public void hasEightCharactersTest_when___expect_False() {
        //GIVEN
        String password = "";

        //WHEN
        boolean actual = Main.hasEightCharacters(password);

        //THEN
        assertFalse(actual);
    }

    //at least one digit
    @Test
    @DisplayName("No digits")
    public void hasDigitsTest_when_password_expect_False() {
        //GIVEN
        String password = "password";

        //WHEN
        boolean actual = Main.hasDigits(password);

        //THEN
        assertFalse(actual);
    }

    @Test
    @DisplayName("Exactly one digit")
    public void hasDigitsTest_when_passw0rd_expect_True() {
        //GIVEN
        String password = "passw0rd";

        //WHEN
        boolean actual = Main.hasDigits(password);

        //THEN
        assertTrue(actual);
    }

    @Test
    @DisplayName("digitchain")
    public void hasDigitsTest_when_p455word_expect_True() {
        //GIVEN
        String password = "p455word";

        //WHEN
        boolean actual = Main.hasDigits(password);

        //THEN
        assertTrue(actual);
    }

    @Test
    @DisplayName("separated digits")
    public void hasDigitsTest_when_p4ssw0rd_expect_True() {
        //GIVEN
        String password = "p4ssw0rd";

        //WHEN
        boolean actual = Main.hasDigits(password);

        //THEN
        assertTrue(actual);
    }

    @Test
    @DisplayName("only digits")
    public void hasDigitsTest_when_455012_expect_True() {
        //GIVEN
        String password = "455012";

        //WHEN
        boolean actual = Main.hasDigits(password);

        //THEN
        assertTrue(actual);
    }

    //uppercase and lowercase
    @Test
    @DisplayName("only lowercase")
    public void hasUppercaseAndLowercase_when_password_expect_False() {
        //GIVEN
        String password = "password";

        //WHEN
        boolean actual = Main.hasUppercaseAndLowercase(password);

        //THEN
        assertFalse(actual);
    }

    @Test
    @DisplayName("only uppercase")
    public void hasUppercaseAndLowercase_when_PASSWORD_expect_False() {
        //GIVEN
        String password = "PASSWORD";

        //WHEN
        boolean actual = Main.hasUppercaseAndLowercase(password);

        //THEN
        assertFalse(actual);
    }

    @Test
    @DisplayName("upper and lowercase")
    public void hasUppercaseAndLowercase_when_PasswoRd_expect_True() {
        //GIVEN
        String password = "PasswoRd";

        //WHEN
        boolean actual = Main.hasUppercaseAndLowercase(password);

        //THEN
        assertTrue(actual);
    }

    //being common
    @Test
    @DisplayName("Common password")
    public void isCommon_when_Password1_expect_True() {
        //GIVEN
        String password = "Password1";

        //WHEN
        boolean actual = Main.isCommon(password);

        //THEN
        assertTrue(actual);
    }
}
