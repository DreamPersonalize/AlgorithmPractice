package swordoffer;

import swordoffer.util.TreeNode;

/**
 * 镜像二叉树
 * 
 * @author Zhang
 * @date 2020/06/27
 * @Description 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class Practice18 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);
        System.out.println("反转前：");
        output(root);
        Mirror(root);
        System.out.println();
        System.out.println("反转后：");
        output(root);

    }

    /**
     * 递归调用
     * 
     * @time O(n)
     * @store O(n)
     * @param root
     */
    private static void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null || root.right != null) {
            TreeNode tempNode = root.left;
            root.left = root.right;
            root.right = tempNode;
        }
        Mirror(root.left);
        Mirror(root.right);
    }

    private static void output(TreeNode root) {
        if (root == null) {
            return;
        }
        output(root.left);
        System.out.print(root.val);
        output(root.right);
    }

}
