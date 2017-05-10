package ios;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Thinkpad on 2017/4/20.
 */
public class NioBuffers {
    public static void main(String[] args) throws IOException {
        System.out.println("hi");
        RandomAccessFile aFile = new RandomAccessFile("nio-data.txt", "rw");
        FileChannel inChannel = aFile.getChannel();

//create buffer with capacity of 48 bytes
        ByteBuffer buf = ByteBuffer.allocate(48);
        String text = "apple";
//
//        for (int i = 0; i < text.length(); i++) {
//
//            char c = text.charAt(i);
//            buf.put(c);
//        }
        int bytesRead = inChannel.read(buf); //read into buffer.

        while (bytesRead != -1) {

            buf.flip();  //make buffer ready for read

            while(buf.hasRemaining()){
                System.out.print((char) buf.get()); // read 1 byte at a time
            }

            buf.clear(); //make buffer ready for writing
            bytesRead = inChannel.read(buf);
        }
        aFile.close();

       /* RandomAccessFile file = new RandomAccessFile("nio-data.txt", "rw");
        FileChannel inChannel = file.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(48);

        int bytesRead = inChannel.read(buffer);
        while (bytesRead != -1) {
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }

            buffer.clear();
            bytesRead = inChannel.read(buffer);
        }
        file.close();*/


    }
}
