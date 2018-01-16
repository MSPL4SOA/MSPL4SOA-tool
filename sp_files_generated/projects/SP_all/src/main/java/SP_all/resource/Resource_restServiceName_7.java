package SP_all.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_all.output.OutputDataClassName_7_3;
import SP_all.output.OutputDataClassName_7_4;
import SP_all.output.OutputDataClassName_7_5;

@Path("ServiceName_7")
public interface Resource_restServiceName_7 {

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_7_3/")
	@Produces({ "text/xml" })
	public Response CapabilityName_7_3(

	);

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_7_4/{InputName_7_4_4}/{InputName_7_4_5}/{InputName_7_4_2}/{InputName_7_4_3}/{InputName_7_4_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_7_4(

	@PathParam("InputName_7_4_4") Float InputName_7_4_4

	, @PathParam("InputName_7_4_5") Float InputName_7_4_5

	, @PathParam("InputName_7_4_2") Float InputName_7_4_2

	, @PathParam("InputName_7_4_3") Float InputName_7_4_3

	, @PathParam("InputName_7_4_1") Float InputName_7_4_1

	);

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_7_5/{InputName_7_5_3}/{InputName_7_5_4}/{InputName_7_5_1}/{InputName_7_5_2}/{InputName_7_5_5}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_7_5(

	@PathParam("InputName_7_5_3") Float InputName_7_5_3

	, @PathParam("InputName_7_5_4") String InputName_7_5_4

	, @PathParam("InputName_7_5_1") Float InputName_7_5_1

	, @PathParam("InputName_7_5_2") Float InputName_7_5_2

	, @PathParam("InputName_7_5_5") String InputName_7_5_5

	);

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_7_1/{InputName_7_1_1}/{InputName_7_1_2}/")
	@Produces({ "text/xml" })
	public void CapabilityName_7_1(

	@PathParam("InputName_7_1_1") String InputName_7_1_1

	, @PathParam("InputName_7_1_2") String InputName_7_1_2

	);

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_7_2/{InputName_7_2_6}/{InputName_7_2_7}/{InputName_7_2_4}/{InputName_7_2_5}/{InputName_7_2_2}/{InputName_7_2_3}/{InputName_7_2_1}/{InputName_7_2_8}/{InputName_7_2_9}/")
	@Produces({ "text/xml" })
	public void CapabilityName_7_2(

	@PathParam("InputName_7_2_6") Float InputName_7_2_6

	, @PathParam("InputName_7_2_7") String InputName_7_2_7

	, @PathParam("InputName_7_2_4") String InputName_7_2_4

	, @PathParam("InputName_7_2_5") String InputName_7_2_5

	, @PathParam("InputName_7_2_2") String InputName_7_2_2

	, @PathParam("InputName_7_2_3") Integer InputName_7_2_3

	, @PathParam("InputName_7_2_1") Float InputName_7_2_1

	, @PathParam("InputName_7_2_8") Integer InputName_7_2_8

	, @PathParam("InputName_7_2_9") Float InputName_7_2_9

	);

}
