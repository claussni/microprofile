package test.jee;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("ping")
@Stateless
public class PingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
            summary = "Say ping",
            description = "Generate a Ping message with a number counting up."
    )

    @APIResponses(
            value = {
                    @APIResponse(
                            responseCode = "200",
                            description = "A JSON Ping message",
                            content = @Content(mediaType = APPLICATION_JSON)
                    )
            }
    )
    public Response ping() {
        PingMessage pingMessage = PingMessage.withMessage("Ping!");
        return Response.ok().entity(pingMessage).build();
    }

}
