package com.ELM.stProject.Wattheq.View;

import com.ELM.stProject.Wattheq.DTO.CertificateDTO;
import com.ELM.stProject.Wattheq.DTO.ObjectMapperUtils;
import com.ELM.stProject.Wattheq.Model.Certificate;
import com.ELM.stProject.Wattheq.Repository.CertificateRepo;
import com.ELM.stProject.Wattheq.Service.CertificateService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;

@Service
public class CertificateServiceImplementation implements CertificateService {

    @Autowired
    private CertificateRepo repo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Certificate addCertificate(Certificate certificate) {
        return repo.save(certificate);
    }

    @Override
    public List<CertificateDTO> getAllCertificates() {
        List<Certificate> certificates = repo.findAll();
        List<CertificateDTO> certificateDTOS = ObjectMapperUtils.mapAll(certificates, CertificateDTO.class);
        return certificateDTOS;
    }

    @Override
    public CertificateDTO getCertificate(int certificateID, int userID) {
        Certificate certificate = repo.findCertificateByUserID(certificateID, userID);
        CertificateDTO certificateDTO = modelMapper.map(certificate, CertificateDTO.class);
        return certificateDTO;
    }

    @Override
    public void updateCertificate(Certificate certificate, int certificateID) {
        repo.updateCertificate(certificate.getCertificateDescription(), certificate.getCertificateDate(), certificate.getCertificateName(), certificateID);
    }

    @Override
    public void deleteCertificate(int certificateID) {
        repo.deleteCertificateByCertificateID(certificateID);
    }

    @Override
    public Certificate uploadCertificate(MultipartFile file) {
        try {
            String fileName = StringUtils.cleanPath(file.getOriginalFilename());
            Certificate certificate = new Certificate(fileName, file.getContentType(), file.getBytes(), "Pending");
            return repo.save(certificate);
        }
        catch(IOException e) {
            return null;
        }
    }

    public List<CertificateDTO> getAllCertificatesByUserID(Integer userID) {
        List<Certificate> certificates = repo.findCertificatesByUserID(userID);
        List<CertificateDTO> certificateDTOS = ObjectMapperUtils.mapAll(certificates, CertificateDTO.class);
        return certificateDTOS;
    }

    @Override
    public void updateFile(Certificate certificate, Integer userID) {
        this.repo.updateFile(certificate.getCertificateDescription(), certificate.getCertificateDate(), userID, certificate.getCertificateID());
    }
}
