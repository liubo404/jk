package ocpj8.ch07;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * The main feature of a set is that it dosen't allow duplicates.
 * 
 * @author abc
 *
 */
public class MySet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>(10);
        
        System.out.println(set.add("b"));
        System.out.println(set.add("x"));
        System.out.println(set.add("h"));
        System.out.println(set.add("b"));
        System.out.println(set.add(null));
        System.out.println(set.add(null));
        System.out.println(set);
        
        
        //TreeSet
        Set<String> set2 = new TreeSet<String>();
        System.out.println(set2.add("b"));
        System.out.println(set2.add("x"));
        System.out.println(set2.add("h"));
        System.out.println(set2.add("b"));
        System.out.println(set2.add(null));
        System.out.println(set2);
    }

}
