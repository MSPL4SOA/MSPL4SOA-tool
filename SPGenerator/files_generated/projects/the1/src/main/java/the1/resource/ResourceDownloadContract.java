package the1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("DownloadContract")
public interface ResourceDownloadContract {

	@GET
	@Path("/{fileIn}/")
	@Produces(MediaType.APPLICATION_XML)
	public Response downloadFile(@PathParam("fileIn") String fileIn);

}
