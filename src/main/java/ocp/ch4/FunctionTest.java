package ocp.ch4;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * User: liubo
 * Datetime: 2017/9/1820:00
 */
public class FunctionTest {
    public static void main(String[] args) {
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(f1.apply("clunk"));
        System.out.println(f2.apply("test"));

        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("baby ", "chick"));
        System.out.println(b2.apply("baby ", "chick"));

        TriFunction<String, String, String, String> t1 = (a, b, c) ->  a.concat(b.toUpperCase()).concat(c);

        System.out.println(t1.apply("a","b","c"));
    }
}
