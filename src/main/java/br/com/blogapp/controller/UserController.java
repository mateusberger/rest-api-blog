package br.com.blogapp.controller;

import br.com.blogapp.dto.UserDTO;
import br.com.blogapp.model.form.RegistrationForm;
import br.com.blogapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserDTO> registerNewUser(
            @RequestBody(required = true) @Valid
            RegistrationForm form
    ){
        UserDTO dto = userService.registerNewUser(form);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> listUsers(
    ){
        List<UserDTO> users = userService.listUsers();

        return ResponseEntity.ok(users);
    }


}
