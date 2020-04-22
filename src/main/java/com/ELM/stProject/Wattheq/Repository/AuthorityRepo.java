package com.ELM.stProject.Wattheq.Repository;

import com.ELM.stProject.Wattheq.Model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepo extends JpaRepository<Authority, Integer> {
}
