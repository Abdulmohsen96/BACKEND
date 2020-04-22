package com.ELM.stProject.Wattheq.DTO;

public class OrganizationDTO {

    private String organizationName;
    private String organizationAddress;
    private String organizationContactNumber;

    public OrganizationDTO() {

    }
    public OrganizationDTO(String organizationName, String organizationAddress, String organizationContactNumber) {
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
        this.organizationContactNumber = organizationContactNumber;
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
