package SP_aircraftcarrier1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_aircraftcarrier1.output.OutputDataClassName_2_4;
import SP_aircraftcarrier1.output.OutputDataClassName_2_5;
import SP_aircraftcarrier1.output.OutputDataClassName_2_1;
import SP_aircraftcarrier1.output.OutputDataClassName_2_3;

@Path("ServiceName_2")
public interface Resource_restServiceName_2 {

	@GET
	@Path("/CapabilityName_2_4/{InputName_2_4_1}/{InputName_2_4_2}/{InputName_2_4_3}/{InputName_2_4_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_4(

	@PathParam("InputName_2_4_1") Float InputName_2_4_1

	, @PathParam("InputName_2_4_2") Integer InputName_2_4_2

	, @PathParam("InputName_2_4_3") Float InputName_2_4_3

	, @PathParam("InputName_2_4_4") Float InputName_2_4_4

	);

	@POST
	@Path("/CapabilityName_2_5/{InputName_2_5_1}/{InputName_2_5_2}/{InputName_2_5_3}/{InputName_2_5_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_5(

	@PathParam("InputName_2_5_1") Float InputName_2_5_1

	, @PathParam("InputName_2_5_2") String InputName_2_5_2

	, @PathParam("InputName_2_5_3") String InputName_2_5_3

	, @PathParam("InputName_2_5_4") String InputName_2_5_4

	);

	@GET
	@Path("/CapabilityName_2_1/{InputName_2_1_1}/{InputName_2_1_2}/{InputName_2_1_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_1(

	@PathParam("InputName_2_1_1") Integer InputName_2_1_1

	, @PathParam("InputName_2_1_2") Float InputName_2_1_2

	, @PathParam("InputName_2_1_3") Float InputName_2_1_3

	);

	@POST
	@Path("/CapabilityName_2_2/{InputName_2_2_1}/{InputName_2_2_2}/")
	@Produces({ "text/xml" })
	public void CapabilityName_2_2(

	@PathParam("InputName_2_2_1") Float InputName_2_2_1

	, @PathParam("InputName_2_2_2") String InputName_2_2_2

	);

	@GET
	@Path("/CapabilityName_2_3/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_3(

	);

}
