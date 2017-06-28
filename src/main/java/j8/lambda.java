package j8;

/**
 * User: liubo
 * Datetime: 2017/6/2817:42
 */
public class lambda {
    public static void main(String[] args) {
        final int answer = 42;
        Thread t = new Thread(
                ()-> System.out.printf("The answer is "+ answer)
        );
    }
}
