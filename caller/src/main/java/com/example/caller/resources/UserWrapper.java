package com.example.caller.resources;

import com.example.caller.Users;



import java.util.List;

public class UserWrapper {
    private List<Users> usersList;

    public UserWrapper() {
    }

    public UserWrapper(List<Users> usersList) {
        super();
        this.usersList = usersList;
    }

    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }
}
