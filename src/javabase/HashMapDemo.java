package javabase;

import java.util.HashMap;
import java.util.Map;

/**
 * hashmap�Ļ���ʹ��demo
 * @author Zhang
 * @date 2020/07/06
 * @Description
 */
public class HashMapDemo {

    public static void main(String[] args) {
        // ����hashmap����
        Map<String, Integer> map = new HashMap<String, Integer>();

        // �������
        map.put("zhang", 26);
        map.put("wang", 20);
        map.put("li", 22);
        map.put("zhang", 23);

        // ���ݼ�ֵ�Ի�ȡ����
        int value = map.get("li");
        System.out.println("key: li, value:" + value);

        // ��ȡmap�м�ֵ�Եĸ���
        int size = map.size();
        System.out.println("size of map : " + size);

        // �жϼ������Ƿ������Ϊkey�ļ�ֵ��
        boolean b1 = map.containsKey("233");
        boolean b2 = map.containsKey("wang");
        System.out.println("Does map's key have 233? " + b1);
        System.out.println("Does map's key have wang? " + b2);

        // �жϼ������Ƿ����ֵΪvalue�ļ�ֵ��
        boolean b3 = map.containsValue(15);
        boolean b4 = map.containsValue(23);
        System.out.println("Does map's value have 15?" + b3);
        System.out.println("Does map's value have 23?" + b4);

        // �жϼ����Ƿ�Ϊ��
        boolean empty = map.isEmpty();
        System.out.println("Is map null?" + empty);

        // ���ݼ�ֵɾ��
        int value2 = map.remove("li");
        System.out.println("remove li from map, li's value:" + value2);
        // �ж��Ƿ�ɾ����
        boolean b5 = map.containsKey("li");
        System.out.println("Does map's key have li?" + b5);

        // ���map
        map.clear();
        empty = map.isEmpty();
        System.out.println("is map null?" + empty);

    }

}
