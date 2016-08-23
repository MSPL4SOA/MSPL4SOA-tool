package commerce.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import commerce.output.RequiredProduct;

@Path("Cart")
public interface Resource_restCart {

	@POST
	@Path("/addProduct/{id}/{name}/{qte}/")
	@Produces({ "text/xml" })
	public void addProduct(

	@PathParam("id") String id

	, @PathParam("name") String name

	, @PathParam("qte") Integer qte

	);

	@GET
	@Path("/getProduct/{id}/")
	@Produces({ "text/xml" })
	public RequiredProduct getProduct(

	@PathParam("id") String id

	);

}
