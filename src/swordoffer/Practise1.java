package swordoffer;

/**
 * 试题一 二维数组中的查找
 * 
 * @author Zhang
 * @date 2020/06/20
 * @Description 在一个二维数组中（每个一维数组的长度相同），每一行按照从上到下递增的顺序排序，每一列都按照从上到下递增的顺序排序。 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Practise1 {

    public static void main(String[] args) {
        int[][] testData = {{2, 3, 4}, {3, 4, 5}, {4, 5, 6}};
        int num = 6;
        System.out.println(check(testData, num));
    }

    /**
     * 判断整数是否在数组之中
     * 
     * @param arr
     *            数组
     * @param num
     *            整数
     * @return
     */
    public static boolean check(int[][] arr, int num) {
        // 最笨的方法
        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    return true;
                }
            }
        }*/
        // 答案
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = rows - 1, j = 0; i >= 0 && j < cols;) {
            if (num == arr[i][j]) {
                return true;
            }
            // 先比较第一列，确定在第几列
            if (num < arr[i][j]) {
                i--;
                continue;
            }
            // 再比较这一行，确定数值
            if (num > arr[i][j]) {
                j++;
                continue;
            }
        }
        return false;
    }

}
