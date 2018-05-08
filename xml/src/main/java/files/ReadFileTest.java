package files;

import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

/**
 * http://www.mkyong.com/java/java-read-a-file-from-resources-folder/
 * https://howtodoinjava.com/core-java/io/read-file-from-resources-folder/
 *
 * https://java2blog.com/read-file-from-resources-folder-in-java/
 */
public class ReadFileTest {

    public static void main(String[] args) throws IOException {
        classLoaderRead();

        systemClassLoadRead("table.xml");

        springResourceUtilRead("table.xml");
    }

    private static void springResourceUtilRead(String fileName) throws IOException {
        File file = ResourceUtils.getFile("classpath:table.xml");

//File is found
        System.out.println("springResourceUtilRead ==>File Found : " + file.exists());

//Read File Content
        String content = new String(Files.readAllBytes(file.toPath()));
        System.out.println(content);
    }

    private static void systemClassLoadRead(String fileName) throws IOException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

//File is found
        System.out.println("systemClassLoadRead File Found : " + file.exists());

//Read File Content
        String content = new String(Files.readAllBytes(file.toPath()));
        System.out.println(content);
    }

    private static void classLoaderRead() throws IOException {
        String fileName = "table.xml";
        ClassLoader classLoader = new ReadFileTest().getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

        //File is found
        System.out.println("File Found : " + file.exists());

        //Read File Content
        String content = new String(Files.readAllBytes(file.toPath()));
        System.out.println(content);
    }
}
