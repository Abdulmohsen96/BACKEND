package com.ELM.stProject.Wattheq.Repository;

import com.ELM.stProject.Wattheq.DTO.CertificateDTO;
import com.ELM.stProject.Wattheq.Model.Certificate;
import org.hibernate.annotations.SQLUpdate;
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

    @Query(value = "SELECT * FROM CERTIFICATES c WHERE c.ORGANIZATIONID = ?1", nativeQuery = true)
    List<Certificate> findCertificatesByOrganizationID(Integer organizationID);

    @Query(value = "SELECT * FROM CERTIFICATES c WHERE c.CERTIFICATEID = ?1 AND c.USERID = ?2", nativeQuery = true)
    Certificate findCertificateByUserID(int certificateID, int userID);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Certificates c set c.CERTIFICATE_DESCRIPTION = :CERTIFICATE_DESCRIPTION, c.CERTIFICATE_DATE = :CERTIFICATE_DATE, c.USERID = :userID, c.ORGANIZATIONID = :organizationID where c.CERTIFICATEID = :certificateID", nativeQuery = true)
    void updateFile(String CERTIFICATE_DESCRIPTION, String CERTIFICATE_DATE, Integer userID, Integer organizationID, Integer certificateID);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Certificates c WHERE c.certificateID = ?1", nativeQuery = true)
    void deleteCertificateByCertificateID(Integer certificateID);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Certificates c set c.CERTIFICATE_DESCRIPTION = :CERTIFICATE_DESCRIPTION, c.CERTIFICATE_DATE = :CERTIFICATE_DATE, c.CERTIFICATE_NAME = :CERTIFICATE_NAME where c.CERTIFICATEID = :certificateID", nativeQuery = true)
    void updateCertificate(String CERTIFICATE_DESCRIPTION, String CERTIFICATE_DATE, String CERTIFICATE_NAME, Integer certificateID);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Certificates c set c.CERTIFICATE_STATUS = :CERTIFICATE_STATUS where c.CERTIFICATEID = :certificateID AND c.ORGANIZATIONID = :organizationID", nativeQuery = true)
    void updateStatus(String CERTIFICATE_STATUS, Integer certificateID, Integer organizationID);
}
