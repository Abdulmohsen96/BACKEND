package com.ELM.stProject.Wattheq.Repository;

import com.ELM.stProject.Wattheq.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    List<User> findAll();
    User findByEmail(String email);
}
