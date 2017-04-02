package SP_radar2.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("ServiceName_4")
public interface Resource_restServiceName_4 {

	@POST
	@Path("/CapabilityName_4_2/{InputName_4_2_1}/{InputName_4_2_2}/")
	@Produces({ "text/xml" })
	public void CapabilityName_4_2(

	@PathParam("InputName_4_2_1") String InputName_4_2_1

	, @PathParam("InputName_4_2_2") String InputName_4_2_2

	);

	@POST
	@Path("/CapabilityName_4_3/{InputName_4_3_2}/{InputName_4_3_3}/{InputName_4_3_1}/")
	@Produces({ "text/xml" })
	public void CapabilityName_4_3(

	@PathParam("InputName_4_3_2") String InputName_4_3_2

	, @PathParam("InputName_4_3_3") Integer InputName_4_3_3

	, @PathParam("InputName_4_3_1") String InputName_4_3_1

	);

	@POST
	@Path("/CapabilityName_4_1/{InputName_4_1_4}/{InputName_4_1_5}/{InputName_4_1_6}/{InputName_4_1_7}/{InputName_4_1_1}/{InputName_4_1_2}/{InputName_4_1_3}/")
	@Produces({ "text/xml" })
	public void CapabilityName_4_1(

	@PathParam("InputName_4_1_4") String InputName_4_1_4

	, @PathParam("InputName_4_1_5") Float InputName_4_1_5

	, @PathParam("InputName_4_1_6") Float InputName_4_1_6

	, @PathParam("InputName_4_1_7") Float InputName_4_1_7

	, @PathParam("InputName_4_1_1") String InputName_4_1_1

	, @PathParam("InputName_4_1_2") String InputName_4_1_2

	, @PathParam("InputName_4_1_3") String InputName_4_1_3

	);

}
