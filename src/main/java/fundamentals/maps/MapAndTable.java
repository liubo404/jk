package fundamentals.maps;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class MapAndTable {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put(null, null);
        System.out.println(map.put("k2", "v21"));
        System.out.println(map.put(null, "sdf"));

        System.out.println(map);


        // HashTable
        Hashtable<String, String> table = new Hashtable<String, String>();
        table.put("t1", "v1");
        table.put("t2", "v2");
        // table.put(null, null);
        table.put("t3", "v3");
        table.put("t2", "v22");
        // table.put(null, "sdf");
        System.out.println(table);

        for (String k : table.keySet()) {
            System.out.println(k);
        }

        Enumeration em = table.elements();
        while (em.hasMoreElements()) {
            String obj = (String) em.nextElement();
            System.out.println(obj);
        }

        Set<Entry<String, String>> set = table.entrySet();
        for (Entry<String, String> s : set) {
            System.out.println(s.getKey() + " : " + s.getValue());
        }
    }

}
