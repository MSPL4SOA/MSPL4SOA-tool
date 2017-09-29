package large3.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import large3.output.OutputDataClassName_6_4;
import large3.output.OutputDataClassName_6_5;
import large3.output.OutputDataClassName_6_6;
import large3.output.OutputDataClassName_6_1;
import large3.output.OutputDataClassName_6_2;
import large3.output.OutputDataClassName_6_3;

@Path("ServiceName_6")
public interface Resource_restServiceName_6 {

	@GET
	@Path("/CapabilityName_6_4/{InputName_6_4_1}/{InputName_6_4_2}/{InputName_6_4_3}/{InputName_6_4_4}/{InputName_6_4_5}/{InputName_6_4_6}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_4(

	@PathParam("InputName_6_4_1") Float InputName_6_4_1

	, @PathParam("InputName_6_4_2") String InputName_6_4_2

	, @PathParam("InputName_6_4_3") Integer InputName_6_4_3

	, @PathParam("InputName_6_4_4") Integer InputName_6_4_4

	, @PathParam("InputName_6_4_5") Float InputName_6_4_5

	, @PathParam("InputName_6_4_6") Integer InputName_6_4_6

	);

	@GET
	@Path("/CapabilityName_6_5/{InputName_6_5_1}/{InputName_6_5_2}/{InputName_6_5_3}/{InputName_6_5_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_5(

	@PathParam("InputName_6_5_1") Integer InputName_6_5_1

	, @PathParam("InputName_6_5_2") Integer InputName_6_5_2

	, @PathParam("InputName_6_5_3") String InputName_6_5_3

	, @PathParam("InputName_6_5_4") String InputName_6_5_4

	);

	@GET
	@Path("/CapabilityName_6_6/{InputName_6_6_1}/{InputName_6_6_2}/{InputName_6_6_3}/{InputName_6_6_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_6(

	@PathParam("InputName_6_6_1") String InputName_6_6_1

	, @PathParam("InputName_6_6_2") Integer InputName_6_6_2

	, @PathParam("InputName_6_6_3") Integer InputName_6_6_3

	, @PathParam("InputName_6_6_4") Float InputName_6_6_4

	);

	@GET
	@Path("/CapabilityName_6_1/{InputName_6_1_2}/{InputName_6_1_3}/{InputName_6_1_4}/{InputName_6_1_5}/{InputName_6_1_6}/{InputName_6_1_7}/{InputName_6_1_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_1(

	@PathParam("InputName_6_1_2") Float InputName_6_1_2

	, @PathParam("InputName_6_1_3") Float InputName_6_1_3

	, @PathParam("InputName_6_1_4") String InputName_6_1_4

	, @PathParam("InputName_6_1_5") Float InputName_6_1_5

	, @PathParam("InputName_6_1_6") Integer InputName_6_1_6

	, @PathParam("InputName_6_1_7") Float InputName_6_1_7

	, @PathParam("InputName_6_1_1") Float InputName_6_1_1

	);

	@GET
	@Path("/CapabilityName_6_2/{InputName_6_2_1}/{InputName_6_2_2}/{InputName_6_2_3}/{InputName_6_2_4}/{InputName_6_2_5}/{InputName_6_2_6}/{InputName_6_2_7}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_2(

	@PathParam("InputName_6_2_1") Float InputName_6_2_1

	, @PathParam("InputName_6_2_2") Float InputName_6_2_2

	, @PathParam("InputName_6_2_3") Integer InputName_6_2_3

	, @PathParam("InputName_6_2_4") String InputName_6_2_4

	, @PathParam("InputName_6_2_5") String InputName_6_2_5

	, @PathParam("InputName_6_2_6") String InputName_6_2_6

	, @PathParam("InputName_6_2_7") Integer InputName_6_2_7

	);

	@GET
	@Path("/CapabilityName_6_3/{InputName_6_3_1}/{InputName_6_3_2}/{InputName_6_3_3}/{InputName_6_3_4}/{InputName_6_3_5}/{InputName_6_3_6}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_3(

	@PathParam("InputName_6_3_1") Integer InputName_6_3_1

	, @PathParam("InputName_6_3_2") String InputName_6_3_2

	, @PathParam("InputName_6_3_3") Float InputName_6_3_3

	, @PathParam("InputName_6_3_4") Float InputName_6_3_4

	, @PathParam("InputName_6_3_5") Integer InputName_6_3_5

	, @PathParam("InputName_6_3_6") Float InputName_6_3_6

	);

}
