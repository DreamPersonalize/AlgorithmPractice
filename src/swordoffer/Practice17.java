package swordoffer;

import swordoffer.util.TreeNode;

/**
 * 树的子结构
 * 
 * @author Perso
 * @date 2020/06/27
 * @Description 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * @Tip 子结构定义：树A和树B的根结点相等，并且树A的左子树和树B的左子树相等，树A的右子树和树B的右子树相等
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
            System.out.println("是子结构");
        } else {
            System.out.println("不是子结构   ");
        }

    }

    // 遍历大树
    private static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        // 如果找到了与子树根节点值相同的节点，进行子结构判断
        if (root1.val == root2.val) {
            if (judge(root1, root2)) {
                return true;
            }
        }
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    /**
     * 判断是否为大树的子结构
     * 
     * @param root
     * @param subtree
     * @return
     */
    private static boolean judge(TreeNode root, TreeNode subtree) {
        // 如果子结构先遍历完，代表全部匹配
        if (subtree == null) {
            return true;
        }
        // 如果大树先遍历完，则代表不匹配
        if (root == null) {
            return false;
        }
        // 如果当前节点匹配，则遍历左右子树
        if (root.val == subtree.val) {
            return judge(root.left, subtree.left) && judge(root.right, subtree.right);
        }
        return false;
    }

}
