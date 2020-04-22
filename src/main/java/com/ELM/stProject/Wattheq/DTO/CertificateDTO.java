package com.ELM.stProject.Wattheq.DTO;

public class CertificateDTO {

    private String certificateName;
    private String certificateType;
    private String certificateDescription;
    private String certificateDate;
    private String certificateStatus;

    public CertificateDTO() {

    }
    public CertificateDTO(String certificateName, String certificateType, String certificateDescription, String certificateDate, String certificateStatus) {
        this.certificateName = certificateName;
        this.certificateType = certificateType;
        this.certificateDescription = certificateDescription;
        this.certificateDate = certificateDate;
        this.certificateStatus = certificateStatus;
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
}
