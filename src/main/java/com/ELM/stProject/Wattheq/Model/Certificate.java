package com.ELM.stProject.Wattheq.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Certificates")
@Table
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CertificateID")
    private int certificateID;
    @Column(name = "CertificateName")
    private String certificateName;
    @Column(name = "CertificateType")
    private String certificateType;
    @Column(name = "CertificateDescription")
    private String certificateDescription;
    @Column(name = "CertificateDate")
    private String certificateDate;
    @Column(name = "CertificateStatus")
    private String certificateStatus;
    @Column(name = "CertificateDocument")
    @Lob
    private byte[] certificateDocument;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserID")
    private User userCertificates;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OrganizationID")
    private Organization certificateOrganization;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "certificates_shareds",
            joinColumns = {@JoinColumn(name = "CertificateID")},
            inverseJoinColumns = {@JoinColumn(name = "SharedID")}
            )
    private Set<Shared> shareds = new HashSet<Shared>();

    public Certificate() {}

    public Certificate(String certificateName, String certificateType, byte[] certificateDocument, String certificateStatus) {
        this.certificateName = certificateName;
        this.certificateType = certificateType;
        this.certificateDocument = certificateDocument;
        this.certificateStatus = certificateStatus;
    }

    public int getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(int certificateID) {
        this.certificateID = certificateID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateDescription() {
        return certificateDescription;
    }

    public void setCertificateDescription(String certificateDescription) {
        this.certificateDescription = certificateDescription;
    }

    public String getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(String certificateDate) {
        this.certificateDate = certificateDate;
    }

    public String getCertificateStatus() {
        return certificateStatus;
    }

    public void setCertificateStatus(String certificateStatus) {
        this.certificateStatus = certificateStatus;
    }

    public byte[] getCertificateDocument() {
        return certificateDocument;
    }

    public void setCertificateDocument(byte[] certificateDocument) {
        this.certificateDocument = certificateDocument;
    }

    public User getUserCertificates() {
        return userCertificates;
    }

    public void setUserCertificates(User userCertificates) {
        this.userCertificates = userCertificates;
    }

    public Organization getCertificateOrganization() {
        return certificateOrganization;
    }

    public void setCertificateOrganization(Organization certificateOrganization) {
        this.certificateOrganization = certificateOrganization;
    }

    public Set<Shared> getShareds() {
        return shareds;
    }

    public void setShareds(Set<Shared> shareds) {
        this.shareds = shareds;
    }
}
