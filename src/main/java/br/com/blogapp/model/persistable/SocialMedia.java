package br.com.blogapp.model.persistable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class SocialMedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Author author;

    @NotNull
    @NotBlank
    @Column(length = 50)
    private String socialMediaName;

    @NotNull
    @NotBlank
    @Column(length = 512)
    private String url;

}
