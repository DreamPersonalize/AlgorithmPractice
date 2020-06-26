package swordoffer;

import swordoffer.util.ListNode;

/**
 * 试题十四 链表中倒数第K个结点
 * 
 * @author Zhang
 * @date 2020/06/25
 * @Description 输入一个链表，输出该链表中倒数第k个结点。
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
     * 核心思想：快慢指针
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
