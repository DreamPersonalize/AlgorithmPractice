package swordoffer;

/**
 * ����ʮһ ��������1�ĸ���
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
     * �Լ�ʵ�֣���ʵ��ת�����ƣ����ǲ���+1�ѵ���
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
     * �𰸣����һ��������Ϊ0����ô�������������һλ��1.������ǰ����������һ����ôԭ�������������ұߵ�1�ͻ��Ϊ0��ԭ����1��������е��㶼����1����������λ�����ܵ�Ӱ�� һ���ɱ�
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
     * һ�д��룺Java�Դ�����
     * 
     * @param n
     * @return
     */
    private static int ddd(int n) {
        return Integer.bitCount(n);
    }
}
