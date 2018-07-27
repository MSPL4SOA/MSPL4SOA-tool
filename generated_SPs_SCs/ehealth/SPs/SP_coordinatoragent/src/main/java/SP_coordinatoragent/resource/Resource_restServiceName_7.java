package SP_command.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_command.output.OutputDataClassName_7_3;
import SP_command.output.OutputDataClassName_7_4;
import SP_command.output.OutputDataClassName_7_5;
import SP_command.output.OutputDataClassName_7_1;
import SP_command.output.OutputDataClassName_7_2;

@Path("ServiceName_7")
public interface Resource_restServiceName_7 {

	@GET
	@Path("/CapabilityName_7_3/")
	@Produces({ "text/xml" })
	public Response CapabilityName_7_3(

	);

	@GET
	@Path("/CapabilityName_7_4/")
	@Produces({ "text/xml" })
	public Response CapabilityName_7_4(

	);

	@GET
	@Path("/CapabilityName_7_5/{InputName_7_5_3}/{InputName_7_5_4}/{InputName_7_5_1}/{InputName_7_5_2}/{InputName_7_5_7}/{InputName_7_5_5}/{InputName_7_5_6}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_7_5(

	@PathParam("InputName_7_5_3") Float InputName_7_5_3

	, @PathParam("InputName_7_5_4") String InputName_7_5_4

	, @PathParam("InputName_7_5_1") String InputName_7_5_1

	, @PathParam("InputName_7_5_2") Float InputName_7_5_2

	, @PathParam("InputName_7_5_7") Integer InputName_7_5_7

	, @PathParam("InputName_7_5_5") String InputName_7_5_5

	, @PathParam("InputName_7_5_6") Integer InputName_7_5_6

	);

	@POST
	@Path("/CapabilityName_7_1/{InputName_7_1_5}/{InputName_7_1_6}/{InputName_7_1_3}/{InputName_7_1_4}/{InputName_7_1_1}/{InputName_7_1_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_7_1(

	@PathParam("InputName_7_1_5") String InputName_7_1_5

	, @PathParam("InputName_7_1_6") String InputName_7_1_6

	, @PathParam("InputName_7_1_3") String InputName_7_1_3

	, @PathParam("InputName_7_1_4") String InputName_7_1_4

	, @PathParam("InputName_7_1_1") Integer InputName_7_1_1

	, @PathParam("InputName_7_1_2") String InputName_7_1_2

	);

	@GET
	@Path("/CapabilityName_7_2/{InputName_7_2_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_7_2(

	@PathParam("InputName_7_2_1") String InputName_7_2_1

	);

}
