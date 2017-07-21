package etc;

import org.junit.Assert;
import org.junit.Test;

/**
 * User: liubo
 * Datetime: 2017/7/2011:34
 */
public class Mis {


    @Test
    public void testUserName(){
        System.setProperty("user.name","hive");
        System.out.println(System.getenv("HADOOP_HOME"));
        System.out.println(System.getProperty("user.name"));
        Assert.assertEquals("hive",System.getProperty("user.name"));

       /* Map<String, String> envMap = System.getenv();
        int mapsize = envMap.size();
        Iterator i = envMap.entrySet().iterator();
        for (int j = 0; j < mapsize; j++) {
            Map.Entry entry = (Map.Entry) i.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }*/
    }
}
