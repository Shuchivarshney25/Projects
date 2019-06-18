package helloworld.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

public class Saying {
    private long id;
    @Length(max =3 , message = "this field contains atleast 3 characters")
    private String content;
    public Saying(){

    }
    public Saying(long id, String content){
        this.id = id;
        this.content = content;
    }
    @JsonProperty

    public long getid(){
       return id;
    }
    @JsonProperty
    public String getcontent()
    {
        return content;
    }
}
