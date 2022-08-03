package br.com.blogapp.repository;

import br.com.blogapp.model.persistable.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SocialMediaRepository extends JpaRepository<SocialMedia, Long> {
}
