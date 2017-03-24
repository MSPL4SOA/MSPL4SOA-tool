package SP_anticraft2.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_anticraft2.output.OutputDataClassName_3_4;
import SP_anticraft2.output.OutputDataClassName_3_1;

@Path("ServiceName_3")
public interface Resource_restServiceName_3 {

	@POST
	@Path("/CapabilityName_3_3/")
	@Produces({ "text/xml" })
	public void CapabilityName_3_3(

	);

	@GET
	@Path("/CapabilityName_3_4/{InputName_3_4_1}/{InputName_3_4_6}/{InputName_3_4_4}/{InputName_3_4_5}/{InputName_3_4_2}/{InputName_3_4_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_4(

	@PathParam("InputName_3_4_1") Float InputName_3_4_1

	, @PathParam("InputName_3_4_6") Float InputName_3_4_6

	, @PathParam("InputName_3_4_4") String InputName_3_4_4

	, @PathParam("InputName_3_4_5") Float InputName_3_4_5

	, @PathParam("InputName_3_4_2") Integer InputName_3_4_2

	, @PathParam("InputName_3_4_3") String InputName_3_4_3

	);

	@GET
	@Path("/CapabilityName_3_1/{InputName_3_1_3}/{InputName_3_1_4}/{InputName_3_1_1}/{InputName_3_1_2}/{InputName_3_1_5}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_1(

	@PathParam("InputName_3_1_3") Float InputName_3_1_3

	, @PathParam("InputName_3_1_4") Float InputName_3_1_4

	, @PathParam("InputName_3_1_1") String InputName_3_1_1

	, @PathParam("InputName_3_1_2") Integer InputName_3_1_2

	, @PathParam("InputName_3_1_5") Float InputName_3_1_5

	);

	@POST
	@Path("/CapabilityName_3_2/{InputName_3_2_2}/{InputName_3_2_3}/{InputName_3_2_1}/{InputName_3_2_4}/{InputName_3_2_5}/")
	@Produces({ "text/xml" })
	public void CapabilityName_3_2(

	@PathParam("InputName_3_2_2") Float InputName_3_2_2

	, @PathParam("InputName_3_2_3") Float InputName_3_2_3

	, @PathParam("InputName_3_2_1") Integer InputName_3_2_1

	, @PathParam("InputName_3_2_4") String InputName_3_2_4

	, @PathParam("InputName_3_2_5") Float InputName_3_2_5

	);

}
