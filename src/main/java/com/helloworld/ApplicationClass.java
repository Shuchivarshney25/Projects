package com.helloworld;

import io.dropwizard.Application;

import io.dropwizard.setup.Environment;
import resources.HelloWorldResouces;


public class ApplicationClass extends Application<HelloWorld> {
    public static void main(String[] args) throws Exception {
        new ApplicationClass().run(args);
    }


    @Override
    public void run(HelloWorld configuration, Environment environment) throws Exception {
        final resources.HelloWorldResouces resource = new HelloWorldResouces(
                configuration.getTemplate(),
                configuration.getDefaultname()
        );
        environment.jersey().register(resource);
    }
}
