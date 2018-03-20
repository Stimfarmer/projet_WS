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
	@Path("test")
	public String helloWorld() {
		CSVlikeHandler test = new CSVlikeHandler("user.csv");
		test.showProperties();
		return "Hello SAPIN Etienne";
	}

}
