package com.trippy.back.entities;

import javax.persistence.Entity;

@Entity
public class Admin extends Account {
    int role = 1; //admin users have a role of one

    public int getRole() {
        return role;
    }
}
