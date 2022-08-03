package br.com.blogapp.repository;

import br.com.blogapp.model.persistable.Author;
import br.com.blogapp.model.persistable.Post;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends PagingAndSortingRepository<Post, Long> {

    public List<Post> findByTitleLike(String name);

    public List<Post> findByAuthor(Author author);

}
