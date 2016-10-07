package mala.ch04;

/**
 * String constant pool === String pool, interchangebly, because String objects are immutable, the
 * pool of String objects is also called the "String constant pool"
 * 
 * @author abc
 *
 */
public class MyString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s1 = new String("Paul");
        String s2 = new String("Paul");
        // when comparing the object reference,it's false
        System.out.println(s1 == s2); // false

        // String pool
        String s3 = "Harry";
        String s4 = "Harry";
        System.out.println(s3 == s4); // true

        System.out.println("Morning"); // Morning

        String m1 = "Morning";
        System.out.println("Morning" == m1); // true

        String m2 = new String("Morning");
        System.out.println("Morning" == m2); // false


        // String constructor that accepts a String
        String girl = new String("Shreya");
        System.out.println(girl);
        // String constructor that accepts a char array
        char[] name = new char[] {'P', 'a', 'u', 'l'};
        String boy = new String(name);
        System.out.println(boy);
        
        //String constructor accepts a StringBuilder object
        StringBuilder sb1 = new StringBuilder("String Builder");
        String s5 = new String(sb1);
        System.out.println(s5);
        
        StringBuffer sb2 = new StringBuffer("String Buffer");
        String s6 = new String(sb2);
        System.out.println(s6);
        
        
        String nullString = null;
        System.out.println(nullString);
        
        
        

    }

}
