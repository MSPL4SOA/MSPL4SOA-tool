package SP_command.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_command.output.OutputDataClassName_3_3;
import SP_command.output.OutputDataClassName_3_4;
import SP_command.output.OutputDataClassName_3_6;
import SP_command.output.OutputDataClassName_3_1;
import SP_command.output.OutputDataClassName_3_2;

@Path("ServiceName_3")
public interface Resource_restServiceName_3 {

	@GET
	@Path("/CapabilityName_3_3/{InputName_3_3_1}/{InputName_3_3_2}/{InputName_3_3_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_3(

	@PathParam("InputName_3_3_1") Integer InputName_3_3_1

	, @PathParam("InputName_3_3_2") Float InputName_3_3_2

	, @PathParam("InputName_3_3_3") Float InputName_3_3_3

	);

	@GET
	@Path("/CapabilityName_3_4/{InputName_3_4_1}/{InputName_3_4_2}/{InputName_3_4_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_4(

	@PathParam("InputName_3_4_1") String InputName_3_4_1

	, @PathParam("InputName_3_4_2") Float InputName_3_4_2

	, @PathParam("InputName_3_4_3") Integer InputName_3_4_3

	);

	@POST
	@Path("/CapabilityName_3_5/{InputName_3_5_3}/{InputName_3_5_1}/{InputName_3_5_2}/")
	@Produces({ "text/xml" })
	public void CapabilityName_3_5(

	@PathParam("InputName_3_5_3") Integer InputName_3_5_3

	, @PathParam("InputName_3_5_1") Integer InputName_3_5_1

	, @PathParam("InputName_3_5_2") Integer InputName_3_5_2

	);

	@GET
	@Path("/CapabilityName_3_6/{InputName_3_6_6}/{InputName_3_6_7}/{InputName_3_6_4}/{InputName_3_6_5}/{InputName_3_6_2}/{InputName_3_6_3}/{InputName_3_6_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_6(

	@PathParam("InputName_3_6_6") Integer InputName_3_6_6

	, @PathParam("InputName_3_6_7") String InputName_3_6_7

	, @PathParam("InputName_3_6_4") Float InputName_3_6_4

	, @PathParam("InputName_3_6_5") String InputName_3_6_5

	, @PathParam("InputName_3_6_2") Float InputName_3_6_2

	, @PathParam("InputName_3_6_3") String InputName_3_6_3

	, @PathParam("InputName_3_6_1") Integer InputName_3_6_1

	);

	@GET
	@Path("/CapabilityName_3_1/{InputName_3_1_3}/{InputName_3_1_1}/{InputName_3_1_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_1(

	@PathParam("InputName_3_1_3") Float InputName_3_1_3

	, @PathParam("InputName_3_1_1") Float InputName_3_1_1

	, @PathParam("InputName_3_1_2") Integer InputName_3_1_2

	);

	@GET
	@Path("/CapabilityName_3_2/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_2(

	);

}
