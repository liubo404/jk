package j8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * User: liubo
 * Datetime: 2018/1/2517:23
 */
public class Shakespeare {
    public static void main(String[] args) throws IOException {
        Set<String> shakespeareWords =
                Files.lines(Paths.get("words.shakespeare.txt"))
                .map(word -> word.toLowerCase())
                .collect(Collectors.toSet());

        Set<String> ospdWords =
                Files.lines(Paths.get("ospd.txt"))
                        .map(word -> word.toLowerCase())
                        .collect(Collectors.toSet());


        System.out.println("shakespeare words:"+ shakespeareWords.size());

        System.out.println("ospd:"+ ospdWords.size());
    }
}
