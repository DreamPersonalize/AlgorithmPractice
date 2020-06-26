package swordoffer;

/**
 * ������ ��ת�������С����
 * 
 * @author Zhang
 * @date 2020/06/22
 * @Description ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
 *              ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1.NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 */
public class Practise6 {

    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 5, 9, 6, 7};
        // System.out.println(solution(arr));
        System.out.println(minNumberInRotateArray(arr));
    }

    // ��ͨ��������ʱn
    private static int solution(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // ���ֲ��ҷ���ʱ�临�Ӷȣ�log(n)
    public static int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int target = right;
            int mid = (left + right) / 2;
            if (array[mid] > array[target]) {
                left = mid + 1;
            } else if (array[mid] < array[target]) {
                right = mid;
            } else {
                while (right > left) {
                    if (array[right] < array[right - 1]) {
                        return array[right];
                    }
                    right--;
                }
            }

        }
        return array[left];
    }

}
