package swordoffer;

/**
 * ����9 ��̬��̨��
 * 
 * @author Zhang
 * @date 2020/06/23
 * @Description һֻ����һ�ο�������1��̨�ף�Ҳ��������2��......��Ҳ��������n���������������һ��n��̨�׹��ж�����������
 */
public class Practise9 {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(jumpFloor(n));

    }

    /**
     * ̰���㷨
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
