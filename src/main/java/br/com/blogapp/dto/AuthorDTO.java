package br.com.blogapp.dto;

import java.util.ArrayList;
import java.util.List;

public class AuthorDTO {

    private Long id;

    private String imageURL;

    private String name;

    private String ShortBio;

    private String FullBio;

    private List<SocialMediaDTO> socialMedias = new ArrayList<>();



    public void addSocialMedia(SocialMediaDTO socialMedia){
        if (socialMedias == null){
            socialMedias = new ArrayList<>();
        }
        socialMedias.add(socialMedia);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortBio() {
        return ShortBio;
    }

    public void setShortBio(String shortBio) {
        ShortBio = shortBio;
    }

    public String getFullBio() {
        return FullBio;
    }

    public void setFullBio(String fullBio) {
        FullBio = fullBio;
    }

    public List<SocialMediaDTO> getSocialMedias() {
        return socialMedias;
    }

    public void setSocialMedias(List<SocialMediaDTO> socialMedias) {
        this.socialMedias = socialMedias;
    }
}
