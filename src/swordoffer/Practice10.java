package swordoffer;

/**
 * ����ʮ ���θ���
 * 
 * @author Zhang
 * @date 2020/06/24
 * @Description ���ǿ�����2*1��С���κ��Ż�����ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 */
public class Practice10 {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(rectCover(n));

    }

    /**
     * �ܽ���ɣ�쳲��������У�ʹ�õݹ����
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
