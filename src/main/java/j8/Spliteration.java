package j8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * User: liubo
 * Datetime: 2018/1/2015:48
 */
public class Spliteration {
    public static void main(String[] args) {
        Path path = Paths.get("D:\\gitest\\jk\\src\\main\\java\\j8\\people.txt");

        try (Stream<String> lines = Files.lines(path)) {

            Spliterator<String> lineSpliterator = lines.spliterator();
            Spliterator<Person> personSpliterator = new PersonSpliterator(lineSpliterator);

            Stream<Person> people = StreamSupport.stream(personSpliterator, false);
            people.forEach(System.out::println);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
