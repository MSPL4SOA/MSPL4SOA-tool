package SP_anticraft1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_anticraft1.output.OutputDataClassName_2_4;
import SP_anticraft1.output.OutputDataClassName_2_1;
import SP_anticraft1.output.OutputDataClassName_2_3;

@Path("ServiceName_2")
public interface Resource_restServiceName_2 {

	@GET
	@Path("/CapabilityName_2_4/{InputName_2_4_1}/{InputName_2_4_2}/{InputName_2_4_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_4(

	@PathParam("InputName_2_4_1") Float InputName_2_4_1

	, @PathParam("InputName_2_4_2") String InputName_2_4_2

	, @PathParam("InputName_2_4_3") Integer InputName_2_4_3

	);

	@GET
	@Path("/CapabilityName_2_1/{InputName_2_1_1}/{InputName_2_1_2}/{InputName_2_1_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_1(

	@PathParam("InputName_2_1_1") String InputName_2_1_1

	, @PathParam("InputName_2_1_2") Float InputName_2_1_2

	, @PathParam("InputName_2_1_3") Float InputName_2_1_3

	);

	@POST
	@Path("/CapabilityName_2_2/")
	@Produces({ "text/xml" })
	public void CapabilityName_2_2(

	);

	@GET
	@Path("/CapabilityName_2_3/{InputName_2_3_1}/{InputName_2_3_2}/{InputName_2_3_3}/{InputName_2_3_4}/{InputName_2_3_5}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_3(

	@PathParam("InputName_2_3_1") Float InputName_2_3_1

	, @PathParam("InputName_2_3_2") String InputName_2_3_2

	, @PathParam("InputName_2_3_3") Integer InputName_2_3_3

	, @PathParam("InputName_2_3_4") Integer InputName_2_3_4

	, @PathParam("InputName_2_3_5") Integer InputName_2_3_5

	);

}
