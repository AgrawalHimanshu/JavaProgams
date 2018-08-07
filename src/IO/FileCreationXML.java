package IO;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class FileCreationXML {

	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException, TransformerException {
		
		// TODO Auto-generated method stub
		String fileName = "Cookies.xml";
		File file = new File(fileName);
		if(file.exists()){
			file.delete();
		}
		file.createNewFile();

		String xml = "";
		
		String xmlStr = "<class> <student rollno = \"393\"> <firstname>dinkar</firstname> <lastname>kad</lastname> <nickname>dinkar</nickname> "
			     + " <marks>85</marks> </student> <student rollno = \"493\"> <firstname>Vaneet</firstname> <lastname>Gupta</lastname> <nickname>vinni</nickname> "
			     + " <marks>95</marks> </student> </class>";
		/*String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"+
                                "<Emp id=\"1\"><name>Pankaj</name><age>25</age>\n"+
                                "<role>Developer</role><gen>Male</gen></Emp>";*/
		
		try {
			String filepath = System.getProperty("user.dir") + "\\" + fileName;
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			
			StringBuilder xmlStringBuilder = new StringBuilder();
			
			Document doc = docBuilder.parse( new InputSource( new StringReader( xmlStr ) ) ); 
		
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(filepath));
			transformer.transform(source, result);

			System.out.println("Done");

		   } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		   } catch (TransformerException tfe) {
			tfe.printStackTrace();
		   } catch (IOException ioe) {
			ioe.printStackTrace();
		   } catch (SAXException sae) {
			sae.printStackTrace();
		   }
		}
		
	
	}


