package sp_manager.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import sp_manager.output.OutputDataClassName_2_1;
import sp_manager.output.OutputDataClassName_2_3;
import sp_manager.output.OutputDataClassName_2_4;

@Path("ServiceName_2")
public interface Resource_restServiceName_2 {

	@GET
	@Path("/CapabilityName_2_1/{InputName_2_1_1}/{InputName_2_1_2}/{InputName_2_1_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_1(

	@PathParam("InputName_2_1_1") Float InputName_2_1_1

	, @PathParam("InputName_2_1_2") String InputName_2_1_2

	, @PathParam("InputName_2_1_3") String InputName_2_1_3

	);

	@POST
	@Path("/CapabilityName_2_2/")
	@Produces({ "text/xml" })
	public void CapabilityName_2_2(

	);

	@GET
	@Path("/CapabilityName_2_3/{InputName_2_3_1}/{InputName_2_3_2}/{InputName_2_3_3}/{InputName_2_3_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_3(

	@PathParam("InputName_2_3_1") Integer InputName_2_3_1

	, @PathParam("InputName_2_3_2") Integer InputName_2_3_2

	, @PathParam("InputName_2_3_3") Float InputName_2_3_3

	, @PathParam("InputName_2_3_4") Float InputName_2_3_4

	);

	@GET
	@Path("/CapabilityName_2_4/{InputName_2_4_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_4(

	@PathParam("InputName_2_4_1") Integer InputName_2_4_1

	);

	@POST
	@Path("/CapabilityName_2_6/{InputName_2_6_1}/{InputName_2_6_2}/")
	@Produces({ "text/xml" })
	public void CapabilityName_2_6(

	@PathParam("InputName_2_6_1") Float InputName_2_6_1

	, @PathParam("InputName_2_6_2") Integer InputName_2_6_2

	);

}
