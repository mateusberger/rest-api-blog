package br.com.blogapp.repository;

import br.com.blogapp.model.persistable.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    public Optional<Author> findByName(String name);

}
