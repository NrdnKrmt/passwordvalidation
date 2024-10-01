import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
   public void hasEightCharactersTest_when_password_expect_True() {
        //GIVEN
        String password = "password";

        //WHEN
        boolean actual = Main.hasEightCharacters(password);

        //THEN
        assertTrue(actual);
    }
}
