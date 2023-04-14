package UserManagementSystem;

public interface DataValidation {
    static boolean isAlpha(String s) {
        if (s.matches("^[a-zA-Z]*$") && (s != null) && (s != "")) {
            return true;
        } else {
            Login.incorrectValue();
            return false;
        }
    }

    static boolean isCorrectPassword(String s) {
        if (s.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9@#$%]).{8,}")) {
            return true;
        } else {
            Login.incorrectValue();
            return false;
        }
    }

    static boolean isCorrectLogin(String s) {
        if (s.matches("^[a-zA-Z0-9]*$")) {
            return true;
        } else {
            Login.incorrectValue();
            return false;
        }
    }
}
