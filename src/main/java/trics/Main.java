package trics;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {
        String clazz = "trics.ConstantClassField";
        String attr = "acctHolder";

        Field field = Class.forName(clazz).getField(attr);
        System.out.println(field.get(null));

    }

}


class ConstantClassField {
    public static final String acctHolder = "Jim Farley";
}

