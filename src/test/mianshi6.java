package test;

import java.util.HashMap;
import java.util.Map;

public class mianshi6 {

    static void setname(Map map) {
        map.put("name", "BBB");
    }

    public static void main(String[] args) {
        Map map = new HashMap<String, String>();
        map.put("name", "AAA");
        setname(map);
        System.out.println(map.get("name"));

    }

}
