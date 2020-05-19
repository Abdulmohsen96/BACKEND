package com.ELM.stProject.Wattheq.DTO;

public class OrganizationDTO {

    private int organizationID;
    private String organizationName;
    private String organizationAddress;
    private String organizationContactNumber;

    public OrganizationDTO() {

    }
    public OrganizationDTO(int organizationID, String organizationName, String organizationAddress, String organizationContactNumber) {
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
}
