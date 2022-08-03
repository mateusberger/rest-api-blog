package br.com.blogapp.repository;

import br.com.blogapp.model.persistable.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
