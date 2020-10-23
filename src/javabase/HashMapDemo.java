package javabase;

import java.util.HashMap;
import java.util.Map;

/**
 * hashmap的基本使用demo
 * @author Zhang
 * @date 2020/07/06
 * @Description
 */
public class HashMapDemo {

    public static void main(String[] args) {
        // 声明hashmap对象
        Map<String, Integer> map = new HashMap<String, Integer>();

        // 添加数据
        map.put("zhang", 26);
        map.put("wang", 20);
        map.put("li", 22);
        map.put("zhang", 23);

        // 根据键值对获取数据
        int value = map.get("li");
        System.out.println("key: li, value:" + value);

        // 获取map中键值对的个数
        int size = map.size();
        System.out.println("size of map : " + size);

        // 判断集合中是否包含键为key的键值对
        boolean b1 = map.containsKey("233");
        boolean b2 = map.containsKey("wang");
        System.out.println("Does map's key have 233? " + b1);
        System.out.println("Does map's key have wang? " + b2);

        // 判断集合中是否包含值为value的键值对
        boolean b3 = map.containsValue(15);
        boolean b4 = map.containsValue(23);
        System.out.println("Does map's value have 15?" + b3);
        System.out.println("Does map's value have 23?" + b4);

        // 判断集合是否为空
        boolean empty = map.isEmpty();
        System.out.println("Is map null?" + empty);

        // 根据键值删除
        int value2 = map.remove("li");
        System.out.println("remove li from map, li's value:" + value2);
        // 判断是否删除了
        boolean b5 = map.containsKey("li");
        System.out.println("Does map's key have li?" + b5);

        // 清空map
        map.clear();
        empty = map.isEmpty();
        System.out.println("is map null?" + empty);

    }

}
