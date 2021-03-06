package SP_helicopter1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_helicopter1.output.OutputDataClassName_1_1;
import SP_helicopter1.output.OutputDataClassName_1_2;
import SP_helicopter1.output.OutputDataClassName_1_3;
import SP_helicopter1.output.OutputDataClassName_1_4;

@Path("ServiceName_1")
public interface Resource_restServiceName_1 {

	@POST
	@Path("/CapabilityName_1_5/{InputName_1_5_5}/{InputName_1_5_6}/{InputName_1_5_3}/{InputName_1_5_4}/{InputName_1_5_7}/{InputName_1_5_1}/{InputName_1_5_2}/")
	@Produces({ "text/xml" })
	public void CapabilityName_1_5(

	@PathParam("InputName_1_5_5") String InputName_1_5_5

	, @PathParam("InputName_1_5_6") String InputName_1_5_6

	, @PathParam("InputName_1_5_3") Float InputName_1_5_3

	, @PathParam("InputName_1_5_4") Integer InputName_1_5_4

	, @PathParam("InputName_1_5_7") Float InputName_1_5_7

	, @PathParam("InputName_1_5_1") Float InputName_1_5_1

	, @PathParam("InputName_1_5_2") Integer InputName_1_5_2

	);

	@POST
	@Path("/CapabilityName_1_1/{InputName_1_1_1}/{InputName_1_1_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_1(

	@PathParam("InputName_1_1_1") Integer InputName_1_1_1

	, @PathParam("InputName_1_1_2") Integer InputName_1_1_2

	);

	@GET
	@Path("/CapabilityName_1_2/{InputName_1_2_1}/{InputName_1_2_4}/{InputName_1_2_2}/{InputName_1_2_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_2(

	@PathParam("InputName_1_2_1") Float InputName_1_2_1

	, @PathParam("InputName_1_2_4") String InputName_1_2_4

	, @PathParam("InputName_1_2_2") String InputName_1_2_2

	, @PathParam("InputName_1_2_3") Float InputName_1_2_3

	);

	@GET
	@Path("/CapabilityName_1_3/{InputName_1_3_1}/{InputName_1_3_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_3(

	@PathParam("InputName_1_3_1") Integer InputName_1_3_1

	, @PathParam("InputName_1_3_2") String InputName_1_3_2

	);

	@GET
	@Path("/CapabilityName_1_4/{InputName_1_4_2}/{InputName_1_4_3}/{InputName_1_4_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_4(

	@PathParam("InputName_1_4_2") Float InputName_1_4_2

	, @PathParam("InputName_1_4_3") Float InputName_1_4_3

	, @PathParam("InputName_1_4_1") String InputName_1_4_1

	);

}
