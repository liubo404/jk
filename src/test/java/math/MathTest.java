package math;

import org.junit.Test;

/**
 * User: liubo
 * Datetime: 2017/5/2219:52
 */
public class MathTest {

    @Test
    public void testDivide() {
        int count = 265000;
        int times = count / 10000;
        System.out.println("times = [" + times + "]");
    }
}
