package swordoffer;

/**
 * 试题12 数值的整次方
 * 
 * @author Zhang
 * @date 2020/06/24
 * @Description 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。保证base和exponent不同时为零。
 */
public class Practisee12 {

    public static void main(String[] args) {
        double base = 2;
        int exponent = -2;
        System.out.println(solution(base, exponent));
        System.out.println(power(base, exponent));
    }

    /**
     * 使用累乘:时间复杂度为O(n)
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
     * 使用递归：时间复杂度为O(log(n)) 例如2^4 = 2^2*2^2 ---- 2^5 = 2^2*2^2*2
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
        // 当n为奇数时多乘一次底数
        if ((n & 1) == 1) {
            result *= base;
        }
        if (exponent < 0) {
            result = 1 / result;
        }
        return result;
    }

}
