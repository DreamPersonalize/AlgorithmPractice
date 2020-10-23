package interview;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 第一次面试--第五道算法
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
     * 罗马数相加方法
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
     * 罗马转数字 
     * 1 创建一个Map建立罗马符号和数字映射表 
     * 2 创建一个Map建立特殊情况字符要处理的罗马符号 
     * 3 for循环根据输入从映射表中获取数字求和就可以了 
     * 4 遇到特殊字符就从映射表中找出要特殊处理对应的罗马符号表，进行逻辑运算就行
     * 
     * @param s
     * @return
     */
    private static int romanToInt(String s) {
        // 罗马符号数字映射表
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
        // // 特殊情况映射字符，便于扩展
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
        // // 通过映射表求和
        // for (int i = 0; i < s.length() - 1; i++) {
        // char c = s.charAt(i);
        // // 非罗马字符跳过
        // if (!romeNum.containsKey(c)) {
        // continue;
        // }
        // sum += romeNum.get(c);
        // if (i == 0) {
        // continue;
        // }
        // // 处理特殊情况
        // if (specialMap.containsKey(c)) {
        // char val = specialMap.get(c);
        // if (s.charAt(i - 1) == val) {
        // // 遍历的时候多加一次左边数，特殊字符原本就是多加了一次，所以*2
        // sum -= romeNum.get(val) * 2;
        // }
        // }
        // }
        // // 处理上限
        // if (sum < 1) {
        // return 1;
        // }
        // return sum;

        int length = s.length();
        if (length == 0) {
            return 0;
        }
        int[] roman = new int[256];
        // 以下为赋值操作
        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;
        int result = roman[s.charAt(0)];
        for (int i = 1; i < s.length(); i++) {
            // 都加上
            int temp = roman[s.charAt(i)];
            int last = roman[s.charAt(i - 1)];
            result += temp;
            // 判断额外增加的比如4 执行到现在结果为6要减去2*1
            if (last < temp) {
                result -= last << 1;
            }
        }

        return result;
    }

    /**
     * 数字转罗马
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
