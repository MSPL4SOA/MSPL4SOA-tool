package sync8.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import sync8.output.OutputDataClassName_6_4;
import sync8.output.OutputDataClassName_6_1;
import sync8.output.OutputDataClassName_6_2;

@Path("ServiceName_6")
public interface Resource_restServiceName_6 {

	@GET
	@Path("/CapabilityName_6_4/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_4(

	);

	@POST
	@Path("/CapabilityName_6_5/{InputName_6_5_1}/{InputName_6_5_2}/")
	@Produces({ "text/xml" })
	public void CapabilityName_6_5(

	@PathParam("InputName_6_5_1") String InputName_6_5_1

	, @PathParam("InputName_6_5_2") Float InputName_6_5_2

	);

	@POST
	@Path("/CapabilityName_6_6/")
	@Produces({ "text/xml" })
	public void CapabilityName_6_6(

	);

	@GET
	@Path("/CapabilityName_6_1/{InputName_6_1_2}/{InputName_6_1_3}/{InputName_6_1_4}/{InputName_6_1_5}/{InputName_6_1_6}/{InputName_6_1_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_1(

	@PathParam("InputName_6_1_2") Integer InputName_6_1_2

	, @PathParam("InputName_6_1_3") Float InputName_6_1_3

	, @PathParam("InputName_6_1_4") Float InputName_6_1_4

	, @PathParam("InputName_6_1_5") Float InputName_6_1_5

	, @PathParam("InputName_6_1_6") Integer InputName_6_1_6

	, @PathParam("InputName_6_1_1") Integer InputName_6_1_1

	);

	@GET
	@Path("/CapabilityName_6_2/{InputName_6_2_1}/{InputName_6_2_2}/{InputName_6_2_3}/{InputName_6_2_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_2(

	@PathParam("InputName_6_2_1") String InputName_6_2_1

	, @PathParam("InputName_6_2_2") Integer InputName_6_2_2

	, @PathParam("InputName_6_2_3") String InputName_6_2_3

	, @PathParam("InputName_6_2_4") Float InputName_6_2_4

	);

	@POST
	@Path("/CapabilityName_6_3/{InputName_6_3_1}/{InputName_6_3_2}/")
	@Produces({ "text/xml" })
	public void CapabilityName_6_3(

	@PathParam("InputName_6_3_1") Integer InputName_6_3_1

	, @PathParam("InputName_6_3_2") String InputName_6_3_2

	);

}
