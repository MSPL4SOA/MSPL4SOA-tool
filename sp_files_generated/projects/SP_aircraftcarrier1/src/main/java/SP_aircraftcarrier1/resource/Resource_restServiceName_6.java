package SP_aircraftcarrier1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_aircraftcarrier1.output.OutputDataClassName_6_4;
import SP_aircraftcarrier1.output.OutputDataClassName_6_5;
import SP_aircraftcarrier1.output.OutputDataClassName_6_6;
import SP_aircraftcarrier1.output.OutputDataClassName_6_7;
import SP_aircraftcarrier1.output.OutputDataClassName_6_2;
import SP_aircraftcarrier1.output.OutputDataClassName_6_3;
import SP_aircraftcarrier1.output.OutputDataClassName_6_8;

@Path("ServiceName_6")
public interface Resource_restServiceName_6 {

	@POST
	@Path("/CapabilityName_6_4/{InputName_6_4_1}/{InputName_6_4_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_4(

	@PathParam("InputName_6_4_1") String InputName_6_4_1

	, @PathParam("InputName_6_4_2") Float InputName_6_4_2

	);

	@POST
	@Path("/CapabilityName_6_5/{InputName_6_5_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_5(

	@PathParam("InputName_6_5_1") Integer InputName_6_5_1

	);

	@POST
	@Path("/CapabilityName_6_6/{InputName_6_6_1}/{InputName_6_6_2}/{InputName_6_6_3}/{InputName_6_6_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_6(

	@PathParam("InputName_6_6_1") Float InputName_6_6_1

	, @PathParam("InputName_6_6_2") Integer InputName_6_6_2

	, @PathParam("InputName_6_6_3") String InputName_6_6_3

	, @PathParam("InputName_6_6_4") Float InputName_6_6_4

	);

	@GET
	@Path("/CapabilityName_6_7/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_7(

	);

	@POST
	@Path("/CapabilityName_6_1/{InputName_6_1_2}/{InputName_6_1_3}/{InputName_6_1_4}/{InputName_6_1_5}/{InputName_6_1_6}/{InputName_6_1_1}/")
	@Produces({ "text/xml" })
	public void CapabilityName_6_1(

	@PathParam("InputName_6_1_2") Float InputName_6_1_2

	, @PathParam("InputName_6_1_3") Integer InputName_6_1_3

	, @PathParam("InputName_6_1_4") Float InputName_6_1_4

	, @PathParam("InputName_6_1_5") String InputName_6_1_5

	, @PathParam("InputName_6_1_6") Float InputName_6_1_6

	, @PathParam("InputName_6_1_1") Float InputName_6_1_1

	);

	@GET
	@Path("/CapabilityName_6_2/{InputName_6_2_1}/{InputName_6_2_2}/{InputName_6_2_3}/{InputName_6_2_4}/{InputName_6_2_5}/{InputName_6_2_6}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_2(

	@PathParam("InputName_6_2_1") Integer InputName_6_2_1

	, @PathParam("InputName_6_2_2") String InputName_6_2_2

	, @PathParam("InputName_6_2_3") String InputName_6_2_3

	, @PathParam("InputName_6_2_4") Integer InputName_6_2_4

	, @PathParam("InputName_6_2_5") Float InputName_6_2_5

	, @PathParam("InputName_6_2_6") String InputName_6_2_6

	);

	@GET
	@Path("/CapabilityName_6_3/{InputName_6_3_8}/{InputName_6_3_1}/{InputName_6_3_2}/{InputName_6_3_3}/{InputName_6_3_4}/{InputName_6_3_5}/{InputName_6_3_6}/{InputName_6_3_7}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_3(

	@PathParam("InputName_6_3_8") String InputName_6_3_8

	, @PathParam("InputName_6_3_1") Integer InputName_6_3_1

	, @PathParam("InputName_6_3_2") String InputName_6_3_2

	, @PathParam("InputName_6_3_3") Integer InputName_6_3_3

	, @PathParam("InputName_6_3_4") Integer InputName_6_3_4

	, @PathParam("InputName_6_3_5") Float InputName_6_3_5

	, @PathParam("InputName_6_3_6") Integer InputName_6_3_6

	, @PathParam("InputName_6_3_7") Integer InputName_6_3_7

	);

	@GET
	@Path("/CapabilityName_6_8/{InputName_6_8_3}/{InputName_6_8_4}/{InputName_6_8_5}/{InputName_6_8_6}/{InputName_6_8_7}/{InputName_6_8_1}/{InputName_6_8_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_6_8(

	@PathParam("InputName_6_8_3") String InputName_6_8_3

	, @PathParam("InputName_6_8_4") String InputName_6_8_4

	, @PathParam("InputName_6_8_5") Float InputName_6_8_5

	, @PathParam("InputName_6_8_6") String InputName_6_8_6

	, @PathParam("InputName_6_8_7") Float InputName_6_8_7

	, @PathParam("InputName_6_8_1") Integer InputName_6_8_1

	, @PathParam("InputName_6_8_2") Float InputName_6_8_2

	);

}
