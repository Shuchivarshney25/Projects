package resources;

import com.codahale.metrics.annotation.Timed;
import helloworld.api.Saying;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResouces {
    private final String template;
    private final  String  defaultname;

    public HelloWorldResouces(String template, String defaultname) {
        this.template = template;
        this.defaultname = defaultname;
    }
    @GET
    @Timed
    public Saying sayhello(@QueryParam("name")Optional<String>name){
       final String val = String.format(template, name.orElse(defaultname));
       return new Saying(1,val);
    }


}
