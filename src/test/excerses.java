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

        // ArrayList ��ѯ���١��̲߳���ȫ��������ʡ�����ɾ�����۸�
        List<Integer> arr = new ArrayList<Integer>();

        // Vector �̰߳�ȫ�����ܿ�����
        List<Integer> vector = new Vector<Integer>();

        // Vector������� synchronizedList
        List<Integer> syncArr = Collections.synchronizedList(arr);

        // Vector������� CopyOnWriteArrayList �ڴ�ռ�øߡ����ݷ�ʵʱ
        List<Integer> cowa = new CopyOnWriteArrayList<Integer>();

        // LinkedList ˫��������������ʡ���ѯ��
        List<Integer> linkList = new LinkedList<Integer>();

        // HashMap
        Map<String, Integer> hashMap = new HashMap<String, Integer>();

        // HashTable
        Map<String, Integer> hashTable = new Hashtable<String, Integer>();

        // ConcurrentHashMap �ֶ���
        Map<String, Integer> concurrent = new ConcurrentHashMap<String, Integer>();

        // LinkedHashMap
        Map<String, Integer> linkHashMap = new LinkedHashMap<String, Integer>();

        // WeakHashMap
        Map<String, Integer> weakHashMap = new WeakHashMap<String, Integer>();
    }
}
