package SP_drone1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_drone1.output.OutputDataClassName_4_2;
import SP_drone1.output.OutputDataClassName_4_1;

@Path("ServiceName_4")
public interface Resource_restServiceName_4 {

	@GET
	@Path("/CapabilityName_4_2/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_2(

	);

	@GET
	@Path("/CapabilityName_4_1/{InputName_4_1_4}/{InputName_4_1_1}/{InputName_4_1_2}/{InputName_4_1_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_1(

	@PathParam("InputName_4_1_4") Integer InputName_4_1_4

	, @PathParam("InputName_4_1_1") Integer InputName_4_1_1

	, @PathParam("InputName_4_1_2") Integer InputName_4_1_2

	, @PathParam("InputName_4_1_3") Float InputName_4_1_3

	);

}
