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
	
	@POST
	@Path("xml_create/{file}")
	public String helloWorld(@PathParam("file") String file) {
		System.out.println("Param: " + file);
		XMLdatabase db = new XMLdatabase(file);
		db.showProperties();
		System.out.println(db.getXMLformatted());
		
		return db.getXMLformatted();
	}

}
