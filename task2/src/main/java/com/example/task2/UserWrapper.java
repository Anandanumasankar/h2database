package com.example.task2;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class UserWrapper {
    private ArrayList<Users> usersList;

    public UserWrapper() {
    }

    public UserWrapper(ArrayList<Users> usersList) {
        super();
        this.usersList = usersList;
    }

    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(ArrayList<Users> usersList) {
        this.usersList = usersList;
    }
}