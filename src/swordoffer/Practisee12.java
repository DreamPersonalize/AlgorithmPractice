package swordoffer;

/**
 * ����12 ��ֵ�����η�
 * 
 * @author Zhang
 * @date 2020/06/24
 * @Description ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η�����֤base��exponent��ͬʱΪ�㡣
 */
public class Practisee12 {

    public static void main(String[] args) {
        double base = 2;
        int exponent = -2;
        System.out.println(solution(base, exponent));
        System.out.println(power(base, exponent));
    }

    /**
     * ʹ���۳�:ʱ�临�Ӷ�ΪO(n)
     * 
     * @param base
     * @param exponent
     * @return
     */
    private static double solution(double base, int exponent) {
        double result = 1.0;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }
        if (exponent < 0) {
            result = 1 / result;
        }
        return result;
    }

    /**
     * ʹ�õݹ飺ʱ�临�Ӷ�ΪO(log(n)) ����2^4 = 2^2*2^2 ---- 2^5 = 2^2*2^2*2
     * 
     * @return
     */
    private static double power(double base, int exponent) {
        int n = Math.abs(exponent);
        double result = 0.0;
        if (n == 0) {
            return 1.0;
        }
        if (n == 1) {
            return base;
        }
        result = power(base, n >> 1);
        result *= result;
        // ��nΪ����ʱ���һ�ε���
        if ((n & 1) == 1) {
            result *= base;
        }
        if (exponent < 0) {
            result = 1 / result;
        }
        return result;
    }

}
