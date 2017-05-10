package interview.nios;

import org.junit.Test;

import java.io.IOException;
import java.nio.CharBuffer;


/**
 * Created by Thinkpad on 2017/4/20.
 */
public class NioBufferTest {
    @Test
    public void testBufferRead(){
        CharBuffer buffer = CharBuffer.allocate(1024);
        String text = "apple";
        System.out.println("Input text: " + text);

        for (int i =0; i < text.length(); i++){
            char c = text.charAt(i);
            buffer.put(c);
        }

        System.out.println("Position after data is written into buffer: " +buffer.position());

        System.out.println(buffer.capacity());
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.remaining());

        buffer.flip();

        System.out.println("Reading buffer contents:");

        while(buffer.hasRemaining()){
            System.out.println(buffer.get());
        }
    }

    @Test
    public void  testByteBuffer()   throws IOException {
        String file = "testfile.txt";
//
//        Path filePath = Paths.get(file);

    }
}
