package SP_aircraftcarrier1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_aircraftcarrier1.output.OutputDataClassName_4_2;
import SP_aircraftcarrier1.output.OutputDataClassName_4_3;
import SP_aircraftcarrier1.output.OutputDataClassName_4_4;
import SP_aircraftcarrier1.output.OutputDataClassName_4_1;

@Path("ServiceName_4")
public interface Resource_restServiceName_4 {

	@POST
	@Path("/CapabilityName_4_2/{InputName_4_2_1}/{InputName_4_2_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_2(

	@PathParam("InputName_4_2_1") String InputName_4_2_1

	, @PathParam("InputName_4_2_2") Float InputName_4_2_2

	);

	@POST
	@Path("/CapabilityName_4_3/{InputName_4_3_6}/{InputName_4_3_7}/{InputName_4_3_8}/{InputName_4_3_9}/{InputName_4_3_2}/{InputName_4_3_3}/{InputName_4_3_4}/{InputName_4_3_5}/{InputName_4_3_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_3(

	@PathParam("InputName_4_3_6") Float InputName_4_3_6

	, @PathParam("InputName_4_3_7") String InputName_4_3_7

	, @PathParam("InputName_4_3_8") Float InputName_4_3_8

	, @PathParam("InputName_4_3_9") Float InputName_4_3_9

	, @PathParam("InputName_4_3_2") Float InputName_4_3_2

	, @PathParam("InputName_4_3_3") String InputName_4_3_3

	, @PathParam("InputName_4_3_4") Integer InputName_4_3_4

	, @PathParam("InputName_4_3_5") Float InputName_4_3_5

	, @PathParam("InputName_4_3_1") Integer InputName_4_3_1

	);

	@GET
	@Path("/CapabilityName_4_4/{InputName_4_4_1}/{InputName_4_4_2}/{InputName_4_4_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_4(

	@PathParam("InputName_4_4_1") Integer InputName_4_4_1

	, @PathParam("InputName_4_4_2") Integer InputName_4_4_2

	, @PathParam("InputName_4_4_3") Float InputName_4_4_3

	);

	@POST
	@Path("/CapabilityName_4_5/{InputName_4_5_4}/{InputName_4_5_5}/{InputName_4_5_1}/{InputName_4_5_2}/{InputName_4_5_3}/")
	@Produces({ "text/xml" })
	public void CapabilityName_4_5(

	@PathParam("InputName_4_5_4") Float InputName_4_5_4

	, @PathParam("InputName_4_5_5") Float InputName_4_5_5

	, @PathParam("InputName_4_5_1") Float InputName_4_5_1

	, @PathParam("InputName_4_5_2") String InputName_4_5_2

	, @PathParam("InputName_4_5_3") Float InputName_4_5_3

	);

	@GET
	@Path("/CapabilityName_4_1/{InputName_4_1_8}/{InputName_4_1_4}/{InputName_4_1_5}/{InputName_4_1_6}/{InputName_4_1_7}/{InputName_4_1_1}/{InputName_4_1_2}/{InputName_4_1_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_1(

	@PathParam("InputName_4_1_8") Integer InputName_4_1_8

	, @PathParam("InputName_4_1_4") Float InputName_4_1_4

	, @PathParam("InputName_4_1_5") Integer InputName_4_1_5

	, @PathParam("InputName_4_1_6") String InputName_4_1_6

	, @PathParam("InputName_4_1_7") String InputName_4_1_7

	, @PathParam("InputName_4_1_1") String InputName_4_1_1

	, @PathParam("InputName_4_1_2") Float InputName_4_1_2

	, @PathParam("InputName_4_1_3") String InputName_4_1_3

	);

}
