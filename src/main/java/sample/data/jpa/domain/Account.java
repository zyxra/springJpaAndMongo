package sample.data.jpa.domain;
//import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.Entity;


public class Account {

    @Id
    @GeneratedValue
    private String id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;


    public Account(){}

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "sample.data.jpa.domain.Account(username=" + this.username + ", password=" + this.password + ")";
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}