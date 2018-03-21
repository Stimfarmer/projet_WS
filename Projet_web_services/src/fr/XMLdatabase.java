/**
 * 
 */
package fr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import jaxb.EnregistrementsType;
import jaxb.ObjectFactory;
import jaxb.UtilisateursType;

/**
 * @author esapin
 *
 */
public class XMLdatabase extends CSVlikeHandler {

	private JAXBElement<UtilisateursType> rawElt;
	
	private String XMLformatted;
	
	public XMLdatabase(String filePath) {
		super(filePath);
		this.XMLdatabaseBuilder();
		this.builJAXB();
		
	}
	
	public static String prettyFormat(String input, int indent) {
        try
        {
            Source xmlInput = new StreamSource(new StringReader(input));
            StringWriter stringWriter = new StringWriter();
            StreamResult xmlOutput = new StreamResult(stringWriter);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            transformerFactory.setAttribute("indent-number", indent);
             
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(xmlInput, xmlOutput);
            return xmlOutput.getWriter().toString();
        }
        catch (Throwable e)
        {
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
	
	public JAXBElement<UtilisateursType> XMLdatabaseBuilder()
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(this.getFilePath()));
		ObjectFactory object = new ObjectFactory();
		UtilisateursType dbTmp = object.createUtilisateursType();
		
		String line;
		
		try {
			while((line = reader.readLine()) != null)
			{
				EnregistrementsType recordTmp = object.createEnregistrementsType();
				String splittedLine[] = line.split(",");
				recordTmp.setEmailUtilisateur(splittedLine[0]);
				recordTmp.setMdpUtilisateur(splittedLine[1]);
				recordTmp.setTypeUtilisateur(splittedLine[2]);
				recordTmp.setNomUtilisateur(splittedLine[3]);
				recordTmp.setPrenomUtilisateur(splittedLine[4]);
				dbTmp.getEnregistrement().add(recordTmp);
			}
			this.setRawElt(object.createUtilisateurs(dbTmp));
			return this.getRawElt();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public JAXBElement<UtilisateursType> getRawElt() {
		return rawElt;
	}

	public void setRawElt(JAXBElement<UtilisateursType> rawElt) {
		this.rawElt = rawElt;
	}

	public String getXMLformatted() {
		return XMLformatted;
	}

	public void setXMLformatted(String xMLformatted) {
		this.XMLformatted = xMLformatted;
	}
	
	public void show()
	{
		System.out.println(this.getXMLformatted());
	}
	
	public void builJAXB()
	{
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(UtilisateursType.class);
			StringWriter writer = new StringWriter();
			jaxbContext.createMarshaller().marshal(this.getRawElt(), writer);
			String xmlString = writer.toString();
			this.setXMLformatted(prettyFormat(xmlString));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
