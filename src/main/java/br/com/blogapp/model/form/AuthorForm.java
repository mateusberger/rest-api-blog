package br.com.blogapp.model.form;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class AuthorForm {

    @NotNull
    @Min(1)
    private Long userId;

    private String authorImageURL;

    @NotNull
    @NotBlank
    private String authorName;

    private String shortBio;

    private String fullBio;

    @Valid
    private List<SocialMediaForm> socialMedias = new ArrayList<>();

    public void addSocialMedia(@Valid SocialMediaForm socialMedia){
        if (socialMedias == null){
            socialMedias = new ArrayList<>();
        }
        socialMedias.add(socialMedia);
    }

    public List<SocialMediaForm> getSocialMedias() {
        return socialMedias;
    }

    public void setSocialMedias(List<SocialMediaForm> socialMedias) {
        this.socialMedias = socialMedias;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAuthorImageURL() {
        return authorImageURL;
    }

    public void setAuthorImageURL(String authorImageURL) {
        this.authorImageURL = authorImageURL;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getShortBio() {
        return shortBio;
    }

    public void setShortBio(String shortBio) {
        this.shortBio = shortBio;
    }

    public String getFullBio() {
        return fullBio;
    }

    public void setFullBio(String fullBio) {
        this.fullBio = fullBio;
    }
}
