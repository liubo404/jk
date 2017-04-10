package virtualpairprogrammer.sortingStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Thinkpad on 2017/4/9.
 */
public class Main {
    public static void main(String[] args){
        List<String> strings = new ArrayList<String>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");
        strings.add("five");
        strings.add("six");
        strings.add("seven");

        Collections.sort(strings);

        for(String s : strings){
            System.out.println(s);
        }
    }
}
