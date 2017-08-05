package test.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import test.output.OutputDataClassName_3_4;
import test.output.OutputDataClassName_3_5;
import test.output.OutputDataClassName_3_6;
import test.output.OutputDataClassName_3_1;
import test.output.OutputDataClassName_3_2;

@Path("ServiceName_3")
public interface Resource_restServiceName_3 {

	@POST
	@Path("/CapabilityName_3_3/{InputName_3_3_1}/{InputName_3_3_2}/{InputName_3_3_5}/{InputName_3_3_6}/{InputName_3_3_3}/{InputName_3_3_4}/")
	@Produces({ "text/xml" })
	public void CapabilityName_3_3(

	@PathParam("InputName_3_3_1") Float InputName_3_3_1

	, @PathParam("InputName_3_3_2") Float InputName_3_3_2

	, @PathParam("InputName_3_3_5") String InputName_3_3_5

	, @PathParam("InputName_3_3_6") Integer InputName_3_3_6

	, @PathParam("InputName_3_3_3") Float InputName_3_3_3

	, @PathParam("InputName_3_3_4") Integer InputName_3_3_4

	);

	@GET
	@Path("/CapabilityName_3_4/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_4(

	);

	@GET
	@Path("/CapabilityName_3_5/{InputName_3_5_9}/{InputName_3_5_7}/{InputName_3_5_8}/{InputName_3_5_5}/{InputName_3_5_6}/{InputName_3_5_3}/{InputName_3_5_4}/{InputName_3_5_1}/{InputName_3_5_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_5(

	@PathParam("InputName_3_5_9") String InputName_3_5_9

	, @PathParam("InputName_3_5_7") Float InputName_3_5_7

	, @PathParam("InputName_3_5_8") Float InputName_3_5_8

	, @PathParam("InputName_3_5_5") Integer InputName_3_5_5

	, @PathParam("InputName_3_5_6") Float InputName_3_5_6

	, @PathParam("InputName_3_5_3") Integer InputName_3_5_3

	, @PathParam("InputName_3_5_4") Float InputName_3_5_4

	, @PathParam("InputName_3_5_1") String InputName_3_5_1

	, @PathParam("InputName_3_5_2") String InputName_3_5_2

	);

	@GET
	@Path("/CapabilityName_3_6/{InputName_3_6_6}/{InputName_3_6_7}/{InputName_3_6_4}/{InputName_3_6_5}/{InputName_3_6_2}/{InputName_3_6_3}/{InputName_3_6_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_6(

	@PathParam("InputName_3_6_6") Float InputName_3_6_6

	, @PathParam("InputName_3_6_7") Float InputName_3_6_7

	, @PathParam("InputName_3_6_4") String InputName_3_6_4

	, @PathParam("InputName_3_6_5") Integer InputName_3_6_5

	, @PathParam("InputName_3_6_2") String InputName_3_6_2

	, @PathParam("InputName_3_6_3") Float InputName_3_6_3

	, @PathParam("InputName_3_6_1") String InputName_3_6_1

	);

	@GET
	@Path("/CapabilityName_3_1/{InputName_3_1_3}/{InputName_3_1_4}/{InputName_3_1_1}/{InputName_3_1_2}/{InputName_3_1_5}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_1(

	@PathParam("InputName_3_1_3") String InputName_3_1_3

	, @PathParam("InputName_3_1_4") Float InputName_3_1_4

	, @PathParam("InputName_3_1_1") String InputName_3_1_1

	, @PathParam("InputName_3_1_2") String InputName_3_1_2

	, @PathParam("InputName_3_1_5") Float InputName_3_1_5

	);

	@POST
	@Path("/CapabilityName_3_2/{InputName_3_2_2}/{InputName_3_2_3}/{InputName_3_2_1}/{InputName_3_2_8}/{InputName_3_2_9}/{InputName_3_2_6}/{InputName_3_2_7}/{InputName_3_2_4}/{InputName_3_2_5}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_2(

	@PathParam("InputName_3_2_2") Float InputName_3_2_2

	, @PathParam("InputName_3_2_3") Integer InputName_3_2_3

	, @PathParam("InputName_3_2_1") String InputName_3_2_1

	, @PathParam("InputName_3_2_8") String InputName_3_2_8

	, @PathParam("InputName_3_2_9") String InputName_3_2_9

	, @PathParam("InputName_3_2_6") Integer InputName_3_2_6

	, @PathParam("InputName_3_2_7") Integer InputName_3_2_7

	, @PathParam("InputName_3_2_4") Float InputName_3_2_4

	, @PathParam("InputName_3_2_5") Integer InputName_3_2_5

	);

}
