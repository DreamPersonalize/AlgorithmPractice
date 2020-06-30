package interview;

public class FiveView {

    public static void main(String[] args) {

    }

    private int romanToInt(String s) {
        int length = s.length();
        if (length == 0) {
            return 0;
        }
        // ����һ��ASCII����
        int[] roman = new int[256];
        // ��ֵ
        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;
        int result = roman[s.charAt(0)];
        for (int i = 0; i < s.length(); i++) {
            // ������
            int temp = roman[s.charAt(i)];
            int last = roman[s.charAt(i - 1)];
            result += temp;
            // �ж϶������ӵģ�����IV
            if (last < temp) {
                result -= last << 1;
            }
        }
        return result;
    }

}
