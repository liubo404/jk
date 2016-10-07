package com.zx.spring;

public class ExceptionTypeTest {
    public void doSth() throws ArithmeticException {
        System.out.println("doSth throws ArithmeticException");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);
        change(s1);
        System.out.println("s1="+s1);

        ExceptionTypeTest ett = new ExceptionTypeTest();
        ett.doSth();
    }
    
    public static void change(String s){
        s="cde";
        System.out.println("s="+s);
    }
}
