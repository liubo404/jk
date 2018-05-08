import com.thoughtworks.xstream.XStream;

public class XmlTest {
    public static void main(String[] args) {

        XStream xstream = new XStream();
        xstream.alias("person", Person.class);
        xstream.alias("phoneNumber", PhoneNumber.class);
        Person joe = new Person("Joe", "Walnes");
        joe.setPhone(new PhoneNumber(123, "1234-456"));
        joe.setFax(new PhoneNumber(123, "9999-999"));
        String xml = xstream.toXML(joe);
        System.out.println(xml);

        Person newJoe = (Person) xstream.fromXML(xml);
        System.out.println(newJoe);
    }
}
