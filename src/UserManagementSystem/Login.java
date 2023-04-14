package UserManagementSystem;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Login {
    public static final String FIRST_NAME = "Enter your first name: ";
    public static final String LAST_NAME = "Enter your last name: ";
    public static final String LOGIN = "Enter your login (must contain only english letters and arabic numerals): ";
    public static final String PASSWORD = "Create a password of at least 8 characters (must contain uppercase and lowercase english letters, arabic numerals and symbols @#$%): ";


    public static void saveData() {
        String fName = "";
        String lName = "";
        String log = "";
        String pass = "";

        do {
            fName = getDataFromUser(FIRST_NAME);
        } while (!DataValidation.isAlpha(fName));

        do {
            lName = getDataFromUser(LAST_NAME);
        } while (!DataValidation.isAlpha(lName));
        do {
            log = getDataFromUser(LOGIN);
          /*  for (int i = 0; i < Storage.storage.size(); i++) {
                if (Storage.storage.get(i).getLogin()==log){
                    System.out.println("This login already exists");
                    break;
                }
            }*/
        } while (!DataValidation.isCorrectLogin(log));
        do {
            pass = getDataFromUser(PASSWORD);
        } while (!DataValidation.isCorrectPassword(pass));

        User user = new User(fName, lName, log, pass);
        Storage.storage.add(user);
    }

    public static String getDataFromUser(String s) {
        System.out.println(s);
        Scanner scanner = new Scanner(System.in);
        String dataFromUser = scanner.nextLine();
        return dataFromUser;
    }

    public static void incorrectValue() {
        System.out.println("Incorrect value\n");
    }
}
