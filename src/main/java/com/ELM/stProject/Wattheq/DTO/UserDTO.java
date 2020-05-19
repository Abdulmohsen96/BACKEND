package com.ELM.stProject.Wattheq.DTO;

import com.ELM.stProject.Wattheq.Model.Authority;

public class UserDTO {

    private int userID;
    private String fullName;
    private String dob;
    private String phoneNumber;
    private String email;
    private Authority authorityName;

    public UserDTO() {
    }
    public UserDTO(int userID, String fullName, String dob, String phoneNumber, String email, Authority authorityName) {
        this.userID = userID;
        this.fullName = fullName;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.authorityName = authorityName;
    }

    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Authority getAuthorityName() {
        return authorityName;
    }
    public void setAuthorityName(Authority authorityName) {
        this.authorityName = authorityName;
    }
}
