package br.com.blogapp.model.persistable;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 512)
    private String title;

    @Column(length = 512)
    private String subtitle;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(length = 1024)
    private String contentReferences;

    @Column(length = 512)
    private String coverImageURL;

    private LocalDateTime creation;

    private LocalDateTime lastUpdate;

    @ManyToOne
    private Author author;

    private boolean visible;

    private int likes;

    private int views;

}
