package interview;

import java.util.HashMap;
import java.util.Map;

/**
 * ��һ������--������㷨
 * @author Perso
 * @date 2020/07/01
 * @Description
 */
public class FiveView {

    public static void main(String[] args) {

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
    private int romanToInt(String s) {
        // �����������ӳ���
        Map<Character, Integer> romeNum = new HashMap<Character, Integer>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };

        // �������ӳ���ַ���������չ
        Map<Character, Character> specialMap = new HashMap<Character, Character>() {
            {
                put('V', 'I');
                put('X', 'I');
                put('L', 'X');
                put('C', 'X');
                put('D', 'C');
                put('M', 'C');

            }
        };

        int sum = 0;
        // ͨ��ӳ������
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            // �������ַ�����
            if (!romeNum.containsKey(c)) {
                continue;
            }
            sum += romeNum.get(c);
            if (i == 0) {
                continue;
            }
            // �����������
            if (specialMap.containsKey(c)) {
                char val = specialMap.get(c);
                if (s.charAt(i - 1) == val) {
                    // ������ʱ����һ��������������ַ�ԭ�����Ƕ����һ�Σ�����*2
                    sum -= romeNum.get(val) * 2;
                }
            }
        }
        // ��������
        if (sum < 1) {
            return 1;
        }
        return sum;
    }

    /**
     * ����ת����
     * @param num
     * @return
     */
    public String intToRoman(int num) {
        Map<Integer, String> lookup = new HashMap<Integer, String>() {
            {
                put(1000, "M");
                put(900, "CM");
                put(500, "D");
                put(400, "CD");
                put(100, "C");
                put(90, "XC");
                put(50, "X");
                put(40, "XL");
                put(10, "X");
                put(9, "IX");
                put(5, "V");
                put(4, "IV");
                put(1, "I");
            }
        };
        StringBuilder res = new StringBuilder();

        for (Integer key : lookup.keySet()) {
            int n = num / key;
            if (n == 0) {
                continue;
            }
            for (int i = n; i > 0; i++) {
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
