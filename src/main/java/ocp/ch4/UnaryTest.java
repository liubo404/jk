package ocp.ch4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
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

        Predicate<List> ex1 = x->"".equals(x.get(0));
        System.out.println(ex1.test(Arrays.asList("a","b","c")));
        System.out.println(ex1.test(Arrays.asList("","b","c")));

        Consumer<Long> ex2 = (Long l) -> System.out.println(l);
        ex2.accept(101L);

        BiPredicate<String,String> ex3 = (s1,s2) ->false;
        System.out.println(ex3.test("a","b"));
/*
        Function<List<String>> t1 = x -> x.get(0);
        UnaryOperator<Long> t2 = (Long l) ->314L;
        Predicate t3 = String::isEmpty;*/

        Map<String,String> map = new HashMap<>();
        System.out.println(map.get("test"));


    }
}
