package swordoffer;

/**
 * 试题十 矩形覆盖
 * 
 * @author Zhang
 * @date 2020/06/24
 * @Description 我们可以用2*1的小矩形横着或竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class Practice10 {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(rectCover(n));

    }

    /**
     * 总结归纳：斐波那契数列，使用递归调用
     * 
     * @param n
     * @return
     */
    private static int rectCover(int n) {
        if (n < 3) {
            return n;
        } else {
            return rectCover(n - 1) + rectCover(n - 2);
        }
    }

}
