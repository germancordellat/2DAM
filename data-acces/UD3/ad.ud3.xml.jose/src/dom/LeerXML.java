package dom;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class LeerXML {
	
	private static DocumentBuilderFactory factory = null;
	private static DocumentBuilder builder = null;
	
	public static void main(String[] args) {
		try {
			factory = DocumentBuilderFactory.newInstance();
			builder = factory.newDocumentBuilder();
			
			Document doc = builder.parse("ciclos.xml");
			doc.normalize();
			
			Element root = doc.getDocumentElement();
			System.out.println("Elementou ra�z: " + root.getNodeName());
			
			System.out.println("Tipo de documento: "+doc.getDoctype().getName());
			System.out.println("Encoding: "+doc.getXmlEncoding());
			System.out.println("Version de xml: "+doc.getXmlVersion());
		} catch (ParserConfigurationException e) {
			System.out.println("Problema al crear el DocumentBuilder");
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
