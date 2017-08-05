package sync8.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import sync8.output.OutputDataClassName_4_6;
import sync8.output.OutputDataClassName_4_2;
import sync8.output.OutputDataClassName_4_4;
import sync8.output.OutputDataClassName_4_5;
import sync8.output.OutputDataClassName_4_1;

@Path("ServiceName_4")
public interface Resource_restServiceName_4 {

	@GET
	@Path("/CapabilityName_4_6/{InputName_4_6_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_6(

	@PathParam("InputName_4_6_1") Float InputName_4_6_1

	);

	@GET
	@Path("/CapabilityName_4_2/{InputName_4_2_1}/{InputName_4_2_2}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_2(

	@PathParam("InputName_4_2_1") Integer InputName_4_2_1

	, @PathParam("InputName_4_2_2") String InputName_4_2_2

	);

	@POST
	@Path("/CapabilityName_4_3/{InputName_4_3_2}/{InputName_4_3_1}/")
	@Produces({ "text/xml" })
	public void CapabilityName_4_3(

	@PathParam("InputName_4_3_2") String InputName_4_3_2

	, @PathParam("InputName_4_3_1") Float InputName_4_3_1

	);

	@GET
	@Path("/CapabilityName_4_4/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_4(

	);

	@GET
	@Path("/CapabilityName_4_5/{InputName_4_5_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_5(

	@PathParam("InputName_4_5_1") String InputName_4_5_1

	);

	@GET
	@Path("/CapabilityName_4_1/{InputName_4_1_1}/{InputName_4_1_2}/{InputName_4_1_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_1(

	@PathParam("InputName_4_1_1") Integer InputName_4_1_1

	, @PathParam("InputName_4_1_2") String InputName_4_1_2

	, @PathParam("InputName_4_1_3") Float InputName_4_1_3

	);

}
