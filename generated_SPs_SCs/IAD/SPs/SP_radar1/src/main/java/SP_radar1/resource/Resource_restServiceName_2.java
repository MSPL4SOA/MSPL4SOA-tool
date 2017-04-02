package SP_radar1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_radar1.output.OutputDataClassName_2_1;

@Path("ServiceName_2")
public interface Resource_restServiceName_2 {

	@GET
	@Path("/CapabilityName_2_1/{InputName_2_1_1}/{InputName_2_1_2}/{InputName_2_1_3}/{InputName_2_1_4}/{InputName_2_1_5}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_1(

	@PathParam("InputName_2_1_1") Integer InputName_2_1_1

	, @PathParam("InputName_2_1_2") Integer InputName_2_1_2

	, @PathParam("InputName_2_1_3") Float InputName_2_1_3

	, @PathParam("InputName_2_1_4") Integer InputName_2_1_4

	, @PathParam("InputName_2_1_5") Integer InputName_2_1_5

	);

	@POST
	@Path("/CapabilityName_2_2/{InputName_2_2_1}/{InputName_2_2_2}/")
	@Produces({ "text/xml" })
	public void CapabilityName_2_2(

	@PathParam("InputName_2_2_1") Float InputName_2_2_1

	, @PathParam("InputName_2_2_2") Integer InputName_2_2_2

	);

	@POST
	@Path("/CapabilityName_2_3/{InputName_2_3_1}/")
	@Produces({ "text/xml" })
	public void CapabilityName_2_3(

	@PathParam("InputName_2_3_1") Integer InputName_2_3_1

	);

}
