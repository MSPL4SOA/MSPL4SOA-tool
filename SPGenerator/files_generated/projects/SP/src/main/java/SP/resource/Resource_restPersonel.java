package SP.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP.output.SessionResponse;

@Path("Personel")
public interface Resource_restPersonel {

	@GET
	@Path("/login/{id}/")
	@Produces({ "text/xml" })
	public Response login(

	@PathParam("id") String id

	);

}
