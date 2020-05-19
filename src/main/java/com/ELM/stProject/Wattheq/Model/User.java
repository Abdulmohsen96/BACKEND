package com.ELM.stProject.Wattheq.Model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UserID")
    private int userID;

    @NotBlank
    @NotNull
    @Size(min = 5)
    @Column(name = "FullName")
    private String fullName;

    @NotNull
    @Column(name = "DateOfBirth")
    private String dob;

    @NotBlank
    @NotNull
    @Size(min = 10, max = 10)
    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @Email
    @NotBlank
    @NotNull
    @Size(min = 5)
    @Column(name = "Email")
    private String email;

    @NotBlank
    @NotNull
    @Size(min = 8)
    @Column(name = "Password")
    private String password;

    @NotBlank
    @NotNull
    @Size(min = 10, max = 10)
    @Column(name = "NationalID")
    private String nationalID;

    @Column(name = "Enabled")
    private boolean enabled = true;

    @OneToMany(mappedBy = "userCertificates", cascade = CascadeType.ALL)
    private List<Certificate> certificates = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "OrganizationID")
    private Organization userOrganization;

    @OneToMany(mappedBy = "userShareds", cascade = CascadeType.ALL)
    private List<Shared> shareds = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "authorityName", referencedColumnName = "authorityName")
    private Authority authorityName;


    public User() {}

    public User(int userID, String fullName, String dob, String phoneNumber, String email, String password, String nationalID, boolean enabled) {
        this.userID = userID;
        this.fullName = fullName;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.nationalID = nationalID;
        this.enabled = enabled;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public Organization getUserOrganization() {
        return userOrganization;
    }

    public void setUserOrganization(Organization userOrganization) {
        this.userOrganization = userOrganization;
    }

    public List<Shared> getShareds() {
        return shareds;
    }

    public void setShareds(List<Shared> shareds) {
        this.shareds = shareds;
    }

    public Authority getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(Authority authorityName) {
        this.authorityName = authorityName;
    }
}
