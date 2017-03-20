package SP_command.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_command.output.OutputDataClassName_4_6;
import SP_command.output.OutputDataClassName_4_2;
import SP_command.output.OutputDataClassName_4_3;
import SP_command.output.OutputDataClassName_4_4;
import SP_command.output.OutputDataClassName_4_5;
import SP_command.output.OutputDataClassName_4_1;

@Path("ServiceName_4")
public interface Resource_restServiceName_4 {

	@GET
	@Path("/CapabilityName_4_6/{InputName_4_6_1}/{InputName_4_6_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_6(

	@PathParam("InputName_4_6_1") Integer InputName_4_6_1

	, @PathParam("InputName_4_6_2") Integer InputName_4_6_2

	);

	@GET
	@Path("/CapabilityName_4_2/{InputName_4_2_3}/{InputName_4_2_4}/{InputName_4_2_5}/{InputName_4_2_6}/{InputName_4_2_1}/{InputName_4_2_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_2(

	@PathParam("InputName_4_2_3") Float InputName_4_2_3

	, @PathParam("InputName_4_2_4") Integer InputName_4_2_4

	, @PathParam("InputName_4_2_5") Float InputName_4_2_5

	, @PathParam("InputName_4_2_6") String InputName_4_2_6

	, @PathParam("InputName_4_2_1") String InputName_4_2_1

	, @PathParam("InputName_4_2_2") String InputName_4_2_2

	);

	@GET
	@Path("/CapabilityName_4_3/{InputName_4_3_2}/{InputName_4_3_3}/{InputName_4_3_4}/{InputName_4_3_5}/{InputName_4_3_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_3(

	@PathParam("InputName_4_3_2") Integer InputName_4_3_2

	, @PathParam("InputName_4_3_3") Integer InputName_4_3_3

	, @PathParam("InputName_4_3_4") String InputName_4_3_4

	, @PathParam("InputName_4_3_5") Float InputName_4_3_5

	, @PathParam("InputName_4_3_1") Integer InputName_4_3_1

	);

	@GET
	@Path("/CapabilityName_4_4/{InputName_4_4_1}/{InputName_4_4_2}/{InputName_4_4_3}/{InputName_4_4_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_4(

	@PathParam("InputName_4_4_1") Float InputName_4_4_1

	, @PathParam("InputName_4_4_2") Float InputName_4_4_2

	, @PathParam("InputName_4_4_3") Integer InputName_4_4_3

	, @PathParam("InputName_4_4_4") Float InputName_4_4_4

	);

	@GET
	@Path("/CapabilityName_4_5/{InputName_4_5_1}/{InputName_4_5_2}/{InputName_4_5_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_5(

	@PathParam("InputName_4_5_1") Float InputName_4_5_1

	, @PathParam("InputName_4_5_2") Float InputName_4_5_2

	, @PathParam("InputName_4_5_3") Float InputName_4_5_3

	);

	@GET
	@Path("/CapabilityName_4_1/{InputName_4_1_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_1(

	@PathParam("InputName_4_1_1") Float InputName_4_1_1

	);

}
