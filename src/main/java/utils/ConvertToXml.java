package utils;

import model.Athlete;
import org.w3c.dom.Document;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;
import java.util.Scanner;

class ConvertToXml {

    private String savedFileName;

    void convert(List<Athlete> athleteList) {
        try {
            FormXml d = new FormXml();
            d.getXmlDocumentFormed(athleteList);
            transformToXml(d.getDocument());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void transformToXml(Document doc) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(getNameAndDir()));
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        transformer.transform(source, result);
        System.out.println("File saved to " + System.getProperty("user.home") + "\\" + savedFileName + ".xml");
    }


    private String getNameAndDir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter XML document name:");
        savedFileName = scan.nextLine();
        return System.getProperty("user.home") + "/" + savedFileName + ".xml";
    }
}
