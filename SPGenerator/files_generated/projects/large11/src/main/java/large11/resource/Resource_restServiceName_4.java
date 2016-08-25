package large11.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import large11.output.OutputDataClassName_4_1;
import large11.output.OutputDataClassName_4_2;
import large11.output.OutputDataClassName_4_4;
import large11.output.OutputDataClassName_4_5;

@Path("ServiceName_4")
public interface Resource_restServiceName_4 {

	@GET
	@Path("/CapabilityName_4_1/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_1(

	);

	@GET
	@Path("/CapabilityName_4_2/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_2(

	);

	@POST
	@Path("/CapabilityName_4_3/{InputName_4_3_1}/{InputName_4_3_2}/")
	@Produces({ "text/xml" })
	public void CapabilityName_4_3(

	@PathParam("InputName_4_3_1") Integer InputName_4_3_1

	, @PathParam("InputName_4_3_2") Integer InputName_4_3_2

	);

	@GET
	@Path("/CapabilityName_4_4/{InputName_4_4_1}/{InputName_4_4_2}/{InputName_4_4_3}/{InputName_4_4_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_4(

	@PathParam("InputName_4_4_1") Float InputName_4_4_1

	, @PathParam("InputName_4_4_2") Integer InputName_4_4_2

	, @PathParam("InputName_4_4_3") String InputName_4_4_3

	, @PathParam("InputName_4_4_4") Float InputName_4_4_4

	);

	@GET
	@Path("/CapabilityName_4_5/{InputName_4_5_1}/{InputName_4_5_2}/{InputName_4_5_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_4_5(

	@PathParam("InputName_4_5_1") Float InputName_4_5_1

	, @PathParam("InputName_4_5_2") String InputName_4_5_2

	, @PathParam("InputName_4_5_3") String InputName_4_5_3

	);

}
