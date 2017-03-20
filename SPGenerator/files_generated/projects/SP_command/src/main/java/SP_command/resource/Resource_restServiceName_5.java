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

	@PathParam("InputName_5_5_1") Float InputName_5_5_1

	, @PathParam("InputName_5_5_2") Float InputName_5_5_2

	, @PathParam("InputName_5_5_3") Float InputName_5_5_3

	);

	@GET
	@Path("/CapabilityName_5_6/{InputName_5_6_1}/{InputName_5_6_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_5_6(

	@PathParam("InputName_5_6_1") Float InputName_5_6_1

	, @PathParam("InputName_5_6_2") Float InputName_5_6_2

	);

	@GET
	@Path("/CapabilityName_5_1/{InputName_5_1_1}/{InputName_5_1_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_5_1(

	@PathParam("InputName_5_1_1") String InputName_5_1_1

	, @PathParam("InputName_5_1_2") String InputName_5_1_2

	);

	@POST
	@Path("/CapabilityName_5_2/{InputName_5_2_1}/{InputName_5_2_2}/")
	@Produces({ "text/xml" })
	public void CapabilityName_5_2(

	@PathParam("InputName_5_2_1") String InputName_5_2_1

	, @PathParam("InputName_5_2_2") Float InputName_5_2_2

	);

	@GET
	@Path("/CapabilityName_5_3/")
	@Produces({ "text/xml" })
	public Response CapabilityName_5_3(

	);

	@GET
	@Path("/CapabilityName_5_4/{InputName_5_4_2}/{InputName_5_4_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_5_4(

	@PathParam("InputName_5_4_2") Float InputName_5_4_2

	, @PathParam("InputName_5_4_1") Float InputName_5_4_1

	);

}
