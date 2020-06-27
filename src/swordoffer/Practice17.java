package swordoffer;

import swordoffer.util.TreeNode;

/**
 * �����ӽṹ
 * 
 * @author Perso
 * @date 2020/06/27
 * @Description �������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
 * @Tip �ӽṹ���壺��A����B�ĸ������ȣ�������A������������B����������ȣ���A������������B�����������
 */
public class Practice17 {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.right = new TreeNode(4);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(3);

        if (HasSubtree(root1, root2)) {
            System.out.println("���ӽṹ");
        } else {
            System.out.println("�����ӽṹ   ");
        }

    }

    // ��������
    private static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        // ����ҵ������������ڵ�ֵ��ͬ�Ľڵ㣬�����ӽṹ�ж�
        if (root1.val == root2.val) {
            if (judge(root1, root2)) {
                return true;
            }
        }
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    /**
     * �ж��Ƿ�Ϊ�������ӽṹ
     * 
     * @param root
     * @param subtree
     * @return
     */
    private static boolean judge(TreeNode root, TreeNode subtree) {
        // ����ӽṹ�ȱ����꣬����ȫ��ƥ��
        if (subtree == null) {
            return true;
        }
        // ��������ȱ����꣬�����ƥ��
        if (root == null) {
            return false;
        }
        // �����ǰ�ڵ�ƥ�䣬�������������
        if (root.val == subtree.val) {
            return judge(root.left, subtree.left) && judge(root.right, subtree.right);
        }
        return false;
    }

}
