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
import SP_command.output.OutputDataClassName_2_6;
import SP_command.output.OutputDataClassName_2_1;

@Path("ServiceName_2")
public interface Resource_restServiceName_2 {

	@GET
	@Path("/CapabilityName_2_4/{InputName_2_4_1}/{InputName_2_4_2}/{InputName_2_4_3}/{InputName_2_4_4}/{InputName_2_4_5}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_4(

	@PathParam("InputName_2_4_1") String InputName_2_4_1

	, @PathParam("InputName_2_4_2") Integer InputName_2_4_2

	, @PathParam("InputName_2_4_3") String InputName_2_4_3

	, @PathParam("InputName_2_4_4") Float InputName_2_4_4

	, @PathParam("InputName_2_4_5") Integer InputName_2_4_5

	);

	@POST
	@Path("/CapabilityName_2_5/")
	@Produces({ "text/xml" })
	public void CapabilityName_2_5(

	);

	@GET
	@Path("/CapabilityName_2_6/{InputName_2_6_1}/{InputName_2_6_2}/{InputName_2_6_3}/{InputName_2_6_4}/{InputName_2_6_5}/{InputName_2_6_6}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_6(

	@PathParam("InputName_2_6_1") String InputName_2_6_1

	, @PathParam("InputName_2_6_2") String InputName_2_6_2

	, @PathParam("InputName_2_6_3") Float InputName_2_6_3

	, @PathParam("InputName_2_6_4") String InputName_2_6_4

	, @PathParam("InputName_2_6_5") String InputName_2_6_5

	, @PathParam("InputName_2_6_6") Integer InputName_2_6_6

	);

	@GET
	@Path("/CapabilityName_2_1/{InputName_2_1_1}/{InputName_2_1_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_1(

	@PathParam("InputName_2_1_1") String InputName_2_1_1

	, @PathParam("InputName_2_1_2") Integer InputName_2_1_2

	);

	@POST
	@Path("/CapabilityName_2_2/")
	@Produces({ "text/xml" })
	public void CapabilityName_2_2(

	);

	@POST
	@Path("/CapabilityName_2_3/")
	@Produces({ "text/xml" })
	public void CapabilityName_2_3(

	);

}
