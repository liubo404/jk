package infiniteskills.advanced.nio;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class bctest {

    public static void main(String[] args) throws IOException   {
        // TODO Auto-generated method stub
        System.out.println("hi");
        RandomAccessFile file = new RandomAccessFile("g://test.txt", "rw");
        FileChannel channel = file.getChannel();
         

        ByteBuffer buf = ByteBuffer.allocate(48);
        int bytesRead = channel.read(buf);
        byte b = 126;
        buf.put(b);
        while (bytesRead != -1) {

            System.out.println("Read " + bytesRead);
            buf.flip();

            while (buf.hasRemaining()) {
              //  System.out.println(  buf.get());
                System.out.print((char) buf.get());
            }

            buf.clear();
            bytesRead = channel.read(buf);
        }
        file.close();
    }

}
