package fundamentals.maps;

import java.util.HashMap;

public class MyKey {
    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        System.out.println("sdf");
        HashMap<MyKey,String> mm = new HashMap<MyKey,String>();
        
        MyKey my = new MyKey();
        my.setName("abc");
        
        mm.put(my, "value");
        System.out.println(mm.get(my));
    
    }
}
