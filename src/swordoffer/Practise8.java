package swordoffer;

/**
 * 试题8 跳台阶
 * 
 * @author Zhang
 * @date 2020/06/23
 * @Description 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级台阶总共有多少种跳法（先后次序不同算不同结果）
 */
public class Practise8 {

    public static void main(String[] args) {
        System.out.println(solution(3, 0));
        System.out.println(jumpFloor(3));
    }

    /**
     * 自己写的
     * 
     * @param n
     * @param count
     * @return
     */
    private static int solution(int n, int count) {
        int two = 2;
        if (n == 1) {
            count++;
        }
        // 错误在于没有执行
        if (n >= two) {
            solution(n - 1, count++);
            solution(n - 2, count + 2);
        }

        return count;
    }

    /**
     * 利用递归思想
     * 
     * @param target
     * @return
     */
    private static int jumpFloor(int target) {
        int two = 2;
        if (target == 1) {
            return 1;
        }
        if (target == two) {
            return 2;
        }
        // 斐波那契数列
        return jumpFloor(target - 1) + jumpFloor(target - 2);
    }

}
