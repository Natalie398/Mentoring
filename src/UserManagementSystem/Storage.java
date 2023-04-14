package UserManagementSystem;

import java.util.ArrayList;

public class Storage {
    public static ArrayList<User> storage = new ArrayList<>();

    public static void showUsers() {
        for (int i = 0; i < storage.size(); i++) {
            int number = i + 1;
            System.out.println(number + ": ");
            System.out.println("First name: " + storage.get(i).getFirstName());
            System.out.println("Last name: " + storage.get(i).getLastName());
            System.out.println("Login: " + storage.get(i).getLogin());
        }
    }

}
