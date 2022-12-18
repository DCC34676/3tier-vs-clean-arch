package dk.mrok;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("signup")
public class Signup {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public SignupDTO postSignup(SignupDTO signup) {
        System.out.println("Saving: " + signup);
        signup.id = 3432;
        return signup;
        //https://eclipse-ee4j.github.io/jersey.github.io/documentation/latest/jaxrs-resources.html#d0e2132
    }
}
