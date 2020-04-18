package com.example.quizmodule;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class accountUsers {
    @PrimaryKey
    @NonNull
    public String username;
    public String fullName;
    public String email;
    public String password;

    public accountUsers() {

    }

    public accountUsers(String username, String fullName, String email, String password) {
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

}
