public class Main {
    public static boolean hasEightCharacters(String password) {
        return password.length() > 7;
    }

    public static boolean hasDigits(String password) {
        return password.matches(".*[0-9].*");
    }

    public static boolean hasUppercaseAndLowercase(String password) {
        return password.matches(".*[A-Z].*") && password.matches(".*[a-z].*");
    }
}