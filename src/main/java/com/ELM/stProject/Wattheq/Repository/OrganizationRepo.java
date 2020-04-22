package com.ELM.stProject.Wattheq.Repository;

import com.ELM.stProject.Wattheq.Model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepo extends JpaRepository<Organization, Integer> {
    Organization findByOrganizationName(String organizationName);
}
