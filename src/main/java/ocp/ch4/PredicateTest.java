package ocp.ch4;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * User: liubo
 * Datetime: 2017/9/1819:52
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test(""));
        System.out.println(p2.test(""));

        BiPredicate<String,String> b1 = String::startsWith;
        BiPredicate<String,String> b2 = (string,prefix) -> string.startsWith(prefix);

        System.out.println(b1.test("chicken","chick"));
        System.out.println(b2.test("chicken","chick"));
    }
}
