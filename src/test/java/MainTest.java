import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

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
    public void hasEightCharactersTest_when___expect_True() {
        //GIVEN
        String password = "";

        //WHEN
        boolean actual = Main.hasEightCharacters(password);

        //THEN
        assertFalse(actual);
    }
}
