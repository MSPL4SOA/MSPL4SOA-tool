package SP_aircraftcarrier1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_aircraftcarrier1.output.OutputDataClassName_3_3;
import SP_aircraftcarrier1.output.OutputDataClassName_3_4;

@Path("ServiceName_3")
public interface Resource_restServiceName_3 {

	@GET
	@Path("/CapabilityName_3_3/{InputName_3_3_1}/{InputName_3_3_2}/{InputName_3_3_5}/{InputName_3_3_6}/{InputName_3_3_3}/{InputName_3_3_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_3(

	@PathParam("InputName_3_3_1") Integer InputName_3_3_1

	, @PathParam("InputName_3_3_2") String InputName_3_3_2

	, @PathParam("InputName_3_3_5") String InputName_3_3_5

	, @PathParam("InputName_3_3_6") Integer InputName_3_3_6

	, @PathParam("InputName_3_3_3") String InputName_3_3_3

	, @PathParam("InputName_3_3_4") Float InputName_3_3_4

	);

	@GET
	@Path("/CapabilityName_3_4/{InputName_3_4_1}/{InputName_3_4_8}/{InputName_3_4_9}/{InputName_3_4_6}/{InputName_3_4_7}/{InputName_3_4_4}/{InputName_3_4_5}/{InputName_3_4_2}/{InputName_3_4_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_4(

	@PathParam("InputName_3_4_1") Integer InputName_3_4_1

	, @PathParam("InputName_3_4_8") String InputName_3_4_8

	, @PathParam("InputName_3_4_9") Integer InputName_3_4_9

	, @PathParam("InputName_3_4_6") Float InputName_3_4_6

	, @PathParam("InputName_3_4_7") Integer InputName_3_4_7

	, @PathParam("InputName_3_4_4") String InputName_3_4_4

	, @PathParam("InputName_3_4_5") String InputName_3_4_5

	, @PathParam("InputName_3_4_2") Float InputName_3_4_2

	, @PathParam("InputName_3_4_3") String InputName_3_4_3

	);

	@POST
	@Path("/CapabilityName_3_5/{InputName_3_5_1}/{InputName_3_5_2}/")
	@Produces({ "text/xml" })
	public void CapabilityName_3_5(

	@PathParam("InputName_3_5_1") Float InputName_3_5_1

	, @PathParam("InputName_3_5_2") Integer InputName_3_5_2

	);

	@POST
	@Path("/CapabilityName_3_6/")
	@Produces({ "text/xml" })
	public void CapabilityName_3_6(

	);

	@POST
	@Path("/CapabilityName_3_1/{InputName_3_1_3}/{InputName_3_1_4}/{InputName_3_1_1}/{InputName_3_1_2}/{InputName_3_1_5}/")
	@Produces({ "text/xml" })
	public void CapabilityName_3_1(

	@PathParam("InputName_3_1_3") Float InputName_3_1_3

	, @PathParam("InputName_3_1_4") String InputName_3_1_4

	, @PathParam("InputName_3_1_1") String InputName_3_1_1

	, @PathParam("InputName_3_1_2") String InputName_3_1_2

	, @PathParam("InputName_3_1_5") Float InputName_3_1_5

	);

	@POST
	@Path("/CapabilityName_3_2/{InputName_3_2_2}/{InputName_3_2_3}/{InputName_3_2_1}/{InputName_3_2_4}/{InputName_3_2_5}/")
	@Produces({ "text/xml" })
	public void CapabilityName_3_2(

	@PathParam("InputName_3_2_2") String InputName_3_2_2

	, @PathParam("InputName_3_2_3") String InputName_3_2_3

	, @PathParam("InputName_3_2_1") Integer InputName_3_2_1

	, @PathParam("InputName_3_2_4") Float InputName_3_2_4

	, @PathParam("InputName_3_2_5") Float InputName_3_2_5

	);

}
