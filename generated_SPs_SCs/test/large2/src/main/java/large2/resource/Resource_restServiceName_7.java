package large2.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import large2.output.OutputDataClassName_7_3;
import large2.output.OutputDataClassName_7_4;
import large2.output.OutputDataClassName_7_1;
import large2.output.OutputDataClassName_7_2;

@Path("ServiceName_7")
public interface Resource_restServiceName_7 {

	@GET
	@Path("/CapabilityName_7_3/{InputName_7_3_5}/{InputName_7_3_6}/{InputName_7_3_3}/{InputName_7_3_4}/{InputName_7_3_1}/{InputName_7_3_2}/{InputName_7_3_9}/{InputName_7_3_7}/{InputName_7_3_8}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_7_3(

	@PathParam("InputName_7_3_5") Integer InputName_7_3_5

	, @PathParam("InputName_7_3_6") Float InputName_7_3_6

	, @PathParam("InputName_7_3_3") Integer InputName_7_3_3

	, @PathParam("InputName_7_3_4") String InputName_7_3_4

	, @PathParam("InputName_7_3_1") Float InputName_7_3_1

	, @PathParam("InputName_7_3_2") String InputName_7_3_2

	, @PathParam("InputName_7_3_9") String InputName_7_3_9

	, @PathParam("InputName_7_3_7") Integer InputName_7_3_7

	, @PathParam("InputName_7_3_8") Integer InputName_7_3_8

	);

	@GET
	@Path("/CapabilityName_7_4/{InputName_7_4_4}/{InputName_7_4_5}/{InputName_7_4_2}/{InputName_7_4_3}/{InputName_7_4_1}/{InputName_7_4_6}/{InputName_7_4_7}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_7_4(

	@PathParam("InputName_7_4_4") String InputName_7_4_4

	, @PathParam("InputName_7_4_5") String InputName_7_4_5

	, @PathParam("InputName_7_4_2") Float InputName_7_4_2

	, @PathParam("InputName_7_4_3") String InputName_7_4_3

	, @PathParam("InputName_7_4_1") String InputName_7_4_1

	, @PathParam("InputName_7_4_6") String InputName_7_4_6

	, @PathParam("InputName_7_4_7") Float InputName_7_4_7

	);

	@POST
	@Path("/CapabilityName_7_5/")
	@Produces({ "text/xml" })
	public void CapabilityName_7_5(

	);

	@POST
	@Path("/CapabilityName_7_6/")
	@Produces({ "text/xml" })
	public void CapabilityName_7_6(

	);

	@GET
	@Path("/CapabilityName_7_1/{InputName_7_1_7}/{InputName_7_1_5}/{InputName_7_1_6}/{InputName_7_1_3}/{InputName_7_1_4}/{InputName_7_1_1}/{InputName_7_1_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_7_1(

	@PathParam("InputName_7_1_7") Float InputName_7_1_7

	, @PathParam("InputName_7_1_5") String InputName_7_1_5

	, @PathParam("InputName_7_1_6") Float InputName_7_1_6

	, @PathParam("InputName_7_1_3") String InputName_7_1_3

	, @PathParam("InputName_7_1_4") Integer InputName_7_1_4

	, @PathParam("InputName_7_1_1") Float InputName_7_1_1

	, @PathParam("InputName_7_1_2") Float InputName_7_1_2

	);

	@GET
	@Path("/CapabilityName_7_2/{InputName_7_2_6}/{InputName_7_2_7}/{InputName_7_2_4}/{InputName_7_2_5}/{InputName_7_2_2}/{InputName_7_2_3}/{InputName_7_2_1}/{InputName_7_2_8}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_7_2(

	@PathParam("InputName_7_2_6") String InputName_7_2_6

	, @PathParam("InputName_7_2_7") Float InputName_7_2_7

	, @PathParam("InputName_7_2_4") Float InputName_7_2_4

	, @PathParam("InputName_7_2_5") Integer InputName_7_2_5

	, @PathParam("InputName_7_2_2") String InputName_7_2_2

	, @PathParam("InputName_7_2_3") Float InputName_7_2_3

	, @PathParam("InputName_7_2_1") String InputName_7_2_1

	, @PathParam("InputName_7_2_8") Integer InputName_7_2_8

	);

}
