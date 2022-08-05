package br.com.blogapp.service;

import br.com.blogapp.dto.AuthorDTO;
import br.com.blogapp.model.form.AuthorForm;
import br.com.blogapp.model.persistable.Author;
import br.com.blogapp.repository.AuthorRepository;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public AuthorDTO createNewAuthor(AuthorForm form){

        Author author = form.toAuthor();
        //@TODO finish
        throw new NotYetImplementedException("Being implemented");
    }

}
