package br.com.blogapp.model.persistable;

import br.com.blogapp.model.constant.Role;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "blog_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Column(length = 255)
    private String name;

    @NotNull
    @NotBlank
    @Email
    @Column(unique = true, length = 150)
    private String email;

    @NotBlank
    @NotNull
    @Column(columnDefinition = "TEXT")
    private String password;

    private boolean enable;

    private boolean blocked;

    private LocalDate passwordExpiration;

    private LocalDate accountExpiration;

    private LocalDate creation;

    @Enumerated(EnumType.STRING)
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public LocalDate getPasswordExpiration() {
        return passwordExpiration;
    }

    public void setPasswordExpiration(LocalDate passwordExpiration) {
        this.passwordExpiration = passwordExpiration;
    }

    public LocalDate getAccountExpiration() {
        return accountExpiration;
    }

    public void setAccountExpiration(LocalDate accountExpiration) {
        this.accountExpiration = accountExpiration;
    }

    public LocalDate getCreation() {
        return creation;
    }

    public void setCreation(LocalDate creation) {
        this.creation = creation;
    }
}
