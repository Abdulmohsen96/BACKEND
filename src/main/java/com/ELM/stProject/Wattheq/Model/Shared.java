package com.ELM.stProject.Wattheq.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "Shared")
@Table
public class Shared {

    @Id
    @Column(name = "SharedID")
    private int sharedID;
    @Column(name = "SharedDate")
    private String sharedDate;
    @Column(name = "SharedUrl")
    private String sharedUrl;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserID")
    private User userShareds;

    @ManyToMany(mappedBy = "shareds", cascade = {CascadeType.ALL})
    private Set<Certificate> certificates = new HashSet<Certificate>();

    public Shared() {}

    public Shared(int sharedID, String sharedDate, String sharedUrl) {
        this.sharedID = sharedID;
        this.sharedDate = sharedDate;
        this.sharedUrl = sharedUrl;
    }

    public int getSharedID() {
        return sharedID;
    }

    public void setSharedID(int sharedID) {
        this.sharedID = sharedID;
    }

    public String getSharedDate() {
        return sharedDate;
    }

    public void setSharedDate(String sharedDate) {
        this.sharedDate = sharedDate;
    }

    public String getSharedUrl() {
        return sharedUrl;
    }

    public void setSharedUrl(String sharedUrl) {
        this.sharedUrl = sharedUrl;
    }

    public User getUserShareds() {
        return userShareds;
    }

    public void setUserShareds(User userShareds) {
        this.userShareds = userShareds;
    }

    public Set<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(Set<Certificate> certificates) {
        this.certificates = certificates;
    }
}
