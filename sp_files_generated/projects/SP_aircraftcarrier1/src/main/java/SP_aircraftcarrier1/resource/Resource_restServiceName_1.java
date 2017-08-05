package SP_aircraftcarrier1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_aircraftcarrier1.output.OutputDataClassName_1_5;
import SP_aircraftcarrier1.output.OutputDataClassName_1_1;
import SP_aircraftcarrier1.output.OutputDataClassName_1_2;
import SP_aircraftcarrier1.output.OutputDataClassName_1_3;
import SP_aircraftcarrier1.output.OutputDataClassName_1_4;

@Path("ServiceName_1")
public interface Resource_restServiceName_1 {

	@GET
	@Path("/CapabilityName_1_5/{InputName_1_5_5}/{InputName_1_5_6}/{InputName_1_5_3}/{InputName_1_5_4}/{InputName_1_5_9}/{InputName_1_5_7}/{InputName_1_5_8}/{InputName_1_5_1}/{InputName_1_5_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_5(

	@PathParam("InputName_1_5_5") Integer InputName_1_5_5

	, @PathParam("InputName_1_5_6") Float InputName_1_5_6

	, @PathParam("InputName_1_5_3") Integer InputName_1_5_3

	, @PathParam("InputName_1_5_4") Float InputName_1_5_4

	, @PathParam("InputName_1_5_9") Float InputName_1_5_9

	, @PathParam("InputName_1_5_7") String InputName_1_5_7

	, @PathParam("InputName_1_5_8") Integer InputName_1_5_8

	, @PathParam("InputName_1_5_1") String InputName_1_5_1

	, @PathParam("InputName_1_5_2") Float InputName_1_5_2

	);

	@POST
	@Path("/CapabilityName_1_1/{InputName_1_1_1}/{InputName_1_1_2}/{InputName_1_1_5}/{InputName_1_1_6}/{InputName_1_1_3}/{InputName_1_1_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_1(

	@PathParam("InputName_1_1_1") Integer InputName_1_1_1

	, @PathParam("InputName_1_1_2") Integer InputName_1_1_2

	, @PathParam("InputName_1_1_5") Integer InputName_1_1_5

	, @PathParam("InputName_1_1_6") String InputName_1_1_6

	, @PathParam("InputName_1_1_3") Integer InputName_1_1_3

	, @PathParam("InputName_1_1_4") String InputName_1_1_4

	);

	@POST
	@Path("/CapabilityName_1_2/{InputName_1_2_1}/{InputName_1_2_2}/{InputName_1_2_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_2(

	@PathParam("InputName_1_2_1") Float InputName_1_2_1

	, @PathParam("InputName_1_2_2") String InputName_1_2_2

	, @PathParam("InputName_1_2_3") Integer InputName_1_2_3

	);

	@GET
	@Path("/CapabilityName_1_3/{InputName_1_3_7}/{InputName_1_3_8}/{InputName_1_3_5}/{InputName_1_3_6}/{InputName_1_3_3}/{InputName_1_3_4}/{InputName_1_3_1}/{InputName_1_3_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_3(

	@PathParam("InputName_1_3_7") String InputName_1_3_7

	, @PathParam("InputName_1_3_8") String InputName_1_3_8

	, @PathParam("InputName_1_3_5") Integer InputName_1_3_5

	, @PathParam("InputName_1_3_6") Float InputName_1_3_6

	, @PathParam("InputName_1_3_3") Integer InputName_1_3_3

	, @PathParam("InputName_1_3_4") Integer InputName_1_3_4

	, @PathParam("InputName_1_3_1") Float InputName_1_3_1

	, @PathParam("InputName_1_3_2") String InputName_1_3_2

	);

	@GET
	@Path("/CapabilityName_1_4/{InputName_1_4_6}/{InputName_1_4_7}/{InputName_1_4_4}/{InputName_1_4_5}/{InputName_1_4_2}/{InputName_1_4_3}/{InputName_1_4_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_4(

	@PathParam("InputName_1_4_6") Float InputName_1_4_6

	, @PathParam("InputName_1_4_7") String InputName_1_4_7

	, @PathParam("InputName_1_4_4") Integer InputName_1_4_4

	, @PathParam("InputName_1_4_5") Float InputName_1_4_5

	, @PathParam("InputName_1_4_2") Integer InputName_1_4_2

	, @PathParam("InputName_1_4_3") String InputName_1_4_3

	, @PathParam("InputName_1_4_1") String InputName_1_4_1

	);

}
