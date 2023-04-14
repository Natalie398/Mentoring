package UserManagementSystem;

import java.util.ArrayList;

public class User implements DataValidation {
    private String firstName;
    private String lastName;
    private String login;
    private String password;


    public User(String firstName, String lastName, String login, String password) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setLogin(login);
        this.setPassword(password);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (DataValidation.isAlpha(firstName)) {
            this.firstName = firstName;
        } else Login.incorrectValue();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (DataValidation.isAlpha(lastName)) {
            this.lastName = lastName;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (DataValidation.isCorrectLogin(login)) {
            this.login = login;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (DataValidation.isCorrectPassword(password)) {
            this.password = password;
        }
    }
}
