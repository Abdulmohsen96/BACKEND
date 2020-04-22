package com.ELM.stProject.Wattheq.Repository;

import com.ELM.stProject.Wattheq.DTO.CertificateDTO;
import com.ELM.stProject.Wattheq.Model.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CertificateRepo extends JpaRepository<Certificate, Integer> {

    @Query(value = "SELECT * FROM CERTIFICATES c WHERE c.USERID = ?1", nativeQuery = true)
    List<Certificate> findCertificatesByUserID(Integer userID);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Certificates c set c.CERTIFICATE_DESCRIPTION = :CERTIFICATE_DESCRIPTION, c.CERTIFICATE_DATE = :CERTIFICATE_DATE, c.USERID = :userID where c.CERTIFICATEID = :certificateID", nativeQuery = true)
    void updateFile(String CERTIFICATE_DESCRIPTION, String CERTIFICATE_DATE, Integer userID, Integer certificateID);
}