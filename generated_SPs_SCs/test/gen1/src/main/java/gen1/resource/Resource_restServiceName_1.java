package gen1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("ServiceName_1")
public interface Resource_restServiceName_1 {

	@GET
	@Path("/CapabilityName_1_1/")
	@Produces({ "text/xml" })
	public void CapabilityName_1_1(

	);

	@POST
	@Path("/CapabilityName_1_2/")
	@Produces({ "text/xml" })
	public void CapabilityName_1_2(

	);

}
