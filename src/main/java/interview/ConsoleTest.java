package interview;

import org.junit.Test;

public class ConsoleTest {

    @Test
    public void iTest() {
        int i = 3;
        int j = i++ == i-- ? i++ : i--;
        System.out.println(j);
    }
}
