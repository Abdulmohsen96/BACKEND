package com.ELM.stProject.Wattheq.Controller;

import com.ELM.stProject.Wattheq.DTO.OrganizationDTO;
import com.ELM.stProject.Wattheq.DTO.UserDTO;
import com.ELM.stProject.Wattheq.Model.Authority;
import com.ELM.stProject.Wattheq.Model.Organization;
import com.ELM.stProject.Wattheq.Model.User;
import com.ELM.stProject.Wattheq.Repository.OrganizationRepo;
import com.ELM.stProject.Wattheq.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/Users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private OrganizationRepo organizationRepo;

    @GetMapping(value = "/Login")
    public ResponseEntity login(Principal principal){
        Map<String,String> map = new HashMap<>();
        User user = userService.getUserByEmail(principal.getName());
        map.put("userID", String.valueOf(userService.getUserByEmail(principal.getName()).getUserID()));
        map.put("role", String.valueOf(user.getAuthorityName().getAuthorityName()));
        if(user.getAuthorityName().getAuthorityName().equals("ROLE_ORGANIZATION"))
            map.put("organizationID", String.valueOf(user.getUserOrganization().getOrganizationID()));
        return ResponseEntity.ok(map);
    }

    @RequestMapping(value = "/AddUser", method = RequestMethod.POST)
    public User addUser(@Valid @RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping(value = "/GetAllUsers")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/GetAllUsers/{userID}")
    public UserDTO getUserByID(@PathVariable("userID") int userID) {
        return userService.getUserByID(userID);
    }

    @GetMapping(value = "/GetUserByEmail/{email}")
    public User getUserByEmail(@PathVariable("email") String email) {
        return userService.getUserByEmail(email);
    }

    @PutMapping(value = "/UpdateUser/{userID}")
    public User updateUser(@RequestBody User user, @PathVariable("userID") int userID) {
        return userService.updateUser(user, userID);
    }

    @DeleteMapping(value = "/DeleteUser/{userID}")
    public void deleteUser(@PathVariable("userID") int userID) {
        userService.deleteUser(userID);
    }

    //<<------------------------------------------->>\\

    @RequestMapping(value = "/AddOrganization", method = RequestMethod.POST)
    public void AddOrganization(@RequestBody Organization organization) {
        organizationRepo.save(organization);
    }

    @GetMapping(value = "/GetOrganization/{organizationName}")
    public OrganizationDTO findByOrganizationName(@PathVariable("organizationName") String organizationName) {
        return userService.findByOrganizationName(organizationName);
    }

    @GetMapping(value = "/GetAllOrganizations")
    public List<OrganizationDTO> findAllOrganizations() {
        return userService.findAllOrganizations();
    }
}