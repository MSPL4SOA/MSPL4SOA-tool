package spc1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import spc1.output.OutputDataClassName_1_1;

@Path("ServiceName_1")
public interface Resource_restServiceName_1 {

	@GET
	@Path("/CapabilityName_1_1/{InputName_1_1_1}/{InputName_1_1_2}/{InputName_1_1_5}/{InputName_1_1_3}/{InputName_1_1_4}/")
	@Produces({ "text/xml" })
	public Response CapabilityName_1_1(

	@PathParam("InputName_1_1_1") Integer InputName_1_1_1

	, @PathParam("InputName_1_1_2") Float InputName_1_1_2

	, @PathParam("InputName_1_1_5") Integer InputName_1_1_5

	, @PathParam("InputName_1_1_3") String InputName_1_1_3

	, @PathParam("InputName_1_1_4") String InputName_1_1_4

	);

	@POST
	@Path("/CapabilityName_1_2/{InputName_1_2_1}/{InputName_1_2_2}/{InputName_1_2_3}/")
	@Produces({ "text/xml" })
	public void CapabilityName_1_2(

	@PathParam("InputName_1_2_1") Integer InputName_1_2_1

	, @PathParam("InputName_1_2_2") String InputName_1_2_2

	, @PathParam("InputName_1_2_3") Float InputName_1_2_3

	);

}
