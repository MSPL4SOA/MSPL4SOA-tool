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
import SP_command.output.OutputDataClassName_6_5;
import SP_command.output.OutputDataClassName_6_6;
import SP_command.output.OutputDataClassName_6_1;
import SP_command.output.OutputDataClassName_6_2;

@Path("ServiceName_6")
public interface Resource_restServiceName_6 {

	@GET
	@Path("/CapabilityName_6_4/{InputName_6_4_1}/{InputName_6_4_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_4(

	@PathParam("InputName_6_4_1") Integer InputName_6_4_1

	, @PathParam("InputName_6_4_2") Float InputName_6_4_2

	);

	@GET
	@Path("/CapabilityName_6_5/{InputName_6_5_6}/{InputName_6_5_1}/{InputName_6_5_2}/{InputName_6_5_3}/{InputName_6_5_4}/{InputName_6_5_5}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_5(

	@PathParam("InputName_6_5_6") Float InputName_6_5_6

	, @PathParam("InputName_6_5_1") Float InputName_6_5_1

	, @PathParam("InputName_6_5_2") Float InputName_6_5_2

	, @PathParam("InputName_6_5_3") Integer InputName_6_5_3

	, @PathParam("InputName_6_5_4") Integer InputName_6_5_4

	, @PathParam("InputName_6_5_5") Integer InputName_6_5_5

	);

	@GET
	@Path("/CapabilityName_6_6/{InputName_6_6_1}/{InputName_6_6_2}/{InputName_6_6_3}/{InputName_6_6_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_6(

	@PathParam("InputName_6_6_1") String InputName_6_6_1

	, @PathParam("InputName_6_6_2") Float InputName_6_6_2

	, @PathParam("InputName_6_6_3") Float InputName_6_6_3

	, @PathParam("InputName_6_6_4") Float InputName_6_6_4

	);

	@GET
	@Path("/CapabilityName_6_1/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_1(

	);

	@GET
	@Path("/CapabilityName_6_2/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_2(

	);

	@POST
	@Path("/CapabilityName_6_3/")
	@Produces({ "text/xml" })
	public void CapabilityName_6_3(

	);

}
