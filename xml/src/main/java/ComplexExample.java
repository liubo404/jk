import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.List;

/**
 * http://www.itcuties.com/java/xstream-complex-example/
 *
 * https://stackoverflow.com/questions/4077071/how-to-convert-list-of-object-to-xml-doc-using-xstream
 */
@XStreamAlias("complex-example")
public class ComplexExample {
    @XStreamAlias("number-1")
    private int number1 = 9;// default value will be replaced if present in the xml

    @XStreamAlias("number-2")
    private int number2 = 12;// default value will be erased if NOT present in xml (in this case it will be set to 0)

    @XStreamAlias("number-3")
    private Short number3;// any numeric type will do (Object or primitive) just make sure the number value will fit

    @XStreamAlias("attribute")
    @XStreamAsAttribute
    private String attribute;

    @XStreamAlias("default-attribute")
    @XStreamAsAttribute
    private String defaultAttribute;

    @XStreamAlias("transientString")
    private transient String transientString;// this will not be read because it
    // is transient


    @XStreamImplicit(itemFieldName = "book")
    private List<Book> books;
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    //    @XStreamAlias("book")
//    private Book book; // you can use other classes that were annotated
    // (just give the top most class to xstream for
    // annotation processing,
    // it will find all others that are used)

    public ComplexExample() {
        System.out.println("Very talkative constructor.");
    }

    @Override
    public String toString() {
        return "ComplexExample{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", number3=" + number3 +
                ", attribute='" + attribute + '\'' +
                ", defaultAttribute='" + defaultAttribute + '\'' +
                ", transientString='" + transientString + '\'' +
                ", book=" + books +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "ComplexExample [number1=" + number1 + ", number2=" + number2
//                + ", number3=" + number3 + ", attribute=" + attribute
//                + ", defaultAttribute=" + defaultAttribute
//                + ", transientString=" + transientString + ", data=" + data
//                + ", book=" + book + "]";
//    }

    private/* or public or protected or none */Object readResolve()
            throws ObjectStreamException {
        if (defaultAttribute == null) {
            defaultAttribute = "DEFAULT ATTRIBUTE VALUE";
        }
        return this;
    }

    public static void main(String[] args) {
        XStream xStream = new XStream();
       xStream.processAnnotations(ComplexExample.class);
//        ComplexExample readObject = (ComplexExample)xStream.fromXML(new File("/home/ben/work/svn/metadata/metadata-management/metadata-shell/src/main/java/com/wd/metadata/shell/xml/test/example.xml"));
//        System.out.println("Object loaded by xstream: " + readObject);

        Book b1 = new Book();
        b1.setAuthor("JRR");
        b1.setTitle("LORD");
        b1.setPagesCount(10);
        Book b2 = new Book();
        b2.setAuthor("JRR2");
        b2.setTitle("LORD2");
        b2.setPagesCount(120);

        ComplexExample obj = new ComplexExample();
        obj.number1 = 1;
        obj.number2 = 2;
        obj.number3 = 3;
        obj.attribute = "test attribute";
        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        obj.setBooks(books);
        String xml = xStream.toXML(obj);
        System.out.println(xml);


    }
}
