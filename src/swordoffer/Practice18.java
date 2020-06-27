package swordoffer;

import swordoffer.util.TreeNode;

/**
 * ���������
 * 
 * @author Zhang
 * @date 2020/06/27
 * @Description ���������Ķ�����������任ΪԴ�������ľ���
 */
public class Practice18 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);
        System.out.println("��תǰ��");
        output(root);
        Mirror(root);
        System.out.println();
        System.out.println("��ת��");
        output(root);

    }

    /**
     * �ݹ����
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
