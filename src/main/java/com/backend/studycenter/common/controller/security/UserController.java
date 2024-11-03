package com.backend.studycenter.common.controller.security;

import com.backend.studycenter.common.controller.person.InterviewController;
import com.backend.studycenter.common.dto.security.UserDTO;
import com.backend.studycenter.common.exception.EntityNotFoundException;
import com.backend.studycenter.common.exception.UserNotFoundException;
import com.backend.studycenter.common.mapper.security.UserMapper;
import com.backend.studycenter.common.messaging.EmailService;
import com.backend.studycenter.common.model.person.Person;
import com.backend.studycenter.common.model.security.User;
import com.backend.studycenter.common.model.util.util;
import com.backend.studycenter.common.service.person.PersonService;
import com.backend.studycenter.common.service.security.UserService;
import com.backend.studycenter.configs.JwtGenerator;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(InterviewController.class);
    @Autowired
    private UserService userService;
    @Autowired
    private PersonService personService;
    @Autowired
    private EmailService emailService;
    @Autowired
    private JwtGenerator jwtGenerator;

    //
    @PostMapping("/api/v1/users/login")
    public ResponseEntity<?> loginUser(@RequestBody UserDTO userDTO) {
        try {
            if(userDTO.getUsername() == null || userDTO.getPassword() == null) {
                throw new UserNotFoundException("UserName or Password is Empty");
            }
            User user = userService.getUserByNameAndPassword(userDTO.getUsername(), userDTO.getPassword());
            if(user == null){
                throw new UserNotFoundException("UserName or Password is Invalid");
            }
            return new ResponseEntity<>(jwtGenerator.generateToken(userDTO), HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Issue is happened in method " + util.getMethodName(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }
    
    @GetMapping(value = "/api/v1/users")
    public ResponseEntity<ArrayList<UserDTO>> getUsers() {
        ArrayList<User> users = userService.getUsers();
        ArrayList<UserDTO> userDTOs = new ArrayList<>();
        for (User user : users) {
            userDTOs.add(UserMapper.INSTANCE.toDTO(user));
        }
        if (userDTOs.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(userDTOs);
        }
    }

    
    @GetMapping(value = "/api/v1/users/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable(name = "id") Long userId) throws EntityNotFoundException {
        UserDTO userDTO = UserMapper.INSTANCE.toDTO(userService.getUserById(userId));
        if (userDTO == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(userDTO);
        }
    }

    
    @PostMapping(value = "/api/v1/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> signupUser(@RequestBody UserDTO userDTO) {
        try {
            Person person = personService.getPersonById(userDTO.getPerson().getId());
            emailService.sendEmail(person.getEmail(), "Hello from Study-center", "This is test message");
            return ResponseEntity.ok(UserMapper.INSTANCE.toDTO(userService.addUser(userDTO)));
        } catch (Exception e) {
            logger.error("Issue is happened in method " + util.getMethodName(), e);
            return ResponseEntity.internalServerError().build();
        }
    }

    
    @PutMapping(value = "/api/v1/users/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO, @PathVariable(name = "id") Long userId) throws EntityNotFoundException {
        try {
            return ResponseEntity.ok(UserMapper.INSTANCE.toDTO(userService.updateUser(userDTO, userId)));
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            logger.error("Issue is happened in method " + util.getMethodName(), e);
            return ResponseEntity.internalServerError().build();
        }
    }

    
    @DeleteMapping(value = "/api/v1/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable(name = "id") Long userId) throws EntityNotFoundException {
        try {
            userService.deleteUser(userId);
            return ResponseEntity.ok().build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            logger.error("Issue is happened in method " + util.getMethodName(), e);
            return ResponseEntity.internalServerError().build();
        }
    }

    //TODO: impl following
    
    @PostMapping(value = "/api/v1/users/{userId}/add-role/{roleId}")
    public ResponseEntity<UserDTO> addRoleToUser(@PathVariable(name = "userId") Long userId, @PathVariable(name = "roleId") Long roleId) {
        try {
//            return ResponseEntity.ok(UserMapper.INSTANCE.toDTO(userService.addUser(userDTO)));
        } catch (Exception e) {
            logger.error("Issue is happened in method " + util.getMethodName(), e);
            return ResponseEntity.internalServerError().build();
        }
        UserDTO userDTO = new UserDTO();
        userDTO.setActive(true);
        return  ResponseEntity.ok(userDTO);
    }
}
