package br.com.blogapp.service;

import br.com.blogapp.dto.UserDTO;
import br.com.blogapp.model.constant.Role;
import br.com.blogapp.model.form.RegistrationForm;
import br.com.blogapp.model.persistable.User;
import br.com.blogapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO registerNewUser(@Valid RegistrationForm form) {
        User user = form.toUser();

        user.setCreation(LocalDate.now());
        user.setEnable(false);
        user.setBlocked(false);
        user.setAccountExpiration(LocalDate.now().plusYears(1));
        user.setPasswordExpiration(LocalDate.now().plusYears(1));

        //encode password using passwordencoder interface from spring security

        user.setRole(Role.NEW_USER);

        User saved = userRepository.save(user);

        //send event of user creation

        return new UserDTO(saved);
    }

    public List<UserDTO> listUsers() {
        List<User> all = userRepository.findAll();
        List<UserDTO> dtos = new ArrayList<>();
        all.forEach((user) -> dtos.add(new UserDTO(user)));
        return dtos;
    }
}
