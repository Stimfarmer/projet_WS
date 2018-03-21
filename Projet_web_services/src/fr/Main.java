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
//	@Consumes("text/plain")
	public String helloWorld() {
		XMLdatabase db = new XMLdatabase("user.csv");
		db.showProperties();
		System.out.println(db.getXMLformatted());
		
		return "Hello SAPIN Etienne";
	}

}
