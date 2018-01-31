package j8;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * User: liubo
 * Datetime: 2018/1/2517:31
 */
public class Hello {
    public static void main(String[] args) {
        Hello obj = new Hello();
        System.out.println(obj.getFile("alice.txt"));
    }

    private String getFile(String fileName) {

        StringBuilder result = new StringBuilder("");

        //Get file from resources folder
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();

    }
}
