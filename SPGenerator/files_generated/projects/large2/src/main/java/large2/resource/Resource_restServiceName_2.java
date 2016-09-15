package large2.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import large2.output.OutputDataClassName_2_4;
import large2.output.OutputDataClassName_2_5;
import large2.output.OutputDataClassName_2_6;
import large2.output.OutputDataClassName_2_1;
import large2.output.OutputDataClassName_2_2;
import large2.output.OutputDataClassName_2_3;

@Path("ServiceName_2")
public interface Resource_restServiceName_2 {

	@GET
	@Path("/CapabilityName_2_4/{InputName_2_4_1}/{InputName_2_4_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_4(

	@PathParam("InputName_2_4_1") Float InputName_2_4_1

	, @PathParam("InputName_2_4_2") Float InputName_2_4_2

	);

	@GET
	@Path("/CapabilityName_2_5/{InputName_2_5_1}/{InputName_2_5_2}/{InputName_2_5_3}/{InputName_2_5_4}/{InputName_2_5_5}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_5(

	@PathParam("InputName_2_5_1") Integer InputName_2_5_1

	, @PathParam("InputName_2_5_2") Float InputName_2_5_2

	, @PathParam("InputName_2_5_3") Float InputName_2_5_3

	, @PathParam("InputName_2_5_4") Float InputName_2_5_4

	, @PathParam("InputName_2_5_5") Float InputName_2_5_5

	);

	@GET
	@Path("/CapabilityName_2_6/{InputName_2_6_1}/{InputName_2_6_2}/{InputName_2_6_3}/{InputName_2_6_4}/{InputName_2_6_5}/{InputName_2_6_6}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_6(

	@PathParam("InputName_2_6_1") Integer InputName_2_6_1

	, @PathParam("InputName_2_6_2") String InputName_2_6_2

	, @PathParam("InputName_2_6_3") String InputName_2_6_3

	, @PathParam("InputName_2_6_4") String InputName_2_6_4

	, @PathParam("InputName_2_6_5") Integer InputName_2_6_5

	, @PathParam("InputName_2_6_6") String InputName_2_6_6

	);

	@GET
	@Path("/CapabilityName_2_1/{InputName_2_1_1}/{InputName_2_1_2}/{InputName_2_1_3}/{InputName_2_1_4}/{InputName_2_1_5}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_1(

	@PathParam("InputName_2_1_1") String InputName_2_1_1

	, @PathParam("InputName_2_1_2") Integer InputName_2_1_2

	, @PathParam("InputName_2_1_3") Integer InputName_2_1_3

	, @PathParam("InputName_2_1_4") Float InputName_2_1_4

	, @PathParam("InputName_2_1_5") Float InputName_2_1_5

	);

	@GET
	@Path("/CapabilityName_2_2/{InputName_2_2_1}/{InputName_2_2_2}/{InputName_2_2_3}/{InputName_2_2_4}/{InputName_2_2_5}/{InputName_2_2_6}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_2(

	@PathParam("InputName_2_2_1") Integer InputName_2_2_1

	, @PathParam("InputName_2_2_2") Float InputName_2_2_2

	, @PathParam("InputName_2_2_3") Float InputName_2_2_3

	, @PathParam("InputName_2_2_4") Float InputName_2_2_4

	, @PathParam("InputName_2_2_5") Integer InputName_2_2_5

	, @PathParam("InputName_2_2_6") Float InputName_2_2_6

	);

	@GET
	@Path("/CapabilityName_2_3/{InputName_2_3_1}/{InputName_2_3_2}/{InputName_2_3_3}/{InputName_2_3_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_3(

	@PathParam("InputName_2_3_1") Integer InputName_2_3_1

	, @PathParam("InputName_2_3_2") Integer InputName_2_3_2

	, @PathParam("InputName_2_3_3") Float InputName_2_3_3

	, @PathParam("InputName_2_3_4") Integer InputName_2_3_4

	);

}
