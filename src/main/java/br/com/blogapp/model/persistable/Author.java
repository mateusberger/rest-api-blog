package br.com.blogapp.model.persistable;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    private List<SocialMedia> socialMedias;

    @Column(length = 255)
    private String name;

    @Column(length = 512)
    private String shortBio;

    @Column(columnDefinition = "TEXT")
    private String fullBio;

    @Column(length = 512)
    private String authorImageURL;

}
