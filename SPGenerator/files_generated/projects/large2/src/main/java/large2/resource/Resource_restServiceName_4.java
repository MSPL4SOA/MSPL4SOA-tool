package large2.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import large2.output.OutputDataClassName_4_6;
import large2.output.OutputDataClassName_4_2;
import large2.output.OutputDataClassName_4_3;
import large2.output.OutputDataClassName_4_4;
import large2.output.OutputDataClassName_4_5;
import large2.output.OutputDataClassName_4_1;

@Path("ServiceName_4")
public interface Resource_restServiceName_4 {

	@GET
	@Path("/CapabilityName_4_6/{InputName_4_6_3}/{InputName_4_6_4}/{InputName_4_6_5}/{InputName_4_6_1}/{InputName_4_6_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_6(

	@PathParam("InputName_4_6_3") String InputName_4_6_3

	, @PathParam("InputName_4_6_4") Float InputName_4_6_4

	, @PathParam("InputName_4_6_5") Integer InputName_4_6_5

	, @PathParam("InputName_4_6_1") Integer InputName_4_6_1

	, @PathParam("InputName_4_6_2") Integer InputName_4_6_2

	);

	@GET
	@Path("/CapabilityName_4_2/{InputName_4_2_3}/{InputName_4_2_4}/{InputName_4_2_5}/{InputName_4_2_6}/{InputName_4_2_1}/{InputName_4_2_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_2(

	@PathParam("InputName_4_2_3") String InputName_4_2_3

	, @PathParam("InputName_4_2_4") Float InputName_4_2_4

	, @PathParam("InputName_4_2_5") String InputName_4_2_5

	, @PathParam("InputName_4_2_6") Float InputName_4_2_6

	, @PathParam("InputName_4_2_1") Integer InputName_4_2_1

	, @PathParam("InputName_4_2_2") Integer InputName_4_2_2

	);

	@GET
	@Path("/CapabilityName_4_3/{InputName_4_3_6}/{InputName_4_3_2}/{InputName_4_3_3}/{InputName_4_3_4}/{InputName_4_3_5}/{InputName_4_3_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_3(

	@PathParam("InputName_4_3_6") Integer InputName_4_3_6

	, @PathParam("InputName_4_3_2") String InputName_4_3_2

	, @PathParam("InputName_4_3_3") Integer InputName_4_3_3

	, @PathParam("InputName_4_3_4") String InputName_4_3_4

	, @PathParam("InputName_4_3_5") Float InputName_4_3_5

	, @PathParam("InputName_4_3_1") String InputName_4_3_1

	);

	@GET
	@Path("/CapabilityName_4_4/{InputName_4_4_5}/{InputName_4_4_6}/{InputName_4_4_1}/{InputName_4_4_2}/{InputName_4_4_3}/{InputName_4_4_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_4(

	@PathParam("InputName_4_4_5") Float InputName_4_4_5

	, @PathParam("InputName_4_4_6") Integer InputName_4_4_6

	, @PathParam("InputName_4_4_1") Float InputName_4_4_1

	, @PathParam("InputName_4_4_2") Float InputName_4_4_2

	, @PathParam("InputName_4_4_3") String InputName_4_4_3

	, @PathParam("InputName_4_4_4") String InputName_4_4_4

	);

	@GET
	@Path("/CapabilityName_4_5/{InputName_4_5_4}/{InputName_4_5_5}/{InputName_4_5_6}/{InputName_4_5_7}/{InputName_4_5_1}/{InputName_4_5_2}/{InputName_4_5_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_5(

	@PathParam("InputName_4_5_4") Float InputName_4_5_4

	, @PathParam("InputName_4_5_5") String InputName_4_5_5

	, @PathParam("InputName_4_5_6") Integer InputName_4_5_6

	, @PathParam("InputName_4_5_7") Float InputName_4_5_7

	, @PathParam("InputName_4_5_1") Float InputName_4_5_1

	, @PathParam("InputName_4_5_2") String InputName_4_5_2

	, @PathParam("InputName_4_5_3") String InputName_4_5_3

	);

	@GET
	@Path("/CapabilityName_4_1/{InputName_4_1_4}/{InputName_4_1_5}/{InputName_4_1_6}/{InputName_4_1_1}/{InputName_4_1_2}/{InputName_4_1_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_1(

	@PathParam("InputName_4_1_4") String InputName_4_1_4

	, @PathParam("InputName_4_1_5") Integer InputName_4_1_5

	, @PathParam("InputName_4_1_6") Float InputName_4_1_6

	, @PathParam("InputName_4_1_1") Integer InputName_4_1_1

	, @PathParam("InputName_4_1_2") Integer InputName_4_1_2

	, @PathParam("InputName_4_1_3") Float InputName_4_1_3

	);

}
