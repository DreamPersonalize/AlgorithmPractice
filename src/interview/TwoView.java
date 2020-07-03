package interview;

/**
 * ���Լ��
 * @author Perso
 * @date 2020/07/03
 * @Description
 */
public class TwoView {

    public static void main(String[] args) {
        int a = 12;
        int b = 16;
        System.out.println(oneGCD(a, b));
        System.out.println(twoGCD(a, b));
        System.out.println(threeGCD(a, b));
    }

    /**
     * ŷ������㷨
     * �ݹ�˼�룺շת���
     * @param a
     * @param b
     * @return
     */
    private static int oneGCD(int a, int b) {
        if (a < b) {
            a ^= b;
            b ^= a;
            a ^= b;
        }
        return a % b == 0 ? b : oneGCD(b, a % b);
    }

    /**
     * ����������ⷨ
     * ȡС����һֱ����ֱ����������������
     * @param a
     * @param b
     * @return
     */
    private static int twoGCD(int a, int b) {
        int t;
        if (a < b) {
            t = a;
        } else {
            t = b;
        }
        while (a % t != 0 || b % t != 0) {
            t--;
        }
        return t;
    }

    /**
     * �����������������
     * @param a
     * @param b
     * @return
     */
    private static int threeGCD(int a, int b) {
        int i = 0, x;
        while (a % 2 == 0 & b % 2 == 0) {
            a /= 2;
            b /= 2;
            i++;
        }
        // ��������aΪ���ģ�ֻ�ܿ��������
        if (a < b) {
            a ^= b;
            b ^= a;
            a ^= b;
        }
        while (a != (a - b)) {
            x = a - b;
            a = (b > x) ? b : x;
            b = (b < x) ? b : x;

        }
        if (i == 0) {
            return 0;
        } else {
            return (int)Math.pow(2, i) * b;
        }
    }
}
