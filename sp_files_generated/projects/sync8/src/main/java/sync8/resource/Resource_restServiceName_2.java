package sync8.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import sync8.output.OutputDataClassName_2_4;
import sync8.output.OutputDataClassName_2_5;
import sync8.output.OutputDataClassName_2_6;
import sync8.output.OutputDataClassName_2_1;
import sync8.output.OutputDataClassName_2_2;
import sync8.output.OutputDataClassName_2_3;

@Path("ServiceName_2")
public interface Resource_restServiceName_2 {

	@GET
	@Path("/CapabilityName_2_4/{InputName_2_4_1}/{InputName_2_4_2}/{InputName_2_4_3}/{InputName_2_4_4}/{InputName_2_4_5}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_4(

	@PathParam("InputName_2_4_1") Integer InputName_2_4_1

	, @PathParam("InputName_2_4_2") Integer InputName_2_4_2

	, @PathParam("InputName_2_4_3") Float InputName_2_4_3

	, @PathParam("InputName_2_4_4") Integer InputName_2_4_4

	, @PathParam("InputName_2_4_5") Integer InputName_2_4_5

	);

	@GET
	@Path("/CapabilityName_2_5/{InputName_2_5_1}/{InputName_2_5_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_5(

	@PathParam("InputName_2_5_1") Float InputName_2_5_1

	, @PathParam("InputName_2_5_2") String InputName_2_5_2

	);

	@GET
	@Path("/CapabilityName_2_6/{InputName_2_6_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_6(

	@PathParam("InputName_2_6_1") String InputName_2_6_1

	);

	@GET
	@Path("/CapabilityName_2_1/{InputName_2_1_1}/{InputName_2_1_2}/{InputName_2_1_3}/{InputName_2_1_4}/{InputName_2_1_5}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_1(

	@PathParam("InputName_2_1_1") String InputName_2_1_1

	, @PathParam("InputName_2_1_2") Float InputName_2_1_2

	, @PathParam("InputName_2_1_3") Float InputName_2_1_3

	, @PathParam("InputName_2_1_4") Float InputName_2_1_4

	, @PathParam("InputName_2_1_5") String InputName_2_1_5

	);

	@GET
	@Path("/CapabilityName_2_2/{InputName_2_2_1}/{InputName_2_2_2}/{InputName_2_2_3}/{InputName_2_2_4}/{InputName_2_2_5}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_2(

	@PathParam("InputName_2_2_1") Integer InputName_2_2_1

	, @PathParam("InputName_2_2_2") Float InputName_2_2_2

	, @PathParam("InputName_2_2_3") Integer InputName_2_2_3

	, @PathParam("InputName_2_2_4") Float InputName_2_2_4

	, @PathParam("InputName_2_2_5") Float InputName_2_2_5

	);

	@GET
	@Path("/CapabilityName_2_3/{InputName_2_3_1}/{InputName_2_3_2}/{InputName_2_3_3}/{InputName_2_3_4}/{InputName_2_3_5}/{InputName_2_3_6}/{InputName_2_3_7}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_3(

	@PathParam("InputName_2_3_1") Integer InputName_2_3_1

	, @PathParam("InputName_2_3_2") Float InputName_2_3_2

	, @PathParam("InputName_2_3_3") Float InputName_2_3_3

	, @PathParam("InputName_2_3_4") Float InputName_2_3_4

	, @PathParam("InputName_2_3_5") Integer InputName_2_3_5

	, @PathParam("InputName_2_3_6") String InputName_2_3_6

	, @PathParam("InputName_2_3_7") Float InputName_2_3_7

	);

}
