package large11.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import large11.output.OutputDataClassName_3_1;
import large11.output.OutputDataClassName_3_2;
import large11.output.OutputDataClassName_3_3;
import large11.output.OutputDataClassName_3_4;
import large11.output.OutputDataClassName_3_5;

@Path("ServiceName_3")
public interface Resource_restServiceName_3 {

	@GET
	@Path("/CapabilityName_3_1/{InputName_3_1_1}/{InputName_3_1_2}/{InputName_3_1_3}/{InputName_3_1_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_1(

	@PathParam("InputName_3_1_1") String InputName_3_1_1

	, @PathParam("InputName_3_1_2") Float InputName_3_1_2

	, @PathParam("InputName_3_1_3") Integer InputName_3_1_3

	, @PathParam("InputName_3_1_4") String InputName_3_1_4

	);

	@GET
	@Path("/CapabilityName_3_2/{InputName_3_2_1}/{InputName_3_2_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_2(

	@PathParam("InputName_3_2_1") String InputName_3_2_1

	, @PathParam("InputName_3_2_2") String InputName_3_2_2

	);

	@GET
	@Path("/CapabilityName_3_3/{InputName_3_3_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_3(

	@PathParam("InputName_3_3_1") Float InputName_3_3_1

	);

	@GET
	@Path("/CapabilityName_3_4/{InputName_3_4_1}/{InputName_3_4_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_4(

	@PathParam("InputName_3_4_1") Float InputName_3_4_1

	, @PathParam("InputName_3_4_2") Float InputName_3_4_2

	);

	@GET
	@Path("/CapabilityName_3_5/{InputName_3_5_1}/{InputName_3_5_2}/{InputName_3_5_3}/{InputName_3_5_4}/{InputName_3_5_5}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_3_5(

	@PathParam("InputName_3_5_1") Integer InputName_3_5_1

	, @PathParam("InputName_3_5_2") Float InputName_3_5_2

	, @PathParam("InputName_3_5_3") Integer InputName_3_5_3

	, @PathParam("InputName_3_5_4") Integer InputName_3_5_4

	, @PathParam("InputName_3_5_5") Integer InputName_3_5_5

	);

}
