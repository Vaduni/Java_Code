package Java_Code;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasic {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // inserting elements
        map.put("India", 5);
        map.put("USA", 9);
        map.put("Switzerland", 1);

        System.out.println("HashMap is : " + map);

        // searching
        System.out.println("Is India present " + map.containsKey("India"));
        System.out.println("Is 5 present " + map.containsValue(5));
        System.out.println("Get value for India " + map.get("India"));
        System.out.println("Get value for china " + map.get("China"));

        // deletion
        map.remove("USA");
        System.out.println("After deletion : " + map);

        // iteration Way:1
        for (String key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }
        // way :2
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + "=" + e.getValue());
        }
    }
}
