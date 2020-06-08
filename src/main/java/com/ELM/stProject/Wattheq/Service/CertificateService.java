package com.ELM.stProject.Wattheq.Service;

import com.ELM.stProject.Wattheq.DTO.CertificateDTO;
import com.ELM.stProject.Wattheq.Model.Certificate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CertificateService {

    public Certificate addCertificate(Certificate certificate);
    public List<CertificateDTO> getAllCertificates();
    public CertificateDTO getCertificate(int certificateID, int userID);
    public void updateCertificate(Certificate certificate, int certificateID);
    public void deleteCertificate (int certificateID);

    public Certificate uploadCertificate(MultipartFile file);
    public List<CertificateDTO> getAllCertificatesByUserID(Integer userID);
    public void updateFile(Certificate certificate, Integer userID, Integer organizationID);
}