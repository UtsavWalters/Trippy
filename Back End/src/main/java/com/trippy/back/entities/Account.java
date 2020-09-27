package com.trippy.back.entities;

import javax.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    String email;

    @Column
    String password;

    @Column
    String token;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setToken(String token){
        this.token = token;
    }
    public String getToken(){
        return token;
    }

    public Account() {

    }
    public Account(String email, String password){
        setEmail(email);
        setPassword(password);
    }
}
