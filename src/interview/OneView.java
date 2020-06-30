package interview;

/**
 * ��һ�����ԡ�����һ��
 * 
 * @author Perso
 * @date 2020/06/30
 * @Description ��������ʱ��������������������ֵ
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
     * ���üӼ��������ö���
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
     * ����λ��� 0^0=1 0^1=1 1^0=1 1^1=0
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
