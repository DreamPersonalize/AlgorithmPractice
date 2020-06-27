package swordoffer;

import java.util.Arrays;

import swordoffer.util.TreeNode;

/**
 * ������ �ؽ�������
 * 
 * @author Zhang
 * @date 2020/06/22
 * @Description ����ĳ��������ǰ���������������Ľ�������ع����ö����������������ǰ���������������Ľ���ж�����
 *              �ظ������֡����������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
 */
public class Practise4 {

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode node = reConstructBinaryTree(pre, in);
        neOrderTreeNode(node);

    }

    /**
     * �ݹ鹹��������
     * 
     * @����˼·������ǰ��������ʣ���һ��Ԫ�ر�Ȼ��Ϊroot����ô����������У�root���Ϊ��������root�ұ�Ϊ���������������������ĸ����ڶ�ǰ������е�Ԫ�طָ�ݹ飬���ʵ���ع�
     * @param pre
     * @param in
     * @return
     */
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        // �ص㣺Arrays.copOfRange ���鸴�Ʒ���
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length),
                    Arrays.copyOfRange(in, i + 1, in.length));
                break;
            }
        }
        return root;
    }

    /**
     * �������
     * 
     * @param node
     */
    public static void neOrderTreeNode(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        neOrderTreeNode(node.left);
        neOrderTreeNode(node.right);
    }

}
