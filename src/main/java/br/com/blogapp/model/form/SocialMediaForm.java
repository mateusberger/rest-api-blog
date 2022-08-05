package br.com.blogapp.model.form;

import br.com.blogapp.model.persistable.Author;
import br.com.blogapp.model.persistable.SocialMedia;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class SocialMediaForm {

    @NotNull
    @NotBlank
    @Pattern(regexp = "[aA-zZ]+")
    private String name;

    @NotNull
    @NotBlank
    private String URL;

    public SocialMedia toSocialMedia(){
        SocialMedia socialMedia = new SocialMedia();
        socialMedia.setSocialMediaName(name);
        socialMedia.setUrl(URL);
        return socialMedia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
