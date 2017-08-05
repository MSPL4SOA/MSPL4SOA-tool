package SP_command.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_command.output.OutputDataClassName_1_5;
import SP_command.output.OutputDataClassName_1_6;
import SP_command.output.OutputDataClassName_1_1;
import SP_command.output.OutputDataClassName_1_2;
import SP_command.output.OutputDataClassName_1_3;
import SP_command.output.OutputDataClassName_1_4;

@Path("ServiceName_1")
public interface Resource_restServiceName_1 {

	@POST
	@GET
	@Path("/CapabilityName_1_5/{InputName_1_5_1}/{InputName_1_5_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_5(

	@PathParam("InputName_1_5_1") String InputName_1_5_1

	, @PathParam("InputName_1_5_2") Float InputName_1_5_2

	);

	@GET
	@Path("/CapabilityName_1_6/{InputName_1_6_4}/{InputName_1_6_5}/{InputName_1_6_2}/{InputName_1_6_3}/{InputName_1_6_6}/{InputName_1_6_7}/{InputName_1_6_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_6(

	@PathParam("InputName_1_6_4") String InputName_1_6_4

	, @PathParam("InputName_1_6_5") Integer InputName_1_6_5

	, @PathParam("InputName_1_6_2") Integer InputName_1_6_2

	, @PathParam("InputName_1_6_3") Integer InputName_1_6_3

	, @PathParam("InputName_1_6_6") Integer InputName_1_6_6

	, @PathParam("InputName_1_6_7") Float InputName_1_6_7

	, @PathParam("InputName_1_6_1") String InputName_1_6_1

	);

	@GET
	@Path("/CapabilityName_1_1/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_1(

	);

	@GET
	@Path("/CapabilityName_1_2/{InputName_1_2_1}/{InputName_1_2_4}/{InputName_1_2_5}/{InputName_1_2_2}/{InputName_1_2_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_2(

	@PathParam("InputName_1_2_1") Float InputName_1_2_1

	, @PathParam("InputName_1_2_4") Float InputName_1_2_4

	, @PathParam("InputName_1_2_5") String InputName_1_2_5

	, @PathParam("InputName_1_2_2") Float InputName_1_2_2

	, @PathParam("InputName_1_2_3") Float InputName_1_2_3

	);

	@POST
	@Path("/CapabilityName_1_3/{InputName_1_3_7}/{InputName_1_3_8}/{InputName_1_3_5}/{InputName_1_3_6}/{InputName_1_3_3}/{InputName_1_3_4}/{InputName_1_3_1}/{InputName_1_3_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_3(

	@PathParam("InputName_1_3_7") Float InputName_1_3_7

	, @PathParam("InputName_1_3_8") String InputName_1_3_8

	, @PathParam("InputName_1_3_5") String InputName_1_3_5

	, @PathParam("InputName_1_3_6") Integer InputName_1_3_6

	, @PathParam("InputName_1_3_3") Integer InputName_1_3_3

	, @PathParam("InputName_1_3_4") Integer InputName_1_3_4

	, @PathParam("InputName_1_3_1") String InputName_1_3_1

	, @PathParam("InputName_1_3_2") Integer InputName_1_3_2

	);

	@GET
	@Path("/CapabilityName_1_4/{InputName_1_4_4}/{InputName_1_4_2}/{InputName_1_4_3}/{InputName_1_4_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_4(

	@PathParam("InputName_1_4_4") Integer InputName_1_4_4

	, @PathParam("InputName_1_4_2") Integer InputName_1_4_2

	, @PathParam("InputName_1_4_3") Integer InputName_1_4_3

	, @PathParam("InputName_1_4_1") Float InputName_1_4_1

	);

}
