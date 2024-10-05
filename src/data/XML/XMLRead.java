package data.XML;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class XMLRead<T> {
    private final Class<T> objectClass;

    public XMLRead(Class<T> objectClass) {
        this.objectClass = objectClass;
    }

    public List<T> read(){
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(objectClass.getName().toLowerCase() + ".xml");
            document.getDocumentElement().normalize();

            Element root = document.getDocumentElement();
            List<T> listObjects = new ArrayList<>();

            for (int i = 0; i < root.getChildNodes().getLength(); i++) {
                Field[] fields = objectClass.getDeclaredFields();

                for (Field field : fields) {
                    NodeList element = document.getElementsByTagName(field.getName());
                    System.out.println(field.getName() + ": " + element.item(0).getTextContent());
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Element readRoot(String documetName) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(documetName + ".xml");
            document.getDocumentElement().normalize();

            return document.getDocumentElement();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static int autoIncrement(String documetName) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(documetName + ".xml");
            document.getDocumentElement().normalize();

            Element root = document.getDocumentElement();

            return root.getChildNodes().getLength() + 1;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }
}

