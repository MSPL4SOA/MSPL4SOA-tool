package SP_submarine2.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("ServiceName_3")
public interface Resource_restServiceName_3 {

	@POST
	@Path("/CapabilityName_3_1/{InputName_3_1_3}/{InputName_3_1_4}/{InputName_3_1_1}/{InputName_3_1_2}/{InputName_3_1_7}/{InputName_3_1_8}/{InputName_3_1_5}/{InputName_3_1_6}/")
	@Produces({ "text/xml" })
	public void CapabilityName_3_1(

	@PathParam("InputName_3_1_3") Integer InputName_3_1_3

	, @PathParam("InputName_3_1_4") String InputName_3_1_4

	, @PathParam("InputName_3_1_1") Integer InputName_3_1_1

	, @PathParam("InputName_3_1_2") Float InputName_3_1_2

	, @PathParam("InputName_3_1_7") String InputName_3_1_7

	, @PathParam("InputName_3_1_8") Integer InputName_3_1_8

	, @PathParam("InputName_3_1_5") String InputName_3_1_5

	, @PathParam("InputName_3_1_6") Integer InputName_3_1_6

	);

	@POST
	@Path("/CapabilityName_3_2/")
	@Produces({ "text/xml" })
	public void CapabilityName_3_2(

	);

}
