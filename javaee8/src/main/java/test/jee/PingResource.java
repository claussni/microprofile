package test.jee;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ping")
@Stateless
public class PingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public PingMessage ping() {
        return PingMessage.withMessage("Ping!");
    }

}
