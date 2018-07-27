package SP_jetaircraft2.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_jetaircraft2.output.OutputDataClassName_1_1;
import SP_jetaircraft2.output.OutputDataClassName_1_2;

@Path("ServiceName_1")
public interface Resource_restServiceName_1 {

	@GET
	@Path("/CapabilityName_1_1/{InputName_1_1_1}/{InputName_1_1_2}/{InputName_1_1_5}/{InputName_1_1_3}/{InputName_1_1_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_1(

	@PathParam("InputName_1_1_1") String InputName_1_1_1

	, @PathParam("InputName_1_1_2") String InputName_1_1_2

	, @PathParam("InputName_1_1_5") String InputName_1_1_5

	, @PathParam("InputName_1_1_3") Integer InputName_1_1_3

	, @PathParam("InputName_1_1_4") Float InputName_1_1_4

	);

	@GET
	@Path("/CapabilityName_1_2/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_2(

	);

}
