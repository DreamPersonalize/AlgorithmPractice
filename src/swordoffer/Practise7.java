package swordoffer;

import java.util.ArrayList;

/**
 * ������ 쳲���������
 * 
 * @author Perso
 * @date 2020/06/23
 * @Description 쳲��������С�����һ������n�����쳲�������n���ֵ��n<39
 */
public class Practise7 {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fibonacci2(n, 0, 1));
        System.out.println(Fibonacci(n));
    }

    /**
     * ������̬�滮��ӻ�ȡ
     * 
     * @param n
     * @return
     */
    private static int Fibonacci(int n) {
        ArrayList<Integer> Lst = new ArrayList<Integer>();
        Lst.add(0);
        Lst.add(1);
        int cur = n;
        // �б��0��ʼ
        while (cur > 1) {
            Lst.add(Lst.get(Lst.size() - 1) + Lst.get(Lst.size() - 2));
            cur--;
        }
        return Lst.get(n);
    }

    /**
     * ���õݹ���õ�n��쳲�������
     * 
     * @param n
     * @param acc1
     * @param acc2
     * @return
     */
    private static int Fibonacci2(int n, int acc1, int acc2) {
        if (n == 0)
            return 0;
        if (n == 1)
            return acc2;
        else
            return Fibonacci2(n - 1, acc2, acc2 + acc1);
    }
}
