package SP_command.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_command.output.OutputDataClassName_6_4;
import SP_command.output.OutputDataClassName_6_1;
import SP_command.output.OutputDataClassName_6_3;

@Path("ServiceName_6")
public interface Resource_restServiceName_6 {

	@GET
	@Path("/CapabilityName_6_4/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_4(

	);

	@GET
	@Path("/CapabilityName_6_1/{InputName_6_1_2}/{InputName_6_1_3}/{InputName_6_1_4}/{InputName_6_1_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_1(

	@PathParam("InputName_6_1_2") Float InputName_6_1_2

	, @PathParam("InputName_6_1_3") Float InputName_6_1_3

	, @PathParam("InputName_6_1_4") Float InputName_6_1_4

	, @PathParam("InputName_6_1_1") String InputName_6_1_1

	);

	@POST
	@Path("/CapabilityName_6_2/{InputName_6_2_1}/{InputName_6_2_2}/{InputName_6_2_3}/{InputName_6_2_4}/{InputName_6_2_5}/{InputName_6_2_6}/{InputName_6_2_7}/{InputName_6_2_8}/")
	@Produces({ "text/xml" })
	public void CapabilityName_6_2(

	@PathParam("InputName_6_2_1") Integer InputName_6_2_1

	, @PathParam("InputName_6_2_2") String InputName_6_2_2

	, @PathParam("InputName_6_2_3") String InputName_6_2_3

	, @PathParam("InputName_6_2_4") String InputName_6_2_4

	, @PathParam("InputName_6_2_5") String InputName_6_2_5

	, @PathParam("InputName_6_2_6") Float InputName_6_2_6

	, @PathParam("InputName_6_2_7") Integer InputName_6_2_7

	, @PathParam("InputName_6_2_8") Integer InputName_6_2_8

	);

	@GET
	@Path("/CapabilityName_6_3/{InputName_6_3_1}/{InputName_6_3_2}/{InputName_6_3_3}/{InputName_6_3_4}/{InputName_6_3_5}/{InputName_6_3_6}/{InputName_6_3_7}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_3(

	@PathParam("InputName_6_3_1") String InputName_6_3_1

	, @PathParam("InputName_6_3_2") Float InputName_6_3_2

	, @PathParam("InputName_6_3_3") Float InputName_6_3_3

	, @PathParam("InputName_6_3_4") Float InputName_6_3_4

	, @PathParam("InputName_6_3_5") Float InputName_6_3_5

	, @PathParam("InputName_6_3_6") Float InputName_6_3_6

	, @PathParam("InputName_6_3_7") String InputName_6_3_7

	);

}
