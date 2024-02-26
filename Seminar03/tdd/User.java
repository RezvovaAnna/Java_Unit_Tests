package Seminar03.tdd;

import java.util.Objects;

public class User {
    String name;
    String password;
    Boolean isAdmin;
    Boolean isAuthenticate = false;

    public User(String name, String password, Boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;

    }

    //ДЗ 3.3
    public void authenticate(String inputUsername, String inputPassword) {
        if (inputUsername.equals(this.name) && inputPassword.equals(this.password)) {
            this.isAuthenticate = true;
        }
        else {
            this.isAuthenticate = false;
        }
    }

    public void setAuthenticate(boolean inputAuthenticate) {
        this.isAuthenticate = inputAuthenticate;

    }
}
