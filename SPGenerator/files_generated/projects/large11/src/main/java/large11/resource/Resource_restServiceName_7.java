package large11.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import large11.output.OutputDataClassName_7_1;
import large11.output.OutputDataClassName_7_2;
import large11.output.OutputDataClassName_7_3;
import large11.output.OutputDataClassName_7_4;
import large11.output.OutputDataClassName_7_5;

@Path("ServiceName_7")
public interface Resource_restServiceName_7 {

	@GET
	@Path("/CapabilityName_7_1/{InputName_7_1_1}/{InputName_7_1_2}/{InputName_7_1_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_7_1(

	@PathParam("InputName_7_1_1") Float InputName_7_1_1

	, @PathParam("InputName_7_1_2") Integer InputName_7_1_2

	, @PathParam("InputName_7_1_3") String InputName_7_1_3

	);

	@GET
	@Path("/CapabilityName_7_2/{InputName_7_2_1}/{InputName_7_2_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_7_2(

	@PathParam("InputName_7_2_1") Float InputName_7_2_1

	, @PathParam("InputName_7_2_2") String InputName_7_2_2

	);

	@GET
	@Path("/CapabilityName_7_3/{InputName_7_3_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_7_3(

	@PathParam("InputName_7_3_1") Float InputName_7_3_1

	);

	@GET
	@Path("/CapabilityName_7_4/{InputName_7_4_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_7_4(

	@PathParam("InputName_7_4_1") Float InputName_7_4_1

	);

	@GET
	@Path("/CapabilityName_7_5/{InputName_7_5_1}/{InputName_7_5_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_7_5(

	@PathParam("InputName_7_5_1") Float InputName_7_5_1

	, @PathParam("InputName_7_5_2") Integer InputName_7_5_2

	);

	@POST
	@Path("/CapabilityName_7_6/{InputName_7_6_1}/{InputName_7_6_2}/")
	@Produces({ "text/xml" })
	public void CapabilityName_7_6(

	@PathParam("InputName_7_6_1") Float InputName_7_6_1

	, @PathParam("InputName_7_6_2") Integer InputName_7_6_2

	);

}
