package ocp.ch4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * User: liubo
 * Datetime: 2017/9/1816:48
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = ()->LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println("d1 = [" + d1 + "]");
        System.out.println("d2 = [" + d2 + "]");

        Supplier<StringBuilder> sb1 = StringBuilder::new;
        Supplier<StringBuilder> sb2 = ()-> new StringBuilder();

        System.out.println("sb1 = [" + sb1.get() + "]");
        System.out.println("sb2 = [" + sb2.get() + "]");

        Supplier<ArrayList<String>> sa1 = ArrayList::new;
        System.out.println(sa1);

        ArrayList<String> a1 = sa1.get();
        System.out.println("a1 =  " + a1 + " ");
    }
}
