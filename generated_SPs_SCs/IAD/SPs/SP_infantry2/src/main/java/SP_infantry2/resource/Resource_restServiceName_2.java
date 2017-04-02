package SP_infantry2.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_infantry2.output.OutputDataClassName_2_1;
import SP_infantry2.output.OutputDataClassName_2_2;

@Path("ServiceName_2")
public interface Resource_restServiceName_2 {

	@GET
	@Path("/CapabilityName_2_1/{InputName_2_1_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_1(

	@PathParam("InputName_2_1_1") String InputName_2_1_1

	);

	@GET
	@Path("/CapabilityName_2_2/{InputName_2_2_1}/{InputName_2_2_2}/{InputName_2_2_3}/{InputName_2_2_4}/{InputName_2_2_5}/{InputName_2_2_6}/{InputName_2_2_7}/{InputName_2_2_8}/{InputName_2_2_9}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_2(

	@PathParam("InputName_2_2_1") Integer InputName_2_2_1

	, @PathParam("InputName_2_2_2") Float InputName_2_2_2

	, @PathParam("InputName_2_2_3") Integer InputName_2_2_3

	, @PathParam("InputName_2_2_4") Integer InputName_2_2_4

	, @PathParam("InputName_2_2_5") Integer InputName_2_2_5

	, @PathParam("InputName_2_2_6") Float InputName_2_2_6

	, @PathParam("InputName_2_2_7") Float InputName_2_2_7

	, @PathParam("InputName_2_2_8") String InputName_2_2_8

	, @PathParam("InputName_2_2_9") String InputName_2_2_9

	);

}
