package com.example.dawhey.user.payload.request;

import java.util.Date;
import java.util.Set;

public class SignupRequest {
    private String userName;
    private String password;
    private String email;
    private String phone;
    private String created;
    private boolean userStatus;
    private Set<String> listRoles;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public boolean isUserStatus() {
        return userStatus;
    }

    public void setUserStatus(boolean userStatus) {
        this.userStatus = userStatus;
    }

    public Set<String> getListRoles() {
        return listRoles;
    }

    public void setListRoles(Set<String> listRoles) {
        this.listRoles = listRoles;
    }
}
