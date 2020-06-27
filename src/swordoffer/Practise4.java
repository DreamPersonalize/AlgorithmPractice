package swordoffer;

import java.util.Arrays;

import swordoffer.util.TreeNode;

/**
 * 试题四 重建二叉树
 * 
 * @author Zhang
 * @date 2020/06/22
 * @Description 输入某二叉树的前序遍历和中序遍历的结果，请重构出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含
 *              重复的数字。例如输入的前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class Practise4 {

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode node = reConstructBinaryTree(pre, in);
        neOrderTreeNode(node);

    }

    /**
     * 递归构建二叉树
     * 
     * @解题思路：根据前序遍历性质，第一个元素必然你为root，那么在中序遍历中，root左边为左子树，root右边为右子树，根据左右子树的个数在对前序遍历中的元素分割递归，便可实现重构
     * @param pre
     * @param in
     * @return
     */
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        // 重点：Arrays.copOfRange 数组复制方法
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
     * 后序遍历
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
