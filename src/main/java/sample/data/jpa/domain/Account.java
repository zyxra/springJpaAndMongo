package sample.data.jpa.domain;
//import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//import javax.persistence.Entity;

//enum Roles  {USER, ADMIN, GUEST};
//public List<String>  al  =  new List<String>();

public class Account {

    @Id
    @GeneratedValue
    private String id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    @ManyToMany
    private List<String> roles;

    public Account(){}

    public Account(String username, String password, List<String> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
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

    public String getRoles() {
        //List<String> roles = Arrays.asList("ADMIN","USER");
        String myRole = "";
        Iterator<String> i = roles.iterator();
        while (i.hasNext()){
            myRole = myRole + "RULE_" + i.next();
            if (i.hasNext()){
                myRole = myRole + ", ";
            }
        }
        return myRole;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}