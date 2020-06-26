package swordoffer;

/**
 * 试题十三 调整数组顺序使奇数位于偶数前面
 * 
 * @author Zhang
 * @date 2020/06/25
 * @Description 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数谓语数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
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
     * 1.思想：顺次移动或相邻交换 2.i从左向右遍历，找到第一个偶数 3.j从i+1开始向后找，直到找到第一个奇数 4.将[i，....，j-1]的元素整体后移一位，最后将找到的奇数放入i位置，然后i++
     * 5.终止条件：J向后遍历查找失败
     * 
     * @return
     */
    private static void reOrderArray2(int[] a) {
        if (a == null || a.length <= 1) {
            return;
        }
        int i = 0, j;
        while (i < a.length) {
            // 遍历数组，让i指向偶数
            if (a[i] % 2 == 1) {
                i++;
            } else {
                j = i + 1;
                // 遍历数组，让j指向奇数
                while (a[j] % 2 == 0) {
                    if (j == a.length - 1) {
                        return;
                    }
                    j++;
                }
                // 让a[i]到a[j-1]向后移，将a[j]放入a[i]位置中
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
