package SP_drone1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_drone1.output.OutputDataClassName_2_3;

@Path("ServiceName_2")
public interface Resource_restServiceName_2 {

	@POST
	@Path("/CapabilityName_2_1/{InputName_2_1_1}/{InputName_2_1_2}/{InputName_2_1_3}/{InputName_2_1_4}/{InputName_2_1_5}/{InputName_2_1_6}/{InputName_2_1_7}/{InputName_2_1_8}/{InputName_2_1_9}/")
	@Produces({ "text/xml" })
	public void CapabilityName_2_1(

	@PathParam("InputName_2_1_1") String InputName_2_1_1

	, @PathParam("InputName_2_1_2") String InputName_2_1_2

	, @PathParam("InputName_2_1_3") String InputName_2_1_3

	, @PathParam("InputName_2_1_4") Integer InputName_2_1_4

	, @PathParam("InputName_2_1_5") Float InputName_2_1_5

	, @PathParam("InputName_2_1_6") Integer InputName_2_1_6

	, @PathParam("InputName_2_1_7") Integer InputName_2_1_7

	, @PathParam("InputName_2_1_8") Float InputName_2_1_8

	, @PathParam("InputName_2_1_9") String InputName_2_1_9

	);

	@POST
	@Path("/CapabilityName_2_2/")
	@Produces({ "text/xml" })
	public void CapabilityName_2_2(

	);

	@GET
	@Path("/CapabilityName_2_3/{InputName_2_3_1}/{InputName_2_3_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_3(

	@PathParam("InputName_2_3_1") String InputName_2_3_1

	, @PathParam("InputName_2_3_2") Float InputName_2_3_2

	);

}
