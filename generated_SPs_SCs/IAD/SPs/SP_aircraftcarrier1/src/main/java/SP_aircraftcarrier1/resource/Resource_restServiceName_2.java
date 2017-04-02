package SP_aircraftcarrier1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_aircraftcarrier1.output.OutputDataClassName_2_2;
import SP_aircraftcarrier1.output.OutputDataClassName_2_3;

@Path("ServiceName_2")
public interface Resource_restServiceName_2 {

	@POST
	@Path("/CapabilityName_2_1/{InputName_2_1_1}/{InputName_2_1_2}/{InputName_2_1_3}/{InputName_2_1_4}/{InputName_2_1_5}/")
	@Produces({ "text/xml" })
	public void CapabilityName_2_1(

	@PathParam("InputName_2_1_1") Integer InputName_2_1_1

	, @PathParam("InputName_2_1_2") Integer InputName_2_1_2

	, @PathParam("InputName_2_1_3") Integer InputName_2_1_3

	, @PathParam("InputName_2_1_4") Integer InputName_2_1_4

	, @PathParam("InputName_2_1_5") Float InputName_2_1_5

	);

	@GET
	@Path("/CapabilityName_2_2/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_2(

	);

	@GET
	@Path("/CapabilityName_2_3/{InputName_2_3_1}/{InputName_2_3_2}/{InputName_2_3_3}/{InputName_2_3_4}/{InputName_2_3_5}/{InputName_2_3_6}/{InputName_2_3_7}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_3(

	@PathParam("InputName_2_3_1") Float InputName_2_3_1

	, @PathParam("InputName_2_3_2") String InputName_2_3_2

	, @PathParam("InputName_2_3_3") Integer InputName_2_3_3

	, @PathParam("InputName_2_3_4") Integer InputName_2_3_4

	, @PathParam("InputName_2_3_5") Float InputName_2_3_5

	, @PathParam("InputName_2_3_6") String InputName_2_3_6

	, @PathParam("InputName_2_3_7") Float InputName_2_3_7

	);

}
