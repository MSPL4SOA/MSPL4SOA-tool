package SP_command.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_command.output.OutputDataClassName_5_5;
import SP_command.output.OutputDataClassName_5_6;
import SP_command.output.OutputDataClassName_5_1;
import SP_command.output.OutputDataClassName_5_3;
import SP_command.output.OutputDataClassName_5_4;

@Path("ServiceName_5")
public interface Resource_restServiceName_5 {

	@GET
	@Path("/CapabilityName_5_5/{InputName_5_5_1}/{InputName_5_5_2}/{InputName_5_5_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_5_5(

	@PathParam("InputName_5_5_1") Integer InputName_5_5_1

	, @PathParam("InputName_5_5_2") Integer InputName_5_5_2

	, @PathParam("InputName_5_5_3") String InputName_5_5_3

	);

	@GET
	@Path("/CapabilityName_5_6/{InputName_5_6_8}/{InputName_5_6_9}/{InputName_5_6_6}/{InputName_5_6_7}/{InputName_5_6_1}/{InputName_5_6_4}/{InputName_5_6_5}/{InputName_5_6_2}/{InputName_5_6_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_5_6(

	@PathParam("InputName_5_6_8") Integer InputName_5_6_8

	, @PathParam("InputName_5_6_9") String InputName_5_6_9

	, @PathParam("InputName_5_6_6") String InputName_5_6_6

	, @PathParam("InputName_5_6_7") String InputName_5_6_7

	, @PathParam("InputName_5_6_1") Float InputName_5_6_1

	, @PathParam("InputName_5_6_4") Float InputName_5_6_4

	, @PathParam("InputName_5_6_5") Float InputName_5_6_5

	, @PathParam("InputName_5_6_2") Float InputName_5_6_2

	, @PathParam("InputName_5_6_3") Integer InputName_5_6_3

	);

	@GET
	@Path("/CapabilityName_5_1/{InputName_5_1_1}/{InputName_5_1_2}/{InputName_5_1_5}/{InputName_5_1_6}/{InputName_5_1_3}/{InputName_5_1_4}/{InputName_5_1_7}/{InputName_5_1_8}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_5_1(

	@PathParam("InputName_5_1_1") Integer InputName_5_1_1

	, @PathParam("InputName_5_1_2") Float InputName_5_1_2

	, @PathParam("InputName_5_1_5") Integer InputName_5_1_5

	, @PathParam("InputName_5_1_6") String InputName_5_1_6

	, @PathParam("InputName_5_1_3") String InputName_5_1_3

	, @PathParam("InputName_5_1_4") String InputName_5_1_4

	, @PathParam("InputName_5_1_7") Integer InputName_5_1_7

	, @PathParam("InputName_5_1_8") String InputName_5_1_8

	);

	@POST
	@Path("/CapabilityName_5_2/{InputName_5_2_1}/{InputName_5_2_2}/{InputName_5_2_3}/")
	@Produces({ "text/xml" })
	public void CapabilityName_5_2(

	@PathParam("InputName_5_2_1") Float InputName_5_2_1

	, @PathParam("InputName_5_2_2") Float InputName_5_2_2

	, @PathParam("InputName_5_2_3") Integer InputName_5_2_3

	);

	@GET
	@Path("/CapabilityName_5_3/{InputName_5_3_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_5_3(

	@PathParam("InputName_5_3_1") Float InputName_5_3_1

	);

	@GET
	@Path("/CapabilityName_5_4/")
	@Produces({ "text/xml" })
	public Response CapabilityName_5_4(

	);

}
