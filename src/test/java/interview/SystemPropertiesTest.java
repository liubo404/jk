package interview;

import org.junit.Test;

/**
 * Created by Thinkpad on 2017/4/21.
 */
public class SystemPropertiesTest {

    @Test
    public void test_user_dir() {
        System.out.println(System.getProperty("user.dir"));

        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("line.separator"));
        System.out.println(System.getProperty("path.separator"));

        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.vendor.url"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.name"));

    }

    public void test(){

    }
}
