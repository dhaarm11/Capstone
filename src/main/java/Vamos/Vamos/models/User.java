package Vamos.Vamos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;

    private String username;

    private String firstname;

    private String lastname;

    private String email;

    private String password;

    public void setUsername(String username) {
        this.username = username;
    }
}


