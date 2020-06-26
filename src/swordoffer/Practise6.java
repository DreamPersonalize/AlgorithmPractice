package swordoffer;

/**
 * 试题六 旋转数组的最小数字
 * 
 * @author Zhang
 * @date 2020/06/22
 * @Description 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 *              例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1.NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Practise6 {

    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 5, 9, 6, 7};
        // System.out.println(solution(arr));
        System.out.println(minNumberInRotateArray(arr));
    }

    // 普通遍历，耗时n
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

    // 二分查找法，时间复杂度：log(n)
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
