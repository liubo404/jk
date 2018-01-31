package j8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * User: liubo
 * Datetime: 2018/1/2515:51
 */
public class Streams {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\gitest\\jk\\src\\main\\java\\j8\\people.txt");

        Stream<String> s1 = Files.lines(path);
        Stream<String> s2 = Files.lines(path);
        Stream<String> s3 = Files.lines(path);
        Stream<String> s4 = Files.lines(path);
/*

        System.out.println("s1 " + s1.count());
        System.out.println("s2 " + s2.count());
        System.out.println("s3 " + s3.count());
        System.out.println("s4 " + s4.count());
*/

        Stream<Stream<String>> s11 = Stream.of(s1, s2, s3, s4);

//        System.out.println("s11:" + s11.count());

        Stream<String> stringStream = s11.flatMap(Function.identity());

        Function<String, Stream<String>> lineSplitter =
                line -> Pattern.compile(" ").splitAsStream(line);

        Stream<String> streamOfWords = stringStream.flatMap(lineSplitter)
                .map(w -> w.toLowerCase())
                .filter(w -> w.length() ==4)
                .distinct();


        System.out.println("streamOfWords:" + streamOfWords.count());
    }
}
