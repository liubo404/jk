package interview;

import java.io.ObjectStreamClass;
import java.util.Random;

/**
 * User: liubo
 * Datetime: 2017/4/2510:06
 */
public class SerialVersionUIDTest {
    public static void main(String[] args) {
        System.out.println(new Random().nextLong());
        ObjectStreamClass c = ObjectStreamClass.lookup(SerialVersionUIDTest.class);
        long serialID = c.getSerialVersionUID();
        System.out.println(serialID);
    }
}
