package SP_jetaircraft2.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import SP_jetaircraft2.output.OutputDataClassName_2_1;
import SP_jetaircraft2.output.OutputDataClassName_2_2;

@Path("ServiceName_2")
public interface Resource_restServiceName_2 {

	@GET
	@Path("/CapabilityName_2_1/{InputName_2_1_1}/{InputName_2_1_2}/{InputName_2_1_3}/{InputName_2_1_4}/{InputName_2_1_5}/{InputName_2_1_6}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_1(

	@PathParam("InputName_2_1_1") Float InputName_2_1_1

	, @PathParam("InputName_2_1_2") String InputName_2_1_2

	, @PathParam("InputName_2_1_3") String InputName_2_1_3

	, @PathParam("InputName_2_1_4") Integer InputName_2_1_4

	, @PathParam("InputName_2_1_5") Integer InputName_2_1_5

	, @PathParam("InputName_2_1_6") String InputName_2_1_6

	);

	@GET
	@Path("/CapabilityName_2_2/")
	@Produces({ "text/xml" })
	public Response CapabilityName_2_2(

	);

}
