package sync3.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import sync3.output.OutputDataClassName_1_1;
import sync3.output.OutputDataClassName_1_2;

@Path("ServiceName_1")
public interface Resource_restServiceName_1 {

	@GET
	@Path("/CapabilityName_1_1/{InputName_1_1_1}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_1(

	@PathParam("InputName_1_1_1") Float InputName_1_1_1

	);

	@GET
	@Path("/CapabilityName_1_2/{InputName_1_2_1}/{InputName_1_2_2}/{InputName_1_2_3}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_2(

	@PathParam("InputName_1_2_1") String InputName_1_2_1

	, @PathParam("InputName_1_2_2") Float InputName_1_2_2

	, @PathParam("InputName_1_2_3") String InputName_1_2_3

	);

}
