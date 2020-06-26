package swordoffer;

import swordoffer.util.ListNode;

/**
 * ����ʮ�� �����е�����K�����
 * 
 * @author Zhang
 * @date 2020/06/25
 * @Description ����һ����������������е�����k����㡣
 */
public class Practice14 {

    public static void main(String[] args) {
        ListNode ns = new ListNode(1);
        ns.Add(2);
        ns.Add(5);
        ns.Add(4);
        ns.Add(9);
        ns.Add(7);
        ns.Add(8);
        int k = 3;
        System.out.println(findKthToTail(ns, k).val);
    }

    /**
     * ����˼�룺����ָ��
     * 
     * @param head
     * @param k
     * @return
     */
    public static ListNode findKthToTail(ListNode head, int k) {
        if (head == null || k == 0) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

}
