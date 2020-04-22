package com.ELM.stProject.Wattheq.Model;

import javax.persistence.*;

@Entity(name = "Authority")
@Table
public class Authority {

    @Column(name = "AuthorityID")
    private int authorityID;

    @Id
    @Column(name = "AuthorityName")
    private String authorityName;

    public Authority() {}

    public Authority(int authorityID, String authorityName) {
        this.authorityID = authorityID;
        this.authorityName = authorityName;
    }

    public int getAuthorityID() {
        return authorityID;
    }

    public void setAuthorityID(int authorityID) {
        this.authorityID = authorityID;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }
}
