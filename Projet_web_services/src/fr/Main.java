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
	public String helloWorld() {
		CSVlikeHandler test = 
				new CSVlikeHandler("email,age,org,postal_code\n" + 
				"jocelyn.jaouen@insa-cvl.fr,21,INSACVL,18000\n" + 
				"etiennesapin@orange.fr,21,INSACVL,69530");
		test.showProperties();
		return "Hello SAPIN";
	}

}
