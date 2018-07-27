package SP_jetaircraft1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_jetaircraft1.output.OutputDataClassName_1_3;

@Path("ServiceName_1")
public interface Resource_restServiceName_1 {

	@POST
	@Path("/CapabilityName_1_1/{InputName_1_1_1}/{InputName_1_1_2}/")
	@Produces({ "text/xml" })
	public void CapabilityName_1_1(

	@PathParam("InputName_1_1_1") Float InputName_1_1_1

	, @PathParam("InputName_1_1_2") Float InputName_1_1_2

	);

	@POST
	@Path("/CapabilityName_1_2/")
	@Produces({ "text/xml" })
	public void CapabilityName_1_2(

	);

	@GET
	@Path("/CapabilityName_1_3/{InputName_1_3_5}/{InputName_1_3_6}/{InputName_1_3_3}/{InputName_1_3_4}/{InputName_1_3_1}/{InputName_1_3_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_3(

	@PathParam("InputName_1_3_5") Integer InputName_1_3_5

	, @PathParam("InputName_1_3_6") Float InputName_1_3_6

	, @PathParam("InputName_1_3_3") Integer InputName_1_3_3

	, @PathParam("InputName_1_3_4") Float InputName_1_3_4

	, @PathParam("InputName_1_3_1") Float InputName_1_3_1

	, @PathParam("InputName_1_3_2") String InputName_1_3_2

	);

}
