package test.jee;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ping")
@Stateless
public class PingResource {

    @Inject
    PingMessage pingMessage;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
        return pingMessage.message();
    }

}
