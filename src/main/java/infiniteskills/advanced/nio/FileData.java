package infiniteskills.advanced.nio;

import java.io.*;
import java.nio.file.*;
/**
 * User: liubo
 * Datetime: 2017/5/1214:37
 */
public class FileData {
    public static void main(String[] args) {
        Path filePath = Paths.get(args[0]);
        System.out.println("file name = [" + filePath.getName(1) + "]");


    }
}
