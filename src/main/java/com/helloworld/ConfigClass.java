package com.helloworld;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.db.DataSourceFactory;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


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

    //db-connectivity
    @NotNull
    @Valid
    private DataSourceFactory dataSourceFactory = new DataSourceFactory();


    @JsonProperty("mongodb")
    public DataSourceFactory getDataSourceFactory() {
        return dataSourceFactory;
    }
}

