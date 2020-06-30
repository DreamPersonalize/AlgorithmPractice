package interview;

/**
 * 第一次面试——第一题
 * 
 * @author Perso
 * @date 2020/06/30
 * @Description 不借助临时变量，交换两个变量的值
 */
public class OneView {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap2(a, b);
        // System.out.println(a);
        // System.out.println(b);

    }

    /**
     * 采用加减法，不用多言
     * 
     * @param a
     * @param b
     */
    private static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    /**
     * 采用位异或 0^0=1 0^1=1 1^0=1 1^1=0
     * 
     * @param a
     * @param b
     */
    private static void swap2(int a, int b) {
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(a);
        System.out.println(b);
    }

}
