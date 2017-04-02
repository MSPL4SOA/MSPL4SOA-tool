package SP_aircraftcarrier1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_aircraftcarrier1.output.OutputDataClassName_4_2;
import SP_aircraftcarrier1.output.OutputDataClassName_4_3;
import SP_aircraftcarrier1.output.OutputDataClassName_4_4;

@Path("ServiceName_4")
public interface Resource_restServiceName_4 {

	@GET
	@Path("/CapabilityName_4_2/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_2(

	);

	@GET
	@Path("/CapabilityName_4_3/{InputName_4_3_2}/{InputName_4_3_3}/{InputName_4_3_4}/{InputName_4_3_5}/{InputName_4_3_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_3(

	@PathParam("InputName_4_3_2") Float InputName_4_3_2

	, @PathParam("InputName_4_3_3") Float InputName_4_3_3

	, @PathParam("InputName_4_3_4") Float InputName_4_3_4

	, @PathParam("InputName_4_3_5") String InputName_4_3_5

	, @PathParam("InputName_4_3_1") Float InputName_4_3_1

	);

	@GET
	@Path("/CapabilityName_4_4/{InputName_4_4_5}/{InputName_4_4_6}/{InputName_4_4_7}/{InputName_4_4_1}/{InputName_4_4_2}/{InputName_4_4_3}/{InputName_4_4_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_4(

	@PathParam("InputName_4_4_5") String InputName_4_4_5

	, @PathParam("InputName_4_4_6") Float InputName_4_4_6

	, @PathParam("InputName_4_4_7") String InputName_4_4_7

	, @PathParam("InputName_4_4_1") String InputName_4_4_1

	, @PathParam("InputName_4_4_2") Float InputName_4_4_2

	, @PathParam("InputName_4_4_3") String InputName_4_4_3

	, @PathParam("InputName_4_4_4") Float InputName_4_4_4

	);

	@POST
	@Path("/CapabilityName_4_1/{InputName_4_1_1}/{InputName_4_1_2}/")
	@Produces({ "text/xml" })
	public void CapabilityName_4_1(

	@PathParam("InputName_4_1_1") String InputName_4_1_1

	, @PathParam("InputName_4_1_2") String InputName_4_1_2

	);

}
