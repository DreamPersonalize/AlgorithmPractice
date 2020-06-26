package swordoffer;

/**
 * ����ʮ�� ��������˳��ʹ����λ��ż��ǰ��
 * 
 * @author Zhang
 * @date 2020/06/25
 * @Description ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����ν�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
 */
public class Practice13 {

    public static void main(String[] args) {
        int[] a = {1, 4, 3, 5, 2, 7, 6, 9};
        reOrderArray2(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    /**
     * 1.˼�룺˳���ƶ������ڽ��� 2.i�������ұ������ҵ���һ��ż�� 3.j��i+1��ʼ����ң�ֱ���ҵ���һ������ 4.��[i��....��j-1]��Ԫ���������һλ������ҵ�����������iλ�ã�Ȼ��i++
     * 5.��ֹ������J����������ʧ��
     * 
     * @return
     */
    private static void reOrderArray2(int[] a) {
        if (a == null || a.length <= 1) {
            return;
        }
        int i = 0, j;
        while (i < a.length) {
            // �������飬��iָ��ż��
            if (a[i] % 2 == 1) {
                i++;
            } else {
                j = i + 1;
                // �������飬��jָ������
                while (a[j] % 2 == 0) {
                    if (j == a.length - 1) {
                        return;
                    }
                    j++;
                }
                // ��a[i]��a[j-1]����ƣ���a[j]����a[i]λ����
                int tmp = a[j];
                while (j > i) {
                    a[j] = a[j - 1];
                    j--;
                }
                a[i] = tmp;
            }

        }
    }
}
