package SP_all.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_all.output.OutputDataClassName_3_3;
import SP_all.output.OutputDataClassName_3_4;
import SP_all.output.OutputDataClassName_3_5;
import SP_all.output.OutputDataClassName_3_6;
import SP_all.output.OutputDataClassName_3_1;
import SP_all.output.OutputDataClassName_3_2;

@Path("ServiceName_3")
public interface Resource_restServiceName_3 {

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_3_3/{InputName_3_3_1}/{InputName_3_3_2}/{InputName_3_3_3}/{InputName_3_3_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_3(

	@PathParam("InputName_3_3_1") Float InputName_3_3_1

	, @PathParam("InputName_3_3_2") Integer InputName_3_3_2

	, @PathParam("InputName_3_3_3") Integer InputName_3_3_3

	, @PathParam("InputName_3_3_4") Float InputName_3_3_4

	);

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_3_4/{InputName_3_4_1}/{InputName_3_4_4}/{InputName_3_4_5}/{InputName_3_4_2}/{InputName_3_4_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_4(

	@PathParam("InputName_3_4_1") Float InputName_3_4_1

	, @PathParam("InputName_3_4_4") String InputName_3_4_4

	, @PathParam("InputName_3_4_5") Float InputName_3_4_5

	, @PathParam("InputName_3_4_2") Integer InputName_3_4_2

	, @PathParam("InputName_3_4_3") Integer InputName_3_4_3

	);

	@POST
	@Path("/CapabilityName_3_5/{InputName_3_5_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_5(

	@PathParam("InputName_3_5_1") Integer InputName_3_5_1

	);

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_3_6/{InputName_3_6_8}/{InputName_3_6_6}/{InputName_3_6_7}/{InputName_3_6_4}/{InputName_3_6_5}/{InputName_3_6_2}/{InputName_3_6_3}/{InputName_3_6_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_6(

	@PathParam("InputName_3_6_8") Integer InputName_3_6_8

	, @PathParam("InputName_3_6_6") Float InputName_3_6_6

	, @PathParam("InputName_3_6_7") Integer InputName_3_6_7

	, @PathParam("InputName_3_6_4") Integer InputName_3_6_4

	, @PathParam("InputName_3_6_5") String InputName_3_6_5

	, @PathParam("InputName_3_6_2") Float InputName_3_6_2

	, @PathParam("InputName_3_6_3") Float InputName_3_6_3

	, @PathParam("InputName_3_6_1") Float InputName_3_6_1

	);

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_3_1/{InputName_3_1_1}/{InputName_3_1_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_1(

	@PathParam("InputName_3_1_1") Integer InputName_3_1_1

	, @PathParam("InputName_3_1_2") Float InputName_3_1_2

	);

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_3_2/{InputName_3_2_2}/{InputName_3_2_3}/{InputName_3_2_1}/{InputName_3_2_8}/{InputName_3_2_9}/{InputName_3_2_6}/{InputName_3_2_7}/{InputName_3_2_4}/{InputName_3_2_5}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_2(

	@PathParam("InputName_3_2_2") Float InputName_3_2_2

	, @PathParam("InputName_3_2_3") String InputName_3_2_3

	, @PathParam("InputName_3_2_1") String InputName_3_2_1

	, @PathParam("InputName_3_2_8") String InputName_3_2_8

	, @PathParam("InputName_3_2_9") Float InputName_3_2_9

	, @PathParam("InputName_3_2_6") String InputName_3_2_6

	, @PathParam("InputName_3_2_7") Float InputName_3_2_7

	, @PathParam("InputName_3_2_4") String InputName_3_2_4

	, @PathParam("InputName_3_2_5") Float InputName_3_2_5

	);

}
