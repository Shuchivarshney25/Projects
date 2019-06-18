package com.helloworld;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;


public class HelloWorld extends Configuration {
    @NotEmpty
    private String template;
    @NotEmpty
    private String defaultname;

    @JsonProperty
    public String getTemplate() {
        return template;
    }

    @JsonProperty
    public String getDefaultname() {
        return defaultname;
    }

    @JsonProperty
    public String settemplate() {
        return this.template = template;
    }

    @JsonProperty
    public String setdefaultname() {
        return this.defaultname = defaultname;
    }

}
