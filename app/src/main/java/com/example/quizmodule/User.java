package com.example.quizmodule;

import java.util.ArrayList;

public class User {
   // private static int xID = 0;
    private int ID;
    private String fullname;
    private String email;
    private String username;
    private String password;

    public User() {
    }

    public User(int xID, String fullname, String email, String username, String password) {
       // xID++;
        this.ID = xID;
        this.fullname = fullname;
        this.email = email;
        this.username = username;
        this.password = password;

    }

    ArrayList<User> Users = new ArrayList<>();


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public static ArrayList<User> getUsers() {
        ArrayList<User> Users = new ArrayList<>();
        Users.add(new User(0, "Kenzo Jeanson", "kenzo.jeanson@hotmail.com", "kemzo","qwerty"));

        return Users;
    }


}