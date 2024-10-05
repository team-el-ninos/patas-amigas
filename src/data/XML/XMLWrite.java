package data.XML;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class XMLWrite<T> {
    private final T object;
    private final Class<?> objectClass;

    public XMLWrite(T object) {
        this.object = object;
        this.objectClass = object.getClass();
    }

    public void write() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            Element rootElement = XMLRead.readRoot(objectClass.getName().toLowerCase());
            document.appendChild(rootElement);

            int numberIndex = XMLRead.autoIncrement(objectClass.getName().toLowerCase());
            Element tupleElement = document.createElement(String.valueOf(numberIndex));
            rootElement.appendChild(tupleElement);

            Field[] fields = objectClass.getDeclaredFields();

            for (Field field : fields) {
                Element element = document.createElement(field.getName());

                Method metodo = objectClass.getDeclaredMethod("get" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1));
                element.appendChild(document.createTextNode(String.valueOf(metodo.invoke(object))));
                tupleElement.appendChild(element);
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(objectClass.getName().toLowerCase() + ".xml");
            transformer.transform(source, result);

            System.out.println("Arquivo `" + objectClass.getName() + "` criado com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
