package SP_all.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_all.output.OutputDataClassName_4_2;
import SP_all.output.OutputDataClassName_4_3;
import SP_all.output.OutputDataClassName_4_4;
import SP_all.output.OutputDataClassName_4_5;
import SP_all.output.OutputDataClassName_4_1;

@Path("ServiceName_4")
public interface Resource_restServiceName_4 {

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_4_2/{InputName_4_2_7}/{InputName_4_2_8}/{InputName_4_2_3}/{InputName_4_2_4}/{InputName_4_2_5}/{InputName_4_2_6}/{InputName_4_2_1}/{InputName_4_2_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_2(

	@PathParam("InputName_4_2_7") Integer InputName_4_2_7

	, @PathParam("InputName_4_2_8") Integer InputName_4_2_8

	, @PathParam("InputName_4_2_3") String InputName_4_2_3

	, @PathParam("InputName_4_2_4") String InputName_4_2_4

	, @PathParam("InputName_4_2_5") Float InputName_4_2_5

	, @PathParam("InputName_4_2_6") Integer InputName_4_2_6

	, @PathParam("InputName_4_2_1") Float InputName_4_2_1

	, @PathParam("InputName_4_2_2") Float InputName_4_2_2

	);

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_4_3/{InputName_4_3_2}/{InputName_4_3_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_3(

	@PathParam("InputName_4_3_2") Float InputName_4_3_2

	, @PathParam("InputName_4_3_1") String InputName_4_3_1

	);

	@POST
	@Path("/CapabilityName_4_4/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_4(

	);

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_4_5/{InputName_4_5_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_5(

	@PathParam("InputName_4_5_1") Integer InputName_4_5_1

	);

	@GET
	@POST
	@PUT
	@DELETE
	@Path("/CapabilityName_4_1/{InputName_4_1_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_1(

	@PathParam("InputName_4_1_1") String InputName_4_1_1

	);

}
