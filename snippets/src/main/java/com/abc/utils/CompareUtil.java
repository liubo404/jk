package com.abc.utils;

/**
 * @author: liubo
 * @date: 2019-01-12 18:47
 * @description:
 **/
public final class CompareUtil {

    /**
     * https://stackoverflow.com/questions/11271554/compare-two-objects-in-java-with-possible-null-values/11272385
     * @param str1
     * @param str2
     * @return
     */
    public static boolean compare(String str1, String str2) {
        return (str1 == null ? str2 == null : str1.equals(str2));
    }

}
