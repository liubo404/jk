package ocp.ch4;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * User: liubo
 * Datetime: 2017/9/1817:01
 */
public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie");
        c2.accept("Be");

        Map<String,Integer> map = new HashMap<>();

        BiConsumer<String,Integer> b1 = map::put;
        BiConsumer<String,Integer> b2 = (k,v) -> map.put(k,v);

        b1.accept("chicken",7);
        b2.accept("chick",1);

        System.out.println(map);

        Map<String,String> map2= new HashMap<>();
        BiConsumer<String,String> b3=map2::put;
        BiConsumer<String,String> b4=(k,v) -> map2.put(k,v);

        b3.accept("chicken","Clunk");
        b4.accept("chick","Tweep");

        System.out.println(map2);

    }
}
