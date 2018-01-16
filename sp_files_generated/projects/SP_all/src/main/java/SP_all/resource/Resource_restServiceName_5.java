package SP_all.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_all.output.OutputDataClassName_5_5;
import SP_all.output.OutputDataClassName_5_1;
import SP_all.output.OutputDataClassName_5_4;

@Path("ServiceName_5")
public interface Resource_restServiceName_5 {

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_5_5/{InputName_5_5_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_5_5(

	@PathParam("InputName_5_5_1") String InputName_5_5_1

	);

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_5_1/{InputName_5_1_1}/{InputName_5_1_2}/{InputName_5_1_5}/{InputName_5_1_6}/{InputName_5_1_3}/{InputName_5_1_4}/{InputName_5_1_9}/{InputName_5_1_7}/{InputName_5_1_8}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_5_1(

	@PathParam("InputName_5_1_1") String InputName_5_1_1

	, @PathParam("InputName_5_1_2") Float InputName_5_1_2

	, @PathParam("InputName_5_1_5") Integer InputName_5_1_5

	, @PathParam("InputName_5_1_6") Float InputName_5_1_6

	, @PathParam("InputName_5_1_3") String InputName_5_1_3

	, @PathParam("InputName_5_1_4") Float InputName_5_1_4

	, @PathParam("InputName_5_1_9") Float InputName_5_1_9

	, @PathParam("InputName_5_1_7") Float InputName_5_1_7

	, @PathParam("InputName_5_1_8") Integer InputName_5_1_8

	);

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_5_2/{InputName_5_2_1}/{InputName_5_2_4}/{InputName_5_2_2}/{InputName_5_2_3}/")
	@Produces({ "text/xml" })
	public void CapabilityName_5_2(

	@PathParam("InputName_5_2_1") String InputName_5_2_1

	, @PathParam("InputName_5_2_4") String InputName_5_2_4

	, @PathParam("InputName_5_2_2") Float InputName_5_2_2

	, @PathParam("InputName_5_2_3") Float InputName_5_2_3

	);

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_5_3/{InputName_5_3_9}/{InputName_5_3_3}/{InputName_5_3_4}/{InputName_5_3_1}/{InputName_5_3_2}/{InputName_5_3_7}/{InputName_5_3_8}/{InputName_5_3_5}/{InputName_5_3_6}/")
	@Produces({ "text/xml" })
	public void CapabilityName_5_3(

	@PathParam("InputName_5_3_9") Float InputName_5_3_9

	, @PathParam("InputName_5_3_3") Float InputName_5_3_3

	, @PathParam("InputName_5_3_4") String InputName_5_3_4

	, @PathParam("InputName_5_3_1") String InputName_5_3_1

	, @PathParam("InputName_5_3_2") Integer InputName_5_3_2

	, @PathParam("InputName_5_3_7") Float InputName_5_3_7

	, @PathParam("InputName_5_3_8") Float InputName_5_3_8

	, @PathParam("InputName_5_3_5") Integer InputName_5_3_5

	, @PathParam("InputName_5_3_6") Integer InputName_5_3_6

	);

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_5_4/")
	@Produces({ "text/xml" })
	public Response CapabilityName_5_4(

	);

}
