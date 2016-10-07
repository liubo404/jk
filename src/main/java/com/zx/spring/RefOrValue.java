package com.zx.spring;

import java.util.ArrayList;
import java.util.List;

public class RefOrValue {

    static String s = new String( "xxx");
    static char[] c = {'a', '1'};

    public static void main(String[] args) {
        System.out.println("s in main  method before:" + s);
        System.out.println(c);
        change(s, c);
        System.out.println("s in main method after:" + s);
        System.out.println(c);
        
        List<String> myList = new ArrayList<String>();
    }

    public static void change(String s, char[] c) {
        s = "abcd";
        c[0] = 'X';
        System.out.println("s in change method:" + s);
        System.out.println(c);
    }
}
