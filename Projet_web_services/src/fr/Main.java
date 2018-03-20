/**
 * 
 */
package fr;

import java.io.StringWriter;
import java.util.List;

import javax.ws.rs.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import jaxb.*;
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
		CSVlikeHandler test = new CSVlikeHandler("user.csv");
		test.showProperties();
		ObjectFactory of = new ObjectFactory();
		UtilisateursType usertype = of.createUtilisateursType();
		List<EnregistrementsType> enregistrementtype = usertype.getEnregistrement();
		enregistrementtype.add(new EnregistrementsType());
		enregistrementtype.get(0).setEmailUtilisateur("etienne.sapin@insa-cvl.fr");
		enregistrementtype.get(0).setMdpUtilisateur("azerty");
		enregistrementtype.get(0).setNomUtilisateur("Sapin");
		enregistrementtype.get(0).setPrenomUtilisateur("Etienne");
		enregistrementtype.get(0).setTypeUtilisateur("admin");
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(UtilisateursType.class);
			StringWriter writer = new StringWriter();
			jaxbContext.createMarshaller().marshal(enregistrementtype, writer);
			String xmlString = writer.toString();
			System.out.println(xmlString);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Hello SAPIN Etienne";
	}

}
