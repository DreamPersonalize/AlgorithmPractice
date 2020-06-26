package swordoffer;

/**
 * ����8 ��̨��
 * 
 * @author Zhang
 * @date 2020/06/23
 * @Description һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n��̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�����
 */
public class Practise8 {

    public static void main(String[] args) {
        System.out.println(solution(3, 0));
        System.out.println(jumpFloor(3));
    }

    /**
     * �Լ�д��
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
        // ��������û��ִ��
        if (n >= two) {
            solution(n - 1, count++);
            solution(n - 2, count + 2);
        }

        return count;
    }

    /**
     * ���õݹ�˼��
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
        // 쳲���������
        return jumpFloor(target - 1) + jumpFloor(target - 2);
    }

}
