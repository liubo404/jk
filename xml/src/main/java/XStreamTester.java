import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import org.xml.sax.InputSource;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * https://blog.csdn.net/xtj332/article/details/17606277
 * https://www.tutorialspoint.com/xstream/xstream_object_streams.htm
 */

public class XStreamTester {
    public static void main(String args[]) {

        XStreamTester tester = new XStreamTester();
        XStream xstream = new XStream(new StaxDriver());
        Student student = tester.getStudentDetails();

        xstream.processAnnotations(Student.class);

        //Object to XML Conversion
        String xml = xstream.toXML(student);
        System.out.println(formatXml(xml));
    }

    private Student getStudentDetails() {

        Student student = new Student("Mahesh");

        student.addNote(new Note("first","My first assignment."));
        student.addNote(new Note("second","My Second assignment."));
        student.setType(1);

        return student;
    }

    public static String formatXml(String xml) {

        try {
            Transformer serializer = SAXTransformerFactory.newInstance().newTransformer();

            serializer.setOutputProperty(OutputKeys.INDENT, "yes");
            serializer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

            Source xmlSource = new SAXSource(new InputSource(
                    new ByteArrayInputStream(xml.getBytes())));
            StreamResult res = new StreamResult(new ByteArrayOutputStream());

            serializer.transform(xmlSource, res);

            return new String(((ByteArrayOutputStream)res.getOutputStream()).toByteArray());

        } catch(Exception e) {
            return xml;
        }
    }
}
