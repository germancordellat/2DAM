package ej4;

import java.util.List;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;


public class Main {

	public static void main(String[] args) {
		try {
			XMLReader p = XMLReaderFactory.createXMLReader();
			Parser parser = new Parser();
			p.setContentHandler(parser);
			p.parse("Ciclos.xml");
			
			List<String> lst = parser.getModulos();
			
			lst.forEach(e -> System.out.println(e));
			
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
