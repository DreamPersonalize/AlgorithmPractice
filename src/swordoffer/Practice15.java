package swordoffer;

import swordoffer.util.ListNode;

/**
 * 反转链表
 * 
 * @author Perso
 * @date 2020/06/26
 * @Description 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Practice15 {

    public static void main(String[] args) {
        ListNode ns = new ListNode(1);
        ns.Add(2);
        ns.Add(5);
        ns.Add(4);
        ns.Add(9);
        ns.Add(7);
        ns.Add(8);
        reverseList(ns).putout();
    }

    /**
     * 核心思想：引用反转 通过pre、head、next创造，pre和head互换，pre和next移动达成目标
     * 
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

}
