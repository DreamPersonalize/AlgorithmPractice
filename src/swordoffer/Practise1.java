package swordoffer;

/**
 * ����һ ��ά�����еĲ���
 * 
 * @author Zhang
 * @date 2020/06/20
 * @Description ��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�а��մ��ϵ��µ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������ �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 */
public class Practise1 {

    public static void main(String[] args) {
        int[][] testData = {{2, 3, 4}, {3, 4, 5}, {4, 5, 6}};
        int num = 6;
        System.out.println(check(testData, num));
    }

    /**
     * �ж������Ƿ�������֮��
     * 
     * @param arr
     *            ����
     * @param num
     *            ����
     * @return
     */
    public static boolean check(int[][] arr, int num) {
        // ��ķ���
        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    return true;
                }
            }
        }*/
        // ��
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = rows - 1, j = 0; i >= 0 && j < cols;) {
            if (num == arr[i][j]) {
                return true;
            }
            // �ȱȽϵ�һ�У�ȷ���ڵڼ���
            if (num < arr[i][j]) {
                i--;
                continue;
            }
            // �ٱȽ���һ�У�ȷ����ֵ
            if (num > arr[i][j]) {
                j++;
                continue;
            }
        }
        return false;
    }

}
