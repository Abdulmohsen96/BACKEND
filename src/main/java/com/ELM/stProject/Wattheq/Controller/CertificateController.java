package com.ELM.stProject.Wattheq.Controller;

import com.ELM.stProject.Wattheq.DTO.CertificateDTO;
import com.ELM.stProject.Wattheq.Model.Certificate;
import com.ELM.stProject.Wattheq.Service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@RestController
@RequestMapping(value = "/Certificates")
@CrossOrigin("http://localhost:4200")
public class CertificateController {

    @Autowired
    private CertificateService certificateService;

    @PostMapping(value = "/AddCertificate")
    public Certificate addCertificate(@RequestBody Certificate certificate) {
        return certificateService.addCertificate(certificate);
    }

    @GetMapping(value = "/GetAllCertificates")
    public List<CertificateDTO> getAllCertificates() {
        return certificateService.getAllCertificates();
    }

    @GetMapping(value = "/GetCertificate/{certificateID}/{userID}")
    public CertificateDTO getCertificate(@PathVariable("certificateID") int certificateID, @PathVariable("userID") int userID) {
        return certificateService.getCertificate(certificateID, userID);
    }

    @PutMapping(value = "/UpdateCertificate/{certificateID}")
    public void updateCertificate(@RequestBody Certificate certificate, @PathVariable("certificateID") int certificateID) {
        certificateService.updateCertificate(certificate, certificateID);
    }

    @RequestMapping(value = "/DeleteCertificate/{certificateID}", method = RequestMethod.DELETE)
    public void deleteCertificate(@PathVariable("certificateID") int certificateID) {
        certificateService.deleteCertificate(certificateID);
    }

    @PostMapping("/UploadCertificate")
    public Certificate uploadCertificate(@RequestParam("file") MultipartFile file) {
        return certificateService.uploadCertificate(file);
    }

    @GetMapping(value = "/GetAllCertificates/{userID}")
    public List<CertificateDTO> getAllCertificatesByUserID(@PathVariable("userID") Integer userID) {
        return certificateService.getAllCertificatesByUserID(userID);
    }

    @GetMapping(value = "/GetAllCertificatesForOrg/{organizationID}")
    public List<CertificateDTO> getAllCertificatesByOrganizationID(@PathVariable("organizationID") Integer organizationID) {
        return certificateService.getAllCertificatesByOrganizationID(organizationID);
    }

    @PutMapping(value = "/UpdateFile/{userID}/{organizationID}")
    public void updateFile(@RequestBody Certificate certificate, @PathVariable("userID") Integer userID, @PathVariable("organizationID") Integer organizationID) {
        this.certificateService.updateFile(certificate, userID, organizationID);
    }

    @PutMapping(value = "/UpdateStatus/{organizationID}/{certificateStatus}")
    public void updateStatus(@RequestBody Certificate certificate, @PathVariable("organizationID") Integer organizationID, @PathVariable("certificateStatus") String certificateStatus) {
        this.certificateService.updateStatus(certificate, certificateStatus, organizationID);
    }
}