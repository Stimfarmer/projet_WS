/**
 * 
 */
package fr;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/*
 * Usage:
 * Go on /resources/api/xml_create/yourfile.csv
 * 
 */




/**
 * @author esapin
 *
 */
@Path("/api")
public class Main {
	
	@GET
	@Path("xml_create/{file}")
	public Response createDB(@PathParam("file") String file) {
		System.out.println("Param: " + file);
			try {
				XMLdatabase db = new XMLdatabase(file);
				db.showProperties();
				System.out.println(db.getXMLformatted());
				db.createAndWriteXML();
			} catch (Exception e) {
				return Response.serverError().entity("Format de fichier inattendu").build();
			}

		
		// en général le fichier XML va être créer dans le home directory de l'utilisateur du server
		// sinon à la racine du projet
		// (on peut toutefois voir la transformation CSV/XML dans la console)
		
		return Response.ok("TR_OK", "text/plain").build();
	}

}
