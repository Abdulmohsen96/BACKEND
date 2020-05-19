package com.ELM.stProject.Wattheq.View;

import com.ELM.stProject.Wattheq.DTO.ObjectMapperUtils;
import com.ELM.stProject.Wattheq.DTO.OrganizationDTO;
import com.ELM.stProject.Wattheq.DTO.UserDTO;
import com.ELM.stProject.Wattheq.Model.Organization;
import com.ELM.stProject.Wattheq.Model.User;
import com.ELM.stProject.Wattheq.Repository.OrganizationRepo;
import com.ELM.stProject.Wattheq.Repository.UserRepo;
import com.ELM.stProject.Wattheq.Service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepo repo;
    @Autowired
    private OrganizationRepo organizationRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public User addUser(User user) {
        String pass = new BCryptPasswordEncoder().encode(user.getPassword());
        user.setPassword(pass);
        return repo.save(user);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = repo.findAll();
        List<UserDTO> userDTOS = ObjectMapperUtils.mapAll(users, UserDTO.class);
        return userDTOS;
    }

    @Override
    public UserDTO getUserByID(int userID) {
        User user = repo.findById(userID).get();
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        return userDTO;
    }

    @Override
    public User getUserByEmail(String email) {
        User user =  repo.findByEmail(email);
        return user;
    }

    @Override
    public User updateUser(User user, int userID) {
        user.setUserID(userID);
        return repo.save(user);
    }

    @Override
    public void deleteUser(int userID) {
        repo.deleteById(userID);
    }

    //<<------------------------------------------->>\\

    public OrganizationDTO findByOrganizationName(String organizationName) {
        Organization organization = organizationRepo.findByOrganizationName(organizationName);
        OrganizationDTO organizationDTO = modelMapper.map(organization, OrganizationDTO.class);
        return organizationDTO;
    }

    public List<OrganizationDTO> findAllOrganizations() {
        List<Organization> organizations =  organizationRepo.findAll();
        List<OrganizationDTO> organizationDTOS = ObjectMapperUtils.mapAll(organizations, OrganizationDTO.class);
        return organizationDTOS;
    }
}
