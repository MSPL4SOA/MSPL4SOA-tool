package SP_command.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_command.output.OutputDataClassName_2_4;
import SP_command.output.OutputDataClassName_2_5;
import SP_command.output.OutputDataClassName_2_6;
import SP_command.output.OutputDataClassName_2_1;
import SP_command.output.OutputDataClassName_2_2;
import SP_command.output.OutputDataClassName_2_3;

@Path("ServiceName_2")
public interface Resource_restServiceName_2 {

	@GET
	@Path("/CapabilityName_2_4/{InputName_2_4_1}/{InputName_2_4_2}/{InputName_2_4_3}/{InputName_2_4_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_4(

	@PathParam("InputName_2_4_1") String InputName_2_4_1

	, @PathParam("InputName_2_4_2") Float InputName_2_4_2

	, @PathParam("InputName_2_4_3") Integer InputName_2_4_3

	, @PathParam("InputName_2_4_4") Float InputName_2_4_4

	);

	@GET
	@Path("/CapabilityName_2_5/{InputName_2_5_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_5(

	@PathParam("InputName_2_5_1") Integer InputName_2_5_1

	);

	@GET
	@Path("/CapabilityName_2_6/{InputName_2_6_1}/{InputName_2_6_2}/{InputName_2_6_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_6(

	@PathParam("InputName_2_6_1") Float InputName_2_6_1

	, @PathParam("InputName_2_6_2") Float InputName_2_6_2

	, @PathParam("InputName_2_6_3") Float InputName_2_6_3

	);

	@POST
	@Path("/CapabilityName_2_1/{InputName_2_1_1}/{InputName_2_1_2}/{InputName_2_1_3}/{InputName_2_1_4}/{InputName_2_1_5}/{InputName_2_1_6}/{InputName_2_1_7}/{InputName_2_1_8}/{InputName_2_1_9}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_1(

	@PathParam("InputName_2_1_1") Float InputName_2_1_1

	, @PathParam("InputName_2_1_2") Float InputName_2_1_2

	, @PathParam("InputName_2_1_3") String InputName_2_1_3

	, @PathParam("InputName_2_1_4") Integer InputName_2_1_4

	, @PathParam("InputName_2_1_5") Float InputName_2_1_5

	, @PathParam("InputName_2_1_6") Float InputName_2_1_6

	, @PathParam("InputName_2_1_7") String InputName_2_1_7

	, @PathParam("InputName_2_1_8") Float InputName_2_1_8

	, @PathParam("InputName_2_1_9") String InputName_2_1_9

	);

	@GET
	@Path("/CapabilityName_2_2/{InputName_2_2_1}/{InputName_2_2_2}/{InputName_2_2_3}/{InputName_2_2_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_2(

	@PathParam("InputName_2_2_1") Float InputName_2_2_1

	, @PathParam("InputName_2_2_2") Integer InputName_2_2_2

	, @PathParam("InputName_2_2_3") Float InputName_2_2_3

	, @PathParam("InputName_2_2_4") Float InputName_2_2_4

	);

	@POST
	@Path("/CapabilityName_2_3/{InputName_2_3_1}/{InputName_2_3_2}/{InputName_2_3_3}/{InputName_2_3_4}/{InputName_2_3_5}/{InputName_2_3_6}/{InputName_2_3_7}/{InputName_2_3_8}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_3(

	@PathParam("InputName_2_3_1") String InputName_2_3_1

	, @PathParam("InputName_2_3_2") Float InputName_2_3_2

	, @PathParam("InputName_2_3_3") Float InputName_2_3_3

	, @PathParam("InputName_2_3_4") String InputName_2_3_4

	, @PathParam("InputName_2_3_5") Float InputName_2_3_5

	, @PathParam("InputName_2_3_6") Integer InputName_2_3_6

	, @PathParam("InputName_2_3_7") Float InputName_2_3_7

	, @PathParam("InputName_2_3_8") String InputName_2_3_8

	);

}
