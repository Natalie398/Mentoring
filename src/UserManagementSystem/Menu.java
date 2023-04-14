package UserManagementSystem;

import java.util.Scanner;

public class Menu {
    private static String login = "Print 1 to LOGIN";
    private static String exit = "Print 2 to EXIT";

    public static void greeting() {
        System.out.println("Welcome!");
        System.out.println(login);
        System.out.println(exit);
    }

    public static void makeChoice() {
        greeting();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            Login.saveData();
        } else if (choice != 2) {
            Login.incorrectValue();
            greeting();
        }
    }
}
