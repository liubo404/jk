package ocpj8.ch07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        // create an ArrayList with an initial capacity of 10
        List<String> list = new ArrayList<String>(10);

        System.out.println(list.isEmpty()); // true

        list.add("a");
        System.out.println(list.get(0));

        list.add(0, "b");
        list.add("c");
        list.add(null);
        System.out.println(list);

        list.set(2, "a");
        System.out.println(list.contains("f"));
        
        System.out.println(list);
        
        System.out.println(list.indexOf("a"));

        System.out.println(list.lastIndexOf("a"));

        list.remove(1);
        list.remove(null);
        list.remove("a");

        System.out.println(list.size());

        System.out.println(list);

        String[] arr = {"a", "b", "c", "d"};
        List<String> list2 = Arrays.asList(arr);
        System.out.println(list2);
        
        List<String> list3 = Arrays.asList("e","f","g");
        System.out.println(list3);
    }
}
