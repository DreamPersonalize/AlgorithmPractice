package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class excerses {

    public static void main(String[] args) {
        int i = 3;
        System.out.println(i << 4);

        // ArrayList 查询快速、线程不安全、随机访问、插入删除代价高
        List<Integer> arr = new ArrayList<Integer>();

        // Vector 线程安全、性能开销大
        List<Integer> vector = new Vector<Integer>();

        // Vector替代方案 synchronizedList
        List<Integer> syncArr = Collections.synchronizedList(arr);

        // Vector替代方案 CopyOnWriteArrayList 内存占用高、数据非实时
        List<Integer> cowa = new CopyOnWriteArrayList<Integer>();

        // LinkedList 双向链表、非随机访问、查询慢
        List<Integer> linkList = new LinkedList<Integer>();

        // HashMap
        Map<String, Integer> hashMap = new HashMap<String, Integer>();

        // HashTable
        Map<String, Integer> hashTable = new Hashtable<String, Integer>();

        // ConcurrentHashMap 分段锁
        Map<String, Integer> concurrent = new ConcurrentHashMap<String, Integer>();

        // LinkedHashMap
        Map<String, Integer> linkHashMap = new LinkedHashMap<String, Integer>();

        // WeakHashMap
        Map<String, Integer> weakHashMap = new WeakHashMap<String, Integer>();
    }
}
