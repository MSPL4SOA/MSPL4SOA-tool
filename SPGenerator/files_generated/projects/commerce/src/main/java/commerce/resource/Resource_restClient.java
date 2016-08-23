package commerce.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import commerce.output.UpdateStatus;

@Path("Client")
public interface Resource_restClient {

	@PUT
	@Path("/updateProfile/{age}/{address}/")
	@Produces({ "text/xml" })
	public Response updateProfile(

	@PathParam("age") Integer age

	, @PathParam("address") String address

	);

}
