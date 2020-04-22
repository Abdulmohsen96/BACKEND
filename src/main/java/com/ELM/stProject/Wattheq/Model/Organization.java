package com.ELM.stProject.Wattheq.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Organizations")
@Table
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OrganizationID")
    private int organizationID;
    @Column(name = "OrganizationName")
    private String organizationName;
    @Column(name = "OrganizationAddress")
    private String organizationAddress;
    @Column(name = "OrganizationContactNumber")
    private String organizationContactNumber;

    @OneToMany(mappedBy = "certificateOrganization", cascade = CascadeType.ALL)
    private List<Certificate> certificates = new ArrayList<>();

    @OneToMany(mappedBy = "userOrganization", cascade = CascadeType.ALL)
    private List<User> users = new ArrayList<>();

    public Organization() {}

    public Organization(int organizationID, String organizationName, String organizationAddress, String organizationContactNumber) {
        this.organizationID = organizationID;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
        this.organizationContactNumber = organizationContactNumber;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }

    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
    }

    public String getOrganizationContactNumber() {
        return organizationContactNumber;
    }

    public void setOrganizationContactNumber(String organizationContactNumber) {
        this.organizationContactNumber = organizationContactNumber;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
