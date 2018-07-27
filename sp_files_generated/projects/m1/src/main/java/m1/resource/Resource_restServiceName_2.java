package m1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import m1.output.OutputDataClassName_2_2;

@Path("ServiceName_2")
public interface Resource_restServiceName_2 {

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_2_1/{InputName_2_1_1}/")
	@Produces({ "text/xml" })
	public void CapabilityName_2_1(

	@PathParam("InputName_2_1_1") Float InputName_2_1_1

	);

	@POST
	@Path("/CapabilityName_2_2/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_2(

	);

}
