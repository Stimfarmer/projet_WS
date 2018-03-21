/**
 * 
 */
package fr;

import java.io.StringWriter;
import javax.ws.rs.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import java.io.StringReader;
//import java.io.StringWriter;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import jaxb.*;
/**
 * @author esapin
 *
 */
@Path("/api")
public class Main {

	public static String prettyFormat(String input, int indent) {
        try
        {
            Source xmlInput = new StreamSource(new StringReader(input));
            StringWriter stringWriter = new StringWriter();
            StreamResult xmlOutput = new StreamResult(stringWriter);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            // This statement works with JDK 6
            transformerFactory.setAttribute("indent-number", indent);
             
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(xmlInput, xmlOutput);
            return xmlOutput.getWriter().toString();
        }
        catch (Throwable e)
        {
            // You'll come here if you are using JDK 1.5
            // you are getting an the following exeption
            // java.lang.IllegalArgumentException: Not supported: indent-number
            // Use this code (Set the output property in transformer.
            try
            {
                Source xmlInput = new StreamSource(new StringReader(input));
                StringWriter stringWriter = new StringWriter();
                StreamResult xmlOutput = new StreamResult(stringWriter);
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", String.valueOf(indent));
                transformer.transform(xmlInput, xmlOutput);
                return xmlOutput.getWriter().toString();
            }
            catch(Throwable t)
            {
                return input;
            }
        }
    }
 
    public static String prettyFormat(String input) {
        return prettyFormat(input, 2);
    }
	
	@GET
	@Path("test")
//	@Consumes("text/plain")
	public String helloWorld() {
		CSVlikeHandler test = new CSVlikeHandler("user.csv");
		test.showProperties();
		ObjectFactory of = new ObjectFactory();
		EnregistrementsType record1 = of.createEnregistrementsType();
		record1.setEmailUtilisateur("test@test.com");
		record1.setMdpUtilisateur("azerty");
		record1.setNomUtilisateur("SAPIN");
		record1.setPrenomUtilisateur("Etienne");
		record1.setTypeUtilisateur("admin");
		
		UtilisateursType db1 = of.createUtilisateursType();
		db1.getEnregistrement().add(record1);
		JAXBElement<UtilisateursType> finaltest = of.createUtilisateurs(db1);
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(UtilisateursType.class);
			StringWriter writer = new StringWriter();
			jaxbContext.createMarshaller().marshal(finaltest, writer);
			String xmlString = writer.toString();
			System.out.println(prettyFormat(xmlString));
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Hello SAPIN Etienne";
	}

}
