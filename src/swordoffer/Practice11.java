package swordoffer;

/**
 * 试题十一 二进制中1的个数
 * 
 * @author Perso
 * @date 2020/06/25
 * @Description
 */
public class Practice11 {

    public static void main(String[] args) {
        int n = -1;
        System.out.println(solution(n));
        System.out.println(NumberOf1(n));
        System.out.println(ddd(n));
    }

    /**
     * 自己实现：能实现转二进制，但是补码+1难到了
     * 
     * @param number
     * @return
     */
    private static int solution(int num) {
        int count = 0;
        int number = Math.abs(num);
        StringBuffer bf = new StringBuffer("");
        while (number / 2 != 0) {
            if (number % 2 == 0) {
                bf.append(0);
            } else {
                bf.append(1);
            }
            number = number / 2;
        }
        bf.append(1);
        bf.reverse();
        for (int i = 0; i < bf.length(); i++) {
            if (bf.charAt(i) == '1') {
                count++;
            }
        }
        if (num < 0) {
            int target = 8 - bf.length();
            count = target;
            StringBuffer bf2 = new StringBuffer();
            for (int i = 0; i < target; i++) {
                bf2.append("1");
            }
            for (int i = 0; i < bf.length(); i++) {
                if (bf.charAt(i) == '1') {
                    bf2.append("0");
                } else {
                    bf2.append("1");
                    count++;
                }
            }

            System.out.println(bf2.toString());
        } else {
            System.out.println(bf.toString());

        }

        return count;
    }

    /**
     * 答案：如果一个整数不为0，那么这个整数至少有一位是1.如果我们把这个整数减一，那么原来处在整数最右边的1就会变为0，原来在1后面的所有的零都会变成1。其余所有位将不受到影响 一脸蒙蔽
     * 
     * @param n
     * @return
     */
    private static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    /**
     * 一行代码：Java自带方法
     * 
     * @param n
     * @return
     */
    private static int ddd(int n) {
        return Integer.bitCount(n);
    }
}
