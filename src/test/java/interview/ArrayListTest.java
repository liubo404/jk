package interview;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayListTest {

    @Test
    public void referenceTest(){
        ArrayList<Integer> alist = new ArrayList<Integer>();
        
        Integer a1 = 20;
        Integer a2 = 20;
        
        alist.add(a1);
        alist.add(a2);
        
        System.out.println(alist.size() +":");
        
        a1 = 30;
        alist.remove(a1);
        
        System.out.println(alist.size());
        
        
        System.out.println("1".equals(String.valueOf(1)));
    }
}
