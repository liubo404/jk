package ocp.ch4;

import java.util.function.UnaryOperator;

/**
 * User: liubo
 * Datetime: 2017/9/1820:28
 */
public class UnaryTest {

    public static void main(String[] args) {
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();

        System.out.println(u1.apply("chirp"));
        System.out.println(u2.apply("test"));
    }
}
