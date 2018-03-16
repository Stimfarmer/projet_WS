/**
 * 
 */
package fr;

import javax.ws.rs.*;

/**
 * @author esapin
 *
 */
@Path("/api")
public class Main {

	@GET
	public String sayPlainTextHello() {
		return "Hello Jersey";
	}

}
