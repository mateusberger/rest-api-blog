package br.com.blogapp.model.form;

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
