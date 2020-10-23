package interview;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * ��һ������--������㷨
 * @author Zhang
 * @date 2020/07/01
 * @Description
 */
public class FiveView {

    public static void main(String[] args) {
        String s1 = "IV";
        String s2 = "IX";
        System.out.println(s1 + " + " + s2 + " = " + romanAddtion(s1, s2));
    }

    /**
     * ��������ӷ���
     * @param s1
     * @param s2
     * @return
     */
    private static String romanAddtion(String s1, String s2) {
        System.out.println(romanToInt(s1));
        System.out.println(romanToInt(s2));
        int count = romanToInt(s1) + romanToInt(s2);
        System.out.println(count);
        String result = intToRoman(count);
        return result;

    }

    /**
     * ����ת���� 
     * 1 ����һ��Map����������ź�����ӳ��� 
     * 2 ����һ��Map������������ַ�Ҫ������������ 
     * 3 forѭ�����������ӳ����л�ȡ������;Ϳ����� 
     * 4 ���������ַ��ʹ�ӳ������ҳ�Ҫ���⴦���Ӧ��������ű������߼��������
     * 
     * @param s
     * @return
     */
    private static int romanToInt(String s) {
        // �����������ӳ���
        // Map<Character, Integer> romeNum = new HashMap<Character, Integer>() {
        // {
        // put('I', 1);
        // put('V', 5);
        // put('X', 10);
        // put('L', 50);
        // put('C', 100);
        // put('D', 500);
        // put('M', 1000);
        // }
        // };
        //
        // // �������ӳ���ַ���������չ
        // Map<Character, Character> specialMap = new HashMap<Character, Character>() {
        // {
        // put('V', 'I');
        // put('X', 'I');
        // put('L', 'X');
        // put('C', 'X');
        // put('D', 'C');
        // put('M', 'C');
        //
        // }
        // };
        //
        // int sum = 0;
        // // ͨ��ӳ������
        // for (int i = 0; i < s.length() - 1; i++) {
        // char c = s.charAt(i);
        // // �������ַ�����
        // if (!romeNum.containsKey(c)) {
        // continue;
        // }
        // sum += romeNum.get(c);
        // if (i == 0) {
        // continue;
        // }
        // // �����������
        // if (specialMap.containsKey(c)) {
        // char val = specialMap.get(c);
        // if (s.charAt(i - 1) == val) {
        // // ������ʱ����һ��������������ַ�ԭ�����Ƕ����һ�Σ�����*2
        // sum -= romeNum.get(val) * 2;
        // }
        // }
        // }
        // // ��������
        // if (sum < 1) {
        // return 1;
        // }
        // return sum;

        int length = s.length();
        if (length == 0) {
            return 0;
        }
        int[] roman = new int[256];
        // ����Ϊ��ֵ����
        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;
        int result = roman[s.charAt(0)];
        for (int i = 1; i < s.length(); i++) {
            // ������
            int temp = roman[s.charAt(i)];
            int last = roman[s.charAt(i - 1)];
            result += temp;
            // �ж϶������ӵı���4 ִ�е����ڽ��Ϊ6Ҫ��ȥ2*1
            if (last < temp) {
                result -= last << 1;
            }
        }

        return result;
    }

    /**
     * ����ת����
     * @param num
     * @return
     */
    public static String intToRoman(int num) {
        Map<Integer, String> lookup = new LinkedHashMap<>();
        lookup.put(1000, "M");
        lookup.put(900, "CM");
        lookup.put(500, "D");
        lookup.put(400, "CD");
        lookup.put(100, "C");
        lookup.put(90, "XC");
        lookup.put(50, "L");
        lookup.put(40, "XL");
        lookup.put(10, "X");
        lookup.put(9, "IX");
        lookup.put(5, "V");
        lookup.put(4, "IV");
        lookup.put(1, "I");

        StringBuilder res = new StringBuilder();

        for (Integer key : lookup.keySet()) {
            int n = num / key;
            if (n == 0)
                continue;
            for (int i = n; i > 0; i--) {
                res.append(lookup.get(key));
            }
            num -= n * key;
            if (num == 0) {
                break;
            }
        }
        return res.toString();
    }

}
