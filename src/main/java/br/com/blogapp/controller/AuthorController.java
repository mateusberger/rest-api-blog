package br.com.blogapp.controller;

import br.com.blogapp.dto.AuthorDTO;
import br.com.blogapp.model.form.AuthorForm;
import br.com.blogapp.service.AuthorService;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/author")
public class AuthorController {

    private AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public ResponseEntity<AuthorDTO> registerAuthor(
            @RequestBody @Valid
            AuthorForm form
    ){
        throw new NotYetImplementedException("Being implemented");
    }

}
