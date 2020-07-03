package interview;

/**
 * 最大公约数
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
     * 欧几里得算法
     * 递归思想：辗转相除
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
     * 连续整数检测法
     * 取小的数一直减，直到两个数都能整除
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
     * 公因数法（更相减损）
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
        // 交换保持a为最大的，只能看懂这个了
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
