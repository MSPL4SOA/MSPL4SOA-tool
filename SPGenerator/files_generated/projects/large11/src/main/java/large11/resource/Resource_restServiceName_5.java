package large11.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import large11.output.OutputDataClassName_5_2;
import large11.output.OutputDataClassName_5_3;
import large11.output.OutputDataClassName_5_4;

@Path("ServiceName_5")
public interface Resource_restServiceName_5 {

	@POST
	@Path("/CapabilityName_5_1/")
	@Produces({ "text/xml" })
	public void CapabilityName_5_1(

	);

	@GET
	@Path("/CapabilityName_5_2/{InputName_5_2_1}/{InputName_5_2_2}/{InputName_5_2_3}/{InputName_5_2_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_5_2(

	@PathParam("InputName_5_2_1") Float InputName_5_2_1

	, @PathParam("InputName_5_2_2") Float InputName_5_2_2

	, @PathParam("InputName_5_2_3") Float InputName_5_2_3

	, @PathParam("InputName_5_2_4") String InputName_5_2_4

	);

	@GET
	@Path("/CapabilityName_5_3/{InputName_5_3_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_5_3(

	@PathParam("InputName_5_3_1") String InputName_5_3_1

	);

	@GET
	@Path("/CapabilityName_5_4/{InputName_5_4_1}/{InputName_5_4_2}/{InputName_5_4_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_5_4(

	@PathParam("InputName_5_4_1") Float InputName_5_4_1

	, @PathParam("InputName_5_4_2") Integer InputName_5_4_2

	, @PathParam("InputName_5_4_3") String InputName_5_4_3

	);

	@POST
	@Path("/CapabilityName_5_5/{InputName_5_5_1}/")
	@Produces({ "text/xml" })
	public void CapabilityName_5_5(

	@PathParam("InputName_5_5_1") Float InputName_5_5_1

	);

	@POST
	@Path("/CapabilityName_5_6/")
	@Produces({ "text/xml" })
	public void CapabilityName_5_6(

	);

}
