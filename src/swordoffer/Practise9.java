package swordoffer;

/**
 * 试题9 变态跳台阶
 * 
 * @author Zhang
 * @date 2020/06/23
 * @Description 一只青蛙一次可以跳上1级台阶，也可以跳上2级......它也可以跳上n级。求该青蛙跳上一个n级台阶共有多少种跳法？
 */
public class Practise9 {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(jumpFloor(n));

    }

    /**
     * 贪心算法
     * 
     * @param n
     * @return
     * @Description
     */
    private static int jumpFloor(int n) {
        int sum = 1;
        for (int i = 1; i < n; i++) {
            // sum = sum * 2
            sum = sum << 1;
        }
        return sum;
    }

}
