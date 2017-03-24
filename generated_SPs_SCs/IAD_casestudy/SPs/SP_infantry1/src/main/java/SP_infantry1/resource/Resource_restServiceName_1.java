package SP_infantry1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_infantry1.output.OutputDataClassName_1_5;
import SP_infantry1.output.OutputDataClassName_1_1;
import SP_infantry1.output.OutputDataClassName_1_2;
import SP_infantry1.output.OutputDataClassName_1_3;
import SP_infantry1.output.OutputDataClassName_1_4;

@Path("ServiceName_1")
public interface Resource_restServiceName_1 {

	@GET
	@Path("/CapabilityName_1_5/{InputName_1_5_3}/{InputName_1_5_4}/{InputName_1_5_1}/{InputName_1_5_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_5(

	@PathParam("InputName_1_5_3") Float InputName_1_5_3

	, @PathParam("InputName_1_5_4") String InputName_1_5_4

	, @PathParam("InputName_1_5_1") String InputName_1_5_1

	, @PathParam("InputName_1_5_2") Float InputName_1_5_2

	);

	@GET
	@Path("/CapabilityName_1_1/{InputName_1_1_1}/{InputName_1_1_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_1(

	@PathParam("InputName_1_1_1") Float InputName_1_1_1

	, @PathParam("InputName_1_1_2") Float InputName_1_1_2

	);

	@GET
	@Path("/CapabilityName_1_2/{InputName_1_2_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_2(

	@PathParam("InputName_1_2_1") Float InputName_1_2_1

	);

	@GET
	@Path("/CapabilityName_1_3/{InputName_1_3_7}/{InputName_1_3_8}/{InputName_1_3_5}/{InputName_1_3_6}/{InputName_1_3_9}/{InputName_1_3_3}/{InputName_1_3_4}/{InputName_1_3_1}/{InputName_1_3_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_3(

	@PathParam("InputName_1_3_7") Integer InputName_1_3_7

	, @PathParam("InputName_1_3_8") Integer InputName_1_3_8

	, @PathParam("InputName_1_3_5") Float InputName_1_3_5

	, @PathParam("InputName_1_3_6") Float InputName_1_3_6

	, @PathParam("InputName_1_3_9") Integer InputName_1_3_9

	, @PathParam("InputName_1_3_3") String InputName_1_3_3

	, @PathParam("InputName_1_3_4") String InputName_1_3_4

	, @PathParam("InputName_1_3_1") Integer InputName_1_3_1

	, @PathParam("InputName_1_3_2") Integer InputName_1_3_2

	);

	@GET
	@Path("/CapabilityName_1_4/{InputName_1_4_2}/{InputName_1_4_3}/{InputName_1_4_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_4(

	@PathParam("InputName_1_4_2") String InputName_1_4_2

	, @PathParam("InputName_1_4_3") Float InputName_1_4_3

	, @PathParam("InputName_1_4_1") Integer InputName_1_4_1

	);

}
