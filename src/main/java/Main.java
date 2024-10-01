import java.util.Objects;

public class Main {
    static String[] commonPasswords = {"123456", "123456789", "admin", "Qwerty", "welcome", "Password", "Password1", "p@ssw0rd", "12345", "Qwerty123", "1q2w3e", "12345678", "111111", "1234567890", "Q2w3e4r5t"};

    public static boolean hasEightCharacters(String password) {
        return password.length() > 7;
    }

    public static boolean hasDigits(String password) {
        return password.matches(".*[0-9].*");
    }

    public static boolean hasUppercaseAndLowercase(String password) {
        return password.matches(".*[A-Z].*") && password.matches(".*[a-z].*");
    }

    public static boolean isCommon(String password) {
        for (String word : commonPasswords) {
            if (word.equals(password)) {
                return true;
            }
        }
        return false;
    }
}